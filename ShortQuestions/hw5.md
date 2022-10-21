# HW5 ShortAnswers
1. Explain volatile variables in java? (we also use it in Singleton)

     * Volatile is a lightweight synchronization mechanism provided by Java. The Java language contains two inherent synchronization mechanisms: synchronized blocks (or methods) and volatile variables. Compared to synchronized (synchronized is often called heavyweight locks), volatile is more lightweight because it does not cause thread context switching and scheduling.
     * In the singleton mode, the volatile keyword is often ignored; without this keyword, an error may occur in the case of high concurrency and CPU reordering

2. how to create a new thread (Please also consider Thread Pool case)?

     ```java
     Thread thread = new Thread();
     thread.start();
     ```

     * There are three ways to create threads in java:
       1. Inherit the Thread class to create a thread
       2. Implement the Runnable interface to create a thread
       3.  Use Callable and Future to create a thread.
     * There are four ways to create a thread pool in java:
       * newCachedThreadPool creates a cacheable thread pool. If the length of the thread pool exceeds the processing requirement, it can flexibly recycle idle threads. If there is no reclamation, create a new thread
       * newFixedThreadPool creates a fixed-length thread pool, which can control the maximum number of concurrent threads, and the excess threads will wait in the queue
       * newScheduledThreadPool creates a fixed-length thread pool that supports scheduled and periodic task execution
       * newSingleThreadExecutor creates a single-threaded thread pool, which only has a single worker thread to execute tasks, ensuring that all tasks are as specified Sequential (FIFO, LIFO, Priority) execution

3. Difference between Runnable and Callable

     * A **callable** interface throws the checked exception and returns the result. A **runnable** interface, on the other hand, shows the result or throws an exception, but does not do both.

4. what is the diff between t.start() and t.run()?

     * **start() method** of thread class is implemented as when it is called a new Thread is created and code inside run() method is executed in that new Thread.
     * run() method is used to define the code that constitutes the new thread, it contains the code to be executed. start() method is used to begin execution of the thread that is execution of run(). 

5. Which way of creating threads is better: Thread class or Runnable interface?

     * It is preferred to implement a **Runnable interface** instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.

6. what is the thread status?

     * Initial**(NEW)**: A new thread object is created, but the start() method has not been called.
     * Running**(RUNNABLE)**: The two states of ready (ready) and running (running) in a Java thread are generally referred to as "running". After the thread object is created, other threads (such as the main thread) call the start() method of the object. The thread in this state is in the runnable thread pool, waiting to be selected by thread scheduling to obtain the right to use the CPU, and it is in the ready state (ready) at this time. A thread in the ready state becomes the running state (running) after obtaining a CPU time slice.
     * Blocked**(BLOCKED)**: Indicates that the thread is blocked on the lock.
     * Waiting**(WAITING)**: Threads entering this state need to wait for other threads to make some specific actions (notifications or interruptions).
     * Timeout waiting**(TIMED_WAITING)**: This state is different from WAITING, it can return by itself after a specified time.
     * Terminated**(TERMINATED)**: Indicates that the thread has finished executing

7. difference between wait() and sleep() method

     * The major difference is that **wait() releases the lock while sleep() doesn't release any lock while waiting**. wait() is used for inter-thread communication while sleep() is used to introduce a pause on execution, generally.

8. What is deadlock?

     * **Deadlock** is any situation in which no member of some group of entities can proceed because each waits for another member, including itself, to take action, such as sending a message or, more commonly, releasing a lock.

9. how do threads communicate with each other?

     * All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other. The second way for threads to communicate is by **using thread control methods**.

10. what is join() method?

     * The join() method **takes all items in an iterable and joins them into one string**. A string must be specified as the separator.

11. what is yield() method

      * A yield() method is **a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority**. 

12. Explain thread pool

      * A thread pool is **a software design pattern for achieving concurrency of execution in a computer program**. 

13. What is Executor Framework in Java, its different types and how to create these executors?

      * The Executor Framework **contains a bunch of components that are used to efficiently manage multiple threads**.

14. Difference between shutdown() and shutdownNow() methods of executor

      * Two different methods are provided for shutting down an ExecutorService. The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

15. What is Atomic classes? when do we use it?

      * The atomic classes **provide a lock-free and thread-safe environment or programming on a single variable**. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.

16. What is the cocurrent collections?

      * Concurrent Collections is **a programming model for software frameworks to expose parallelism in applications**. 

17. what kind of locks you know?

      * ReentrantLock 

18. What is the difference between class lock and object lock?

      * Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 
      * Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.

19. What is future and completableFuture?

      * CompletableFuture is an extension to Java’s Future API which was introduced in Java 
      * A Future is used as a reference to the result of an asynchronous computation. It provides an isDone() method to check whether the computation is done or not, and a get() method to retrieve the result of the computation when it is done.

20. what is ThreadLocal?

      * Java ThreadLocal is used **to create thread local variables**. We know that all threads of an Object share it's variables, so the variable is not thread safe. We can use synchronization for thread safety but if we want to avoid synchronization, we can use ThreadLocal variables.

21. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
      a. One solution use synchronized and wait notify
      b. One solution use ReentrantLock and await, signal

      * See in the Coding Folder TwoThread.java

22. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

      * See in the Coding Folder ThreeThread.java
