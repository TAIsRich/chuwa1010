1. Explain volatile variables in java? (we also use it in Singleton)

   The volatile **prevents memory writes from being re-ordered**, making it impossible for other threads to read uninitialized fields of your singleton through the singleton's pointer. “volatile” tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself.

   It is used **to inform the compiler that the variable value can be changed any time without any task given by the source code**. Volatile is usually applied to a variable when we are declaring it. The main reason behind using volatile keyword is that it is used to prevent optimizations on objects in our source code.

2. how to create a new thread(Please also consider Thread Pool case)?

   Extends Thread Class

   ```java
   public class MyThread extends Thread {
   	@Override
   		public void run() {
       	System.out.println("start new thread using extends thread"); 
       }
   }
   Thread t = new MyThread(); // JVM没有创建thread 9 
   t.start(); // 此时JVM才创建新的thread
   ```

   Implements Runnable

   ```java
   public class MyRunnable implements Runnable{
       @Override
       public void run() {
           System.out.println("Start new thread using Runnable");
   } }
   Thread t2 = new Thread(new MyRunnable());
   ```

   Implements Callable

   ```java
   public class MyCallable implements Callable<String> {
       @Override
       public String call() throws Exception {
           Thread.sleep(5000);
           return "Start new thread using Callable";
   		} 
   }
   ```

   Thread pool

   ```
   1. Create a task(Runnable Object) to execute
   2. Create Executor Pool using Executors
   3. Pass tasks to Executor Pool
   4. Shutdown the Executor Pool
   ```

