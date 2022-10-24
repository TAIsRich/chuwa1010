### 1. Explain volatile variables in java? (we also use it in Singleton)
Volatile values primarily arise in hardware access (memory-mapped I/O), 
where reading from or writing to memory is used to communicate with peripheral devices, and in threading, 
where a different thread may have modified a value.  

A volatile variable is basically a keyword that is used to ensure and address the visibility of changes to variables in multithreaded programming. 
This keyword cannot be used with classes and methods, instead can be used with variables. 
It is simply used to achieve thread-safety. 
If you mark any variable as volatile, then all the threads can read its value directly from the main memory rather than CPU cache, 
so that each thread can get an updated value of the variable.


### 2. How to create a new thread(Please also consider Thread Pool case)?
- Extends Thread Class
```aidl
public class MyThread extends Thread {
    @Override
    public void run() {
        //set the new thread's task
    }
}

Thread t = new MyThread();
t.start();
```

- Implements Runnable
```aidl
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}

// method 1
Thread t = new Thread(new MyRunnable());
t.start();

// method 2
MyRunnabble r1 = new MyRunnable();
MyRunnabble r2 = new MyRunnable();
MyRunnabble r3 = new MyRunnable();
MyRunnabble r4 = new MyRunnable();
MyRunnabble r5 = new MyRunnable();
ExecutorService executor = Executors.newFixedThreadPool(3);
pool.submit(r1);
pool.submit(r2);
pool.submit(r3);
pool.submit(r4);
pool.submit(r5);
```

- Implements Callable
```aidl
public class MyCallable implements Callable<String> {
    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return "Start new thread using Callable";
    }
}
```


### 3. Difference between Runnable and Callable
- runnable has no return;
- callable has return;


### 4. What is the diff between t.start() and t.run()?
- `t.start()` starts a new thread to execute the task(run()).
- `t.run()` executes the task in the current thread.


### 5. Which way of creating threads is better: Thread class or Runnable interface?
Implementing a Runnable interface is better.  
The method of extending Thread class can not extend other class. And we can extend other class when implementing Runnable interface.


### 6. What is the thread status?
- **NEW**: A thread that has not yet started is in this state.
- **RUNNABLE**: A thread executing in the Java virtual machine is in this state.
- **BLOCKED**: A thread that is blocked waiting for a monitor lock is in this state.
- **WAITING**: A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
- **TIMED_WAITING**: A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
- **TERMINATED**: A thread that has exited is in this state.


### 7. Difference between wait() and sleep() method
- `wait()`
    - still in running mode and uses CPU cycles
    - can be "woken up" by another thread calling `notify` on the monitor which is being waited on
    - must happen in a block synchronized on the monitor object
    - call `wait` on `Object` itself
- `sleep()`
    - does not consume any CPU cycles
    - cannot be "woken up"
    - call `sleep` on `Thread`.


### 8. What is deadlock?
A deadlock is when you have two or more processes that are each waiting for the other to finish.  
When this happens, neither one can continue and the program essentially stalls.  
The four necessary conditions for a deadlock situation to occur are **mutual exclusion**, **hold and wait**, **no preemption** and **circular set**.


### 9. How do threads communicate with each other?
**wait()**: This method causes the current thread to release the lock. This is done until a specific amount of time has passed or another thread calls the notify() or notifyAll() method for this object.  
**notify()**: This method wakes a single thread out of multiple threads on the current object’s monitor. The choice of thread is arbitrary.  
**notifyAll()**: This method wakes up all the threads that are on the current object’s monitor.


### 10. What is join() method?
`join()` allows one thread to wait until another thread completes its execution.  
If `t` is a Thread object whose thread is currently executing, then `t.join()` will make sure that `t` is terminated before the next instruction is executed by the program.

- Main thread call t.join()
- Main thread will stop and wait for thread t complets its task
- Main thread will continue after t finished its task
```aidl
public class JoinTest {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            ...
        });
        
        System.out.println("Main start");
        t.start();
        try {
            System.out.println("Main thread is stopped and waiting for t thread end");
            t.join();   // main thread wait for t thread end. main thread's status is Timed Waiting.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stop");
    }
}
```


### 11. What is yield() method?
`yield()` method is a static method of Thread class.  
It can stop the currently executing thread and will give a chance to other waiting threads of the same priority.  
If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.


### 12. Explain thread pool
- Threads provide a useful paradigm for an application to do many things at once: if you have something to do, create a thread to do it. Using threads can simplify the logic of the application and also take advantage of multiple processors, but creating too many threads can cause overall application performance problems due to contention for resources. The application may end up spending much of its time contending for resources, dealing with mutex locks for example, and less of its time actually doing useful work. Also, creating a thread, though cheaper than creating a process, is still an expense. Creating a thread to do a small amount of work is wasteful.
- A thread pool manages a set of anonymous threads that perform work on request. The threads do not terminate right away. When one of the threads completes a task, the thread becomes idle, ready to be dispatched to another task. The overhead of creating and destroying threads is limited to creating and destroying just the number of active worker threads in the pool. The application can have more tasks than there are worker threads, and this is usually the case. Processor utilization and throughput are improved by reducing contention for resources. The submitted tasks are processed in order, usually faster than could be done by creating a thread per task.


