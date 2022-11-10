package hw5.Q21.ExecutorFramework;

import java.util.*;
import java.util.concurrent.Executor;

public class CustomExecutor implements Executor {
    private static final int MAX_WORKER_NUMBERS = 30;
    private final Deque<Runnable> tasks = new LinkedList<>();
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<>());

    public  CustomExecutor(int num) {
        initializeWorkers(Math.min(num, MAX_WORKER_NUMBERS));
    }

    public void initializeWorkers(int num) {
        for (int i = 0; i < num; i++) {
            Worker worker = new Worker();
            workers.add(worker);
            new Thread(worker).start();
        }
    }

    @Override
    public void execute(Runnable task) {
        if (task == null) {
            throw new NullPointerException();
        }
        synchronized (tasks) {
            tasks.addLast(task);
            tasks.notify();
        }
    }

        public void shutdown() {
            for (Worker worker : workers) {
                worker.shutdown();
            }
        }

        public void addWorkers(int num) {
            synchronized (tasks) {
                if (num + workers.size() > MAX_WORKER_NUMBERS) {
                    num = MAX_WORKER_NUMBERS - workers.size();
                }
                initializeWorkers(num);
            }
        }

        public void removeWorker(int num) {
            synchronized (tasks) {
                if (num >= workers.size()) {
                    throw new IllegalArgumentException("exceed current worker size");
                }
                for (int i = 0; i < num; i++) {
                    Worker worker = workers.get(i);
                    if (worker != null) {
                        worker.shutdown();
                        workers.remove(i);
                    }
                }
            }
        }

        public int workerSize() {
            return workers.size();
        }

    class Worker implements Runnable {
        private volatile boolean running = true;

        @Override
        public void run() {
            Runnable task = null;
            while (running || task != null) {
                if (task != null) {
                    task.run();
                }
                synchronized (tasks) {
                    if (tasks.isEmpty() && running) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    task = tasks.isEmpty() ? null : tasks.removeFirst();
                }
            }
        }

        public void shutdown() {
            running = false;

            synchronized (tasks) {
                tasks.notify();
            }
        }
    }

}
