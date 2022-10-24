### HW5
1. Explain volatile variables in java? (we also use it in Singleton)
   Volatile is a key work to ensure and address the visibility of changes to variable in multithread program. This keyword can’t use with classes and. It ‘s simply use to achieve thread safe.
2. how to create a new thread(Please also consider the Thread Pool case)?
   Extends the thread class
   Implements the runnable interface
   Implement the callable interface

3. Difference between Runnable and Callable
   Runnable no return values, Callable can return value
4. what is the diff between t.start() and t.run()?
   t.start(0 is to create another thread then run
   t.run() is use the current thread to run
5. Which way of creating threads is better: Thread class or Runnable interface?
   The Runnable interface is better, it will inherit all the thread methods if it extends the thread class, which we only need the run method.

6. what is the thread status?
   Thread status is the state of the thread. The cycle of a thread is
   New
   Runnable
   Blocked
   Waiting
   Timed Waiting
   Terminated
7. difference between wait() and sleep() method
   wait() is defined in the object class, it tells the calling thread to wait until another thread invokes notify() or notifyAll() to wake up. The thread waits until it reobtains the ownership of the monitor and Resume’s Execution.
   Sleep() is a method to pause the execution of current thread for a specific time in milliseconds. Here, Thread does not lose its ownership of the monitor and resumes it’s execution

8. What is deadlock?
   When multiple thread working simultaneously, sometimes will cause a problem which is call deadlock, it’s there is a task need two resources to start, but one people took resource A, and another took resource B, and they are waiting for another resource, which they will never get it. So, the task will never start.
9. How do threads communicate with each other?
   The threads can use wait() and notify or notifyAll() to communicate with each other.
10. What is the join() method?
    Join() is a synchronization method, it will block the calling thread(the thread who call the method) until the thread whose join method is called has completed. This can ensure that a thread has terminated.
11. what is yield() method
    It can stop the currently executing thread and will give a chance for other waiting threads that have the same priority. If there is no waiting thread or other waiting thread has low priority, then the same thread will continue to execute.
12. Explain thread pool
    A thread pool is a collection of pre-initialized threads to execute the current task. Since the thread already exists when the request arrives, it will eliminate the thread creation time, which will make the program more responsive.
13. What is Executor Framework in Java, its different types and how to create these
    executors?
14. Difference between shutdown() and shutdownNow() methods of executor
15. What is Atomic classes? when do we use it?
16. What is the cocurrent collections?
17. what kind of locks you know?
    Object lock and class lock?
18. What is the difference between class lock and object lock?
19. What is the future and completableFuture?
20. what is ThreadLocal?
21. Type the code by your self and try to understand it. (package
    com.chuwa.tutorial.t08_multithreading)
22. Read those interview questions and pick some important questions to this home
    Work.
    What is thread?
    What are the ways to implement threa in java.
    What is Runnable and callable Interface? What is the diffrence?
    What is the start() and RUn method of thread.
    What is threadpool
    What is synchronized method

23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
    2,4,6,8,10. (solution is incom.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
    No. 1 / 3
    a. One solution use synchronized and wait notify
    b. One solution use ReentrantLock and await, signal
24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
    output 21-22. threads run sequence is random. (solution is in
    com.chuwa.exercise.t08_multithreading.PrintNumber1

