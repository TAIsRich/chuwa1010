1.
the volatile modifier guarantees that any thread that reads a field will see the most recently written value
2.
3 ways:
I:create MyThread to extend Thread, override run()
Thread t1 = new MyThread();
class MyThread extends Thread {
    public void run() {
        System.out.println("t1 is now running.");
    }
}
t1.start();

II: implement Runnable()

Thread t2 = new Thread(new MyRunnable());
class MyRunnable implements Runnable() {
    public void run() {
        System.out.println("t2 is now running.");
    }
}
//Thread t2 = new Thread(() -> System.out.println("t2 is now running."));
t2.start();

III: implements Callable(); only use Callable in thread pool
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Start new thread using Callable";
    }
}

Callable<String> task = new MyCallable();
ExecutorService executor = Executors.newFixedThreadPool(4);
Future<String> future = executor.submit(task);
...
String res = future.get();

3.
Both interfaces are designed to represent a task that can be run by multiple threads.
We can run Runnable tasks using the Thread class or ExecutorService, whereas we can only run Callables using the latter.
The Runnable interface is a functional interface and has a single run() method that doesn't accept any parameters or return any values.
The Callable interface is a generic interface containing a single call() method that returns a generic value V:
The result of call() method is returned within a Future object:

4.
t.start() : create a thread and run it
t.run(): run current thread

5.
In the first approach, Our class always extends Thread class. There is no chance of extending any other class.
Hence we are missing Inheritance benefits.
In the second approach, while implementing Runnable interface we can extends any other class.
Hence we are able to use the benefits of Inheritance.
Because of the above reasons, implementing Runnable interface approach is recommended than extending Thread class.

6.
new runnable running waiting timed_waiting blocked terminated

7.
The major difference is that wait() releases the lock while sleep() doesn't release any lock while waiting.
wait() is used for inter-thread communication while sleep() is used to introduce a pause on execution, generally.

8.
Deadlock in Java is a condition where two or more threads are blocked forever, waiting for each other.
This usually happens when multiple threads need the same locks but obtain them in different orders.

9.
notify() wait()
notifyAll()

class OddEvenPrinter {
    public static final Object monitor = new Object();
    public static int value = 1;
    Thread t1 = new Thread(new MyRunnable());
    Thread t2 = new Thread(new MyRunnable());
    t1.start();
    t2.start();
}

class MyRunnable implements Runnable {
    public void run() {
        synchronized(monitor) {
            while(value <= 10) {
                System.out.println(Thread.currentThread().getName() + ":" + value++);
                monitor.notify();
                try {
                    monitor.wait();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

10.
Join method in Java allows one thread to wait until another thread completes its execution.

11.
A yield() method is a static method of Thread class and it can stop the currently executing thread
and will give a chance to other waiting threads of the same priority.
 If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

12.
A thread pool manages a set of anonymous threads that perform work on request.

13.

A framework having a bunch of components that are used for managing worker threads efficiently is referred to as Executor Framework
SingleThreadExecutor 仅单线程执行的线程池
FixedThreadPool      线程数固定的线程池
CachedThreadPool     线程数根据任务动态调整的线程池

ExecutorService es = Executors.newSingleThreadExecutor();
ExecutorService es = Executors.newFixedThreadPool(4);
ExecutorService es = Executors.newCachedThreadPool();

14.
The shutdown() method will allow previously submitted tasks to execute before terminating,
while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

15.
AtomicBoolean AtomicInteger AtomicLong
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.
It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable.

16.
CopyOnWriteArrayList ConcurrentHashMap CopyOnWriteArraySet
Java introduces Concurrent Collections which not only overcome the multi-threading environment limitation
but also enhances the Java to perform with multiple threads data.

17.
ReentrantLock ReadWriteLock StampedLock

18.
Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.

19.
It is used to represent the result of an asynchronous computation. The interface provides the methods
to check if the computation is completed or not, to wait for its completion, and to retrieve the result of the computation.
when use get(), have to block current thread ro wait for result

A completableFuture is used for asynchronous programming. Asynchronous programming means writing non-blocking code.
It runs a task on a separate thread than the main application thread and notifies the main thread about its progress, completion or failure.

Using CompletableFutures, you can do something with the result of the operation without actually blocking a thread to wait for the result

20.

The ThreadLocal class is used to create thread local variables which can only be read and written by the same thread.
For example, if two threads are accessing code having reference to same threadLocal variable then each thread will not see any modification to threadLocal variable done by other thread.

22.
What are the benefits of multithreading?
Allow the program to run continuously even if part of it is blocked
Improve performance
Increase use of CPU resource and reduce cost of maintenance
If an exception occurs in a single thread, it will not affect other threads as threads are independent

What is Thread in Java?
Threads are basically the lightweight and smallest unit of processing that can be managed independently by a scheduler.
Threads are referred to as parts of a process. It is considered the simplest way to take advantage of multiple CPUs available in a machine.
They share the common address space and are independent of each other.

What's the difference between User thread and Daemon thread?
User Thread                                               Daemon thread
JVM wait for it to finish before terminating it           JVM doesn't wait
created bu user                                           created by JVM
are used for critical task                                do some supporting task not critical
high priority                                             low priority: garbage collection, releasing memory

What do you mean by garbage collection?
Garbage collection is basically a process of managing memory automatically.
It uses several GC algorithms among which the popular one includes Mark and Sweep.
The process includes three phases i.e., marking, deletion, and compaction/copying.
In simple words, a garbage collector finds objects that are no longer required by the program
and then delete or remove these unused objects to free up the memory space.

Explain volatile variables in Java?
A volatile variable is basically a keyword that is used to ensure and address the visibility of changes to variables
in multithreaded programming. This keyword cannot be used with classes and methods, instead can be used with variables.
 It is simply used to achieve thread-safety. If you mark any variable as volatile, then all the threads can read its value
 directly from the main memory rather than CPU cache, so that each thread can get an updated value of the variable.

What is the purpose of the finalize() method?
Finalize() method is basically a method of Object class specially used to perform cleanup operations on unmanaged resources just before garbage collection.
 It is not at all intended to be called a normal method. After the complete execution of finalize() method,
 the object gets destroyed automatically.

What is thread starvation?
Thread starvation is basically a situation or condition where a thread won’t be able to have regular access to shared resources
and therefore is unable to proceed or make progress. This is because other threads have high priority and occupy the
resources for too long. This usually happens with low-priority threads that do not get CPU for its execution to carry on.

What is Livelock? What happens when it occurs?
Similar to deadlock, livelock is also another concurrency problem. In this case, the state of threads changes between
one another without making any progress. Threads are not blocked but their execution is stopped due to the
unavailability of resources.

Can you start a thread twice?
No, it's not at all possible to restart a thread once a thread gets started and completes its execution.
Thread only runs once and if you try to run it for a second time, then it will throw a runtime exception i.e., java.lang.IllegalThreadStateException.

Explain context switching.
Context switching is basically an important feature of multithreading. It is referred to as switching of CPU from
one thread or process to another one. It allows multiple processes to share the same CPU. In context switching,
the state of thread or process is stored so that the execution of the thread can be resumed later if required.

What is CyclicBarrier and CountDownLatch?
CyclicBarrier: It is a tool to synchronize threads processing using some algorithm. It enables a set of threads to wait
for each other till they reach a common execution point or common barrier points, and then let them further continue
 execution. One can reuse the same CyclicBarrier even if the barrier is broken by setting it.

 CountDownLatch: It is a tool that enables main threads to wait until mandatory operations are performed and completed by
 other threads. In simple words, it makes sure that a thread waits until the execution in another thread completes
 before it starts its execution. One cannot reuse the same CountDownLatch once the count reaches 0.

23.
a.
public class OddEventPrinter {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try {
                        if (value < 11) {
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

b.
static class PrintRunnable implements Runnable {
      private final Lock lock = new ReentrantLock();
      private final Condition condition = lock.newCondition();
        @Override
        public void run() {
            lock.lock();
            try{
                while (value <= 10) {
                     System.out.println(Thread.currentThread().getName() + ": " + value++);
                     condition.signal();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }
            } finally {
              lock.unlock()
            }
        }
    }

    24.
    public class PrintNumber1 {
        private static int n = 1;

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> printNumber());
            Thread t2 = new Thread(() -> printNumber());
            Thread t3 = new Thread(() -> printNumber());

            t1.start();
            t2.start();
            t3.start();
        }

        private static synchronized void printNumber() {
            int count = 10;
            while (count-- > 0) {
                System.out.println(Thread.currentThread().getName() + ": " + n++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            PrintNumber1.class.notifyAll();
        }
    }


