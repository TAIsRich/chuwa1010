HW5 solution

1. Volatile is used to modify the value of a variable by different threads. It is used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem.

2. thread subclass

   ```java
   public class MyThread extends Thread
     public void run(){
     System.out.println("Thread running");
   }
   Thread th = new MyThread();
   th.start();
   ```

   runnable

   ```java
   public class MyRunnable implements Runnable{
     public void run(){
       System.out.println("Start new thread using Runnable");
     }
   }
   Thread th1 = new Thread(new MyRunnable());
   ```

   Thread pool:

3. 

4. | Runnable                                                  | Callable                                                     |
   | --------------------------------------------------------- | ------------------------------------------------------------ |
   | The package named java.lang is used in this interface.    | It is considered a part of a package named java.util.concurrent. |
   | Can’t throw an exception                                  | This interface can throw an exception                        |
   | It uses the `run()` method                                | `Call()` method is used in this regard                       |
   | This interface can’t return the result of any calculation | A runnable interface can return the result of any processed task. |

   When we call the start() method of our thread class instance, a new thread is created with default name Thread-0,  when we called the run() method of our MyThread class, no new thread is created and the run() method is executed on the current thread.

5. It is preferred to implement a Runnable interface instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.

6. The thread status indicate which part of the lifecycle is the current thread at.

7. **Sleep():** This Method is used to pause the execution of current thread for a specified time in Milliseconds. Here, Thread does not lose its ownership of the monitor and resume’s it’s execution

   **Wait():** This method is defined in object class. It tells the calling thread (a.k.a Current Thread) to wait until another thread invoke’s the notify() or notifyAll() method for this object, The thread waits until it reobtains the ownership of the monitor and Resume’s Execution.

8. Deadlock in java is a programming situation where two or more threads are blocked forever

9. All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other. The second way for threads to communicate is by using thread control methods.

10. The join() method takes all items in an iterable and joins them into one string.

11. A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

12. A thread pool is a software design pattern for achieving concurrency of execution in a computer program. Often also called a replicated workers or worker-crew model, a thread pool maintains multiple threads waiting for tasks to be allocated for concurrent execution by the supervising program.

13. The Executor Framework contains a bunch of components that are used to efficiently manage multiple threads.

14. The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

15. The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations.

16. Concurrent Collections is a programming model for software frameworks to expose parallelism in applications.

17. ReentrantLock; ReadWriteLock; StampedLock;

18. Object Level Locks: It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 

    Class Level locks: It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.

19. CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.

    A Future is used as a reference to the result of an asynchronous computation. It provides an isDone() method to check whether the computation is done or not, and a get() method to retrieve the result of the computation when it is done.

20. he Java ThreadLocal class enables you to create variables that can only be read and written by the same thread.