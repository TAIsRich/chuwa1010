## HW5 - Multi-Threading

1. **Explain volatile variables in java? (we also use it in Singleton)**

   `volatile` guarantees variable visibility across threads, meaning reads and writes to the volatile variable are visible across threads. Without `volatile`, threads may see a non-updated variable.

2. **How to create a new thread(Please also consider Thread Pool case)?**

   - Extends Thread Class

     ```java
     public class MyThread extends Thread {
         @Override
         public void run() {
             //set the new thread's task
         }
     }
     Thread mt = new MyThread();
     mt.start();
     ```

     

   - Implements Runnable Interface

     ```java
     public class MyRunnable implements Runnable {
         @Override
         public void run() {
             //set the new thread's task
         }
     }
     Runnable mr = new MyRunnable();
     Thread mt = new Thread(mr);
     mt.start();
     
     //Or using lambda
     Runnable mr = () -> { /*set the new thread's task*/ };
     new Thread(mr).start();
     ```

   - Implements Callable Interface

     ```java
     public class MyCallable implements Callable<String> {
         @Override
         public Object call() throws Exception {
             Thread.sleep(5000);
             return "Start new thread using Callable"
         }
     }
     ```

   - Thread Pool

     ```java
     //create a fixed size thread pool with 4 threads
     ExecutorService executor = Executors.newFixedThreadPool(4);
     //submit tasks
     executor.submit(task1);
     executor.submit(task2);
     executor.submit(task3);
     executor.submit(task4);
     executor.submit(task5);
     ```

3. **Difference between Runnable and Callable**

   Runnable has no return, while Callable returns a result on completion.

4. **What is the diff between t.start() and t.run()?**

   - start() creates the new thread and executes the task from run() method, cannot call start() twice
   - run() does not create new thread, executes on the current thread

5. **Which way of creating threads is better: Thread class or Runnable interface?**

   Creating threads by implementing Runnable Interface is a better way. Because besides implementing Runnable, the class can extends any other class so that we can use the benefits of inheritance. While if the class extends Thread, it cannot extend other class.

6. **What is the thread status?**

   - New: a new thread is created, not started yet
   - Runnable: a thread might actually be running or might be ready to run (waiting for the CPU)
   - Blocked: a thread is waiting for a monitor lock
   - Waiting: a thread is waiting for other threads
   - Timed Waiting: a thread is waiting with a specified waiting time
   - Terminated: finish execution

7. **Difference between wait() and sleep() method**

   `wait()` makes thread goes in waiting state and can be woken up by `notify()` whereas `sleep()` cannot.

   `wait()` releases the lock and must happen in a synchronized block whereas `sleep()` doesn't.

8. **What is deadlock?**

   Deadlock occurs in a situation when a thread A is waiting for an object lock, which is acquired by another thread B.  And the thread B is also waiting for an object lock that is acquired by thread A. Both threads are waiting for each other to release the lock, this condition is called deadlock.

9. **How do threads communicate with each other?**

   `wait()` and `notify()`

10. **What is join() method?**

    It puts current thread on wait until another thread (which it is called) completes its execution.

11. **What is yield() method?**

    If a thread calls the yield method, means it is ready to pause its execution, and gives the other threads which have same or higher priority opportunity to run.

12. **Explain thread pool**

    The thread pool represents a group of worker threads which are used to execute multiple tasks and can be reused. Using thread pool can minimize the overhead due to thread creation and get better performance.

13. **What is Executor Framework in Java, its different types and how to create these executors?**

    The java executor framework provides factory methods which are being used to create thread pool. Some types of java executors are: 

    - FixedThreadPool: creates an executor with a thread pool of a fixed number of threads
      - `ExecutorServie excutor = Executors.newFixedThreadPool(n)`
    - CachedThreadPool: creates an executor with an expandable thread pool
      - `ExecutorServie excutor = Executors.newCachedThreadPool()`
    - SingleThreadPool: creates an executor that executes a single task at a time (single thread pool)
      - `ExecutorServie excutor = Executors.newSingleThreadExecutor()`

14. **Difference between shutdown() and shutdownNow() methods of executor**

    - `shutdown()` - previously submitted tasks continue to run, no new tasks will be accepted
    - `shutdownnow()` - attempts to stop all submitted tasks

15. **What is Atomic classes? when do we use it?**

    The atomic classes use CAS (compare-and-swap) operations to provide a way to perform thread safe operations on a variable without using `synchronized`. It can be used as an atomic counter that can be used by many threads concurrently.

16. **What is the concurrent collections?**

    Thread safe Collections:

    - CopyOnWriteArrayList
    - ConcurrrentHashMap
    - CopyOnWriteArraySet
    - ArrayBlockingQueue
    - LinkedBlockingQueue

17. **What kind of locks you know?**

    - ReentrantLock - similar to synchronized but provides more extensive operation than synchronized
    - ReadWriteLock - multiple threads can read concurrently, as long as there's no thread to write. Only one thread can write the data at the time.
    - StampedLock - allow optimistic locking for read operations

18. **What is the difference between class lock and object lock?**

    - class lock - It is used for static data
    - object lock - It is used for non-static method or non-static code block

19. **What is future and completableFuture?**

    - Future is used to represent the result of an asynchronous computation. It provides methods to check if the computation is complete, to wait for its completion and to retrieve the results
    - CompletableFuture is an extension to Future. It runs a task on a separate thread than the main application thread and notifies the main thread about its progress, completion or failure. It has support for exception handling and is able to get multiple futures be chained together.

20. **What is ThreadLocal?**

    It provides thread-local variables. Each thread that accesses one variable has its own, independently initialized copy of that variable. It provides a way to achieve thread safe without writing immutable classes and no need for synchronization. 

21. **Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)**

22. **Read those interview questions and pick some important questions to this home work.**

    - ***What's the difference between thread and process?***

      process - a program in execution, can contain multiple threads.

      thread - smallest units of the particular process, has the ability to execute different parts of the program at the same time.  

    - ***What's the difference between User thread and Daemon thread?***

      user thread - for critical or core tasks, JVM waits for user threads to finish before termination

      daemon thread - for supporting tasks, low priority, JVM does not wait daemon threads to finish before termination

    - ***What is Livelock? What happens when it occurs?***

      Similar to deadlock, livelock is also another concurrency problem. Threads are not blocked but their execution is stopped due to the unavailability of resources.

    - ***Explain context switching.***

      Switching of CPU process from one thread to another one. It allows multiple processes to share the same CPU. In context switching, the state of thread or process is stored so that the execution of the thread can be resumed later if required. 

    - ***What is semaphore?***

      Semaphore is a thread synchronization construct that is usually required to control and manage the access to the shared resource using counters. It simply sets the limit of the thread. The semaphore class can be used to send signals between threads to avoid missed signals or to guard critical sections. It can also be used to implement resource pools or bounded collection.

23. **Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10.**

    - use synchronized and wait, notify

      ```java
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

    - use ReentrantLock and await, signal

      ```java
      public class Main {
          private static final Object monitor = new Object();
          private static int value = 1;
      
          public static void main(String[] args) {
              MyRunnable run = new MyRunnable();
              new Thread(run).start();
              new Thread(run).start();
          }
      
          static class MyRunnable implements Runnable {
              private final Lock lock = new ReentrantLock();
              private final Condition condition = lock.newCondition();
              @Override
              public void run() {
                  lock.lock();
                  try {
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
                      lock.unlock();
                  }
              }
          }
      }
      ```

24. **Create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-30. threads run sequence is random.**

    ```java
    public class Main {
        private static int n = 1;
    
        public static void main(String[] args) {
            Thread t1 = new Thread(() -> printNumber());
            t1.start();
            Thread t2 = new Thread(() -> printNumber());
            t2.start();
            Thread t3 = new Thread(() -> printNumber());
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
        }
    }
    ```