### 13. What is Executor Framework in Java, its different types and how to create these executors?
- What is Executor Framework in Java:
    - The `java.util.concurrent.Executors` provide factory methods that are being used to create ThreadPools of worker threads.
      Thread pools overcome this issue by keeping the threads alive and reusing the threads.

- Executor Framework Types:
    - `FixedThreadPool`: It is a thread pool of a fixed number of threads.
    - `CachedThreadPool`: Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.
    - `SingleThreadExecutor`: It creates a task and execute it in a fixed pool.


- How to create these executors:
    - `ExecutorService es = Executors.newFixedThreadPool(4);`
    - `ExecutorService es = Executors.newCachedThreadPool();`
    - `ExecutorService executor = Executors.newSingleThreadExecutor();`


### 14. Difference between shutdown() and shutdownNow() methods of executor
Two different methods are provided for shutting down an ExecutorService.  
The shutdown() method will allow previously submitted tasks to execute before terminating.  
The shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.


### 15. What is Atomic classes? when do we use it?
- Atomic is a toolkit of variable `java.util.concurrent.atomic` package classes, which assist in writing lock and wait-free algorithms with the Java language. An algorithm requiring only partial threads for constant progress is lock-free.
- The atomic variable allows us to perform an atomic operation on a variable. Atomic variables minimize synchronization and help avoid memory consistency errors.  
- It ensures synchronization.


### 16. What is the concurrent collections?
The concurrent collections are thread safe collections. The `java.util.concurrent` package includes a number of additions to the Java Collections Framework, 
such as `CopyOnWriteArrayList`, `ConcurrrentHashMap`, `CopyOnWriteArraySet`, `ArrayBlockingQueue`, and `LinkedBlockingQueue`.


### 17. What kind of locks you know?
1) **ReentrantLock**: allows threads to reenter into a lock on a resource (multiple times) without a deadlock situation.
    - Diff between synchronized and ReentrantLock:
    - synchronized: wait & notify & notifyAll
    - ReentrantLock: condition.await() & condition.signal() & condition.signalAll()
2) **ReadWriteLock**
3) **StampedLock**


### 18. What is the difference between class lock and object lock?
**Object Lock**:  When we want to synchronize a non-static method or non-static code block such that only one thread will be able to execute the code block on a given instance of the class.  
**Class lock**: It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime


### 19. What is future and completableFuture?
- **future**: A Future is used for asynchronous Programming. It provides two methods, isDone() and get(). The methods retrieve the result of the computation when it completes.
    ```
    ExecutorService executor = Executors.newFixedThreadPool(4);
    Callable<String> task = new Task();
    Future<String> future = executor.submit(task);
    String result = future.get();
    ```
- **completableFuture**: A CompletableFuture is an extension to Java's Future API which was introduced in Java 8. A Future cannot be mutually complete. 
CompletableFuture provides a broad set of methods for creating multiple Futures, chaining, and combining. It also has comprehensive exception handling support.
    - `thenAccept()`
    - `exceptional()`
    - `thenApplyAsync()`
    - `anyOf()` and `allOf()`


### 20. What is ThreadLocal?
This class provides thread-local variables. 
These variables differ from their normal counterparts in that each thread that accesses one (via its get or set method) has its own, independently initialized copy of the variable. 
ThreadLocal instances are typically private static fields in classes that wish to associate state with a thread (e.g., a user ID or Transaction ID).


### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)


### 22. Read those [interview questions](https://www.interviewbit.com/multithreading-interview-questions/#synchronization-process-and-its-uses) and pick some important questions to this homework.
1) What is the purpose of the `finalize()` method?
   Finalize() method is basically a method of Object class specially used to perform cleanup operations on unmanaged resources just before garbage collection. It is not at all intended to be called a normal method. After the complete execution of finalize() method, the object gets destroyed automatically
2) What is ConcurrentHashMap and Hashtable? In java, why is ConcurrentHashMap considered faster than Hashtable?
   ConcurrentHashMap and Hashtable, both are thread-safe but ConcurrentHashMap generally avoids read locks and improves performance, unlike Hashtable. ConcurrentHashMap also provides lock-free reads, unlike Hashtable. Therefore, ConcurrentHashMap is considered faster than Hashtable especially when the number of readers is more as compared to the number of writers.
3) What is the synchronization process (synchronized)? Why use it?
   Synchronization is basically a process in java that enables a simple strategy for avoiding thread interference and memory consistency errors. This process makes sure that resource will be only used one thread at a time when one thread tries to access a shared resource. It can be achieved in three different ways, synchronized method, synchronized block, static synchronization.


### 23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10.
```aidl
public class Main {
    private static final Object monitor = new Object();
    private static int value = 1;
    
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        new Thread(run).start();
        new Thread(run).start();
    }
    
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try {
                        if (value < 11) monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }   
}
```


### 24. Create 3 threads, one thread output 1-10, one thread output 11-20, one thread output 21-30. threads run sequence is random.
```aidl
public class Main {
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Main.class.notifyAll();
    }
}
```