3. Difference between Runnable and Callable

   | **Runnable interface**                                       | **Callable interface**                                       |
   | :----------------------------------------------------------- | :----------------------------------------------------------- |
   | It is a part of [*java.lang*](https://www.geeksforgeeks.org/object-class-in-java/) package since Java 1.0 | It is a part of the [*java.util.concurrent*](https://www.geeksforgeeks.org/java-util-concurrent-package/) package since Java 1.5. |
   | It cannot return the result of computation.                  | It can return the result of the parallel processing of a task. |
   | It cannot throw a checked Exception.                         | It can throw a checked Exception.                            |
   | In a runnable interface, one needs to override the run() method in Java. | In order to use Callable, you need to override the call()    |

4. what is the diff between t.start() and t.run()?

   In Summary only difference between the start() and run() method in Thread is that start creates a new thread while the run doesn't create any thread and simply executes in the current thread like a normal method call.

5. Which way of creating threads is better: Thread class or Runnable interface?

   It is preferred to implement a Runnable interface instead of extending Thread class. As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. It requires less memory and also allows a class to inherit any other class.

6. what is the thread status?

   A java thread can exist in any one of the following states, the status of a thread **is the state in which it exists at a given instance*.

   The status of a thread can be retrieved by **getState() method of the Thread class object**.

   Thread state for a runnable thread. A thread in the runnable state is executing in the Java virtual machine but it may be waiting for other resources from the operating system such as processor.

7. difference between wait() and sleep() method

   **Sleep():** This Method is used to pause the execution of current thread for a specified time in Milliseconds. Here, Thread does not lose its ownership of the monitor and resume’s it’s execution

   **Wait():** This method is defined in object class. It tells the calling thread (a.k.a Current Thread) to wait until another thread invoke’s the notify() or notifyAll() method for this object, The thread waits until it reobtains the ownership of the monitor and Resume’s Execution.

   | Wait()                                                       | Sleep()                                                      |
   | :----------------------------------------------------------- | :----------------------------------------------------------- |
   | Wait() method belongs to Object class.                       | Sleep() method belongs to Thread class.                      |
   | Wait() method releases lock during Synchronization.          | Sleep() method does not release the lock on object during Synchronization. |
   | Wait() should be called only from Synchronized context.      | There is no need to call sleep() from Synchronized context.  |
   | Wait() is not a static method.                               | Sleep() is a static method.                                  |
   | Wait() Has Three Overloaded Methods: wait() wait(long timeout) wait(long timeout, int nanos) | Sleep() Has Two Overloaded Methods: sleep(long millis)millis: milliseconds; sleep(long millis,int nanos) nanos: Nanoseconds |
   | public final void wait(long timeout)                         | public static void sleep(long millis) throws Interrupted_Execption |

8. What is deadlock?

   ***Deadlock*** is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process. 

9. how do threads communicate with each other?

   **Inter-thread communication** involves the communication of threads with each other. The three methods that are used to implement inter-thread communication in Java

   **wait()**
   This method causes the current thread to release the lock. This is done until a specific amount of time has passed or another thread calls the notify() or notifyAll() method for this object.

   notify()
   This method wakes a single thread out of multiple threads on the current object’s monitor. The choice of thread is arbitrary.

   **notifyAll()**
   This method wakes up all the threads that are on the current object’s monitor.

10. what is join() method?

    Join is a synchronization method that blocks the calling thread (that is, the thread that calls the method) until the thread whose Join method is called has completed. Use this method to ensure that a thread has been terminated. The caller will block indefinitely if the thread does not terminate.

    Like the *wait()* and *notify() methods*, *join()* is another mechanism of inter-thread synchronization.

11. what is yield() method

    A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

12. Explain thread pool

    **A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing.** Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

    - Java provides the Executor framework which is centered around the Executor interface, its sub-interface –**ExecutorService** and the class-**ThreadPoolExecutor**, which implements both of these interfaces. By using the executor, one only has to implement the Runnable objects and send them to the executor to execute.
    - They allow you to take advantage of threading, but focus on the tasks that you want the thread to perform, instead of thread mechanics.
    - To use thread pools, we first create a object of ExecutorService and pass a set of tasks to it. ThreadPoolExecutor class allows to set the core and maximum pool size.The runnables that are run by a particular thread are executed sequentially.

13. What is Executor Framework in Java, its different types and how to create these executors?

    With the increase in the number of cores available in the processors nowadays, coupled with the ever-increasing need to achieve more throughput, multi-threading APIs are getting quite popular. Java provides its own multi-threading framework called the Java Executor Framework.

    Java executor framework ([java.util.concurrent.Executor](https://www.geeksforgeeks.org/java-util-concurrent-executor-interface-with-examples/)), released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. We all know that there are two ways to create a thread in java. If you want to read more about their comparison, read [how to create threads in Java.](https://www.geeksforgeeks.org/multithreading-in-java/)

    The[ java.util.concurrent.Executors](https://www.geeksforgeeks.org/java-util-concurrent-executor-interface-with-examples/) provide factory methods that are being used to create [ThreadPools](https://www.geeksforgeeks.org/thread-pools-java/) of worker threads. Thread pools overcome this issue by keeping the threads alive and reusing the threads. Any excess tasks flowing in that the threads in the pool can handle are held in a Queue. Once any of the threads get free, they pick up the next task from this queue. This task queue is essentially unbounded for the out-of-box executors provided by the JDK.

    **Types of Java Executors**

    1. SingleThreadExecutor

    2. FixedThreadPool(n)+

    3. CachedThreadPool

    4. ScheduledExecutor

       [Example and Resources](https://www.geeksforgeeks.org/what-is-java-executor-framework/)

14. Difference between shutdown() and shutdownNow() methods of executor

    The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

15. What is Atomic classes? when do we use it?

    The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.

    [Usage](https://www.geeksforgeeks.org/atomic-variables-in-java-with-examples/)

16. What is the cocurrent collections?

    The `java.util.concurrent` package includes a number of additions to the Java Collections Framework. These are most easily categorized by the collection interfaces provided:

    - [`BlockingQueue`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html) defines a first-in-first-out data structure that blocks or times out when you attempt to add to a full queue, or retrieve from an empty queue.
    - [`ConcurrentMap`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentMap.html) is a subinterface of [`java.util.Map`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) that defines useful atomic operations. These operations remove or replace a key-value pair only if the key is present, or add a key-value pair only if the key is absent. Making these operations atomic helps avoid synchronization. The standard general-purpose implementation of `ConcurrentMap` is [`ConcurrentHashMap`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html), which is a concurrent analog of [`HashMap`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html).
    - [`ConcurrentNavigableMap`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentNavigableMap.html) is a subinterface of `ConcurrentMap` that supports approximate matches. The standard general-purpose implementation of `ConcurrentNavigableMap` is [`ConcurrentSkipListMap`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html), which is a concurrent analog of [`TreeMap`](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html).

    All of these collections help avoid [Memory Consistency Errors](https://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html) by defining a happens-before relationship between an operation that adds an object to the collection with subsequent operations that access or remove that object.

17. what kind of locks you know?

    ReentrantLock; ReadWriteLock; StampedLock; 

18. What is the difference between class lock and object lock?

    In multithreading environment, two or more threads can access the shared resources simultaneously which can lead the inconsistent behavior of the system. Java uses concept of locks to restrict concurrent access of shared resources or objects. Locks can be applied at two levels −

    - Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
    - Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime. It should always be used to make static data thread safe. 

    | Sr. No. |        Key        |                      Object Level Lock                       |                       Class Level Lock                       |
    | ------- | :---------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
    | 1       |       Basic       | It can be used when you want non-static method or non-static block of the code should be accessed by only one thread | It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime |
    | 2       | Static/Non Static | It should always be used to make non-static data thread safe. |  It should always be used to make static data thread safe.   |
    | 3       |  Number of Locks  |        Every object the class may have their own lock        | Multiple objects of class may exist but there is always one class’s class object lock available |

19. What is future and completableFuture?

    CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of writing *non-blocking* code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.

    This way, your main thread does not block/wait for the completion of the task and it can execute other tasks in parallel.

    Having this kind of parallelism greatly improves the performance of your programs.

    CompletableFuture is an extension to [Java’s Future API](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Future.html) which was introduced in Java 5.

    A Future is used as a reference to the result of an asynchronous computation. It provides an `isDone()` method to check whether the computation is done or not, and a `get()` method to retrieve the result of the computation when it is done.

    Future API was a good step towards asynchronous programming in Java but it lacked some important and useful features -

20. what is ThreadLocal?

    This class provides thread-local variables. These variables differ from their normal counterparts in that each thread that accesses one (via its get or set method) has its own, independently initialized copy of the variable. Basically, it is another way to **achieve thread safety** apart from writing immutable classes. Since the Object is no more shared there is no requirement for Synchronization which can improve the scalability and performance of the application. ThreadLocal provides thread restriction which is an extension of a local variable. ThreadLocal is visible only in a single thread. No two threads can see each other’s thread-local variable. These variables are generally private static fields in classes and maintain their state inside the thread.

21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

    

22. Read those interview questions and pick some important questions to this home work.

    [Interview Questions](https://www.interviewbit.com/multithreading-interview-questions/#benefits-of-multithreading)

    

23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)

​	a. One solution use synchronized and wait notify

```java
public class OddEvenPrintWaitNotify {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        Runnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable{

        @Override
        public void run() {
            synchronized (monitor){
                while(value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try{
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
```

​	b. One solution use ReentrantLock and await, signal

```powershell
Thread-0: 1
Thread-1: 2
Thread-0: 3
Thread-1: 4
Thread-0: 5
Thread-1: 6
Thread-0: 7
Thread-1: 8
Thread-0: 9
Thread-1: 10
Process finished with exit code 0
```



24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

    ```
    Thread-0: 1
    Thread-0: 2
    Thread-0: 3
    Thread-0: 4
    Thread-0: 5
    Thread-0: 6
    Thread-0: 7
    Thread-0: 8
    Thread-0: 9
    Thread-0: 10
    Thread-2: 11
    Thread-2: 12
    Thread-2: 13
    Thread-2: 14
    Thread-2: 15
    Thread-2: 16
    Thread-2: 17
    Thread-2: 18
    Thread-2: 19
    Thread-2: 20
    Thread-1: 21
    Thread-1: 22
    Thread-1: 23
    Thread-1: 24
    Thread-1: 25
    Thread-1: 26
    Thread-1: 27
    Thread-1: 28
    Thread-1: 29
    Thread-1: 30
    ```

    