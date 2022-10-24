1. Explain volatile variables in java? (we also use it in Singleton)

   To face a situation that, the shared entity mostly leads to a problem when [concurrency](https://www.geeksforgeeks.org/java-concurrency-yield-sleep-and-join-methods/) is incorporated. ***volatile*** is a keyword what can create a thread safe variable. The keyword makes JVM know that, 1) always get the newest value of the variable. 2) immediately return back to the memory whenever the variable is changed.

   

2. how to create a new thread(Please also consider Thread Pool case)?

   a. extends from Thread class and override the run() method.

   b. implements a runnable interface when create a Thread object

   c. implements a callable interface when create a Thread object

   

3. Difference between Runnable and Callable

   Runnable does not have a return value while Callable has.

   

4. what is the diff between t.start() and t.run()?

   t.start() starts a new thread to excute the task

   t.run() excutes the task in the current thread

   

5. Which way of creating threads is better: Thread class or Runnable interface?

   Thread class is better as it has more methods while Runnable only has one method - run()

   

6. what is the thread status?

   Thread status contains New, Runnable, Blocked, Waiting, Time_Waiting, Terminated

   

7. difference between wait() and sleep() method

   - The fundamental difference is that `wait()` is non static method of `Object` and `sleep()` is a static method of `Thread`.
   - The major difference is that `wait()` releases the lock while `sleep()` doesn’t release any lock while waiting.
   - `wait()` is used for inter-thread communication while `sleep()` is used to introduce a pause on execution, generally.
   - `wait()` should be called from inside synchronise or else we get an `IllegalMonitorStateException`, while `sleep()` can be called anywhere.
   - To start a thread again from `wait()`, you have to call `notify()` or `notifyAll()` indefinitely. As for `sleep(),` the thread gets started definitely after a specified time interval.

   

8. What is deadlock?

   Deadlock in java is a programming situation where two or more threads are blocked forever. Java deadlock situation arises with at least two threads and two or more resources.

   

9. how do threads communicate with each other?

   Syncronized :  wait() & notify() & notifyAll()

   ReentrantLock: condition.await() & condition.signal() & condition.signalAll()

   

10. what is join() method?

    t.join() means the current thread will stop and wait for thread t completes its task

    Current Thread will continue after thread t finished its task

    

11. what is yield() method

    The **yield()** basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.

    

12. Explain thread pool

    A Thread pool is simply a collection of pre-initialized or worker threads at the start-up that can be used to execute tasks and put back in the pool when completed. It is referred to as pool threads in which a group of fixed-size threads is created.  By reducing the number of application threads and managing their lifecycle, one can mitigate the issue of performance using a thread pool. Using threads, performance can be enhanced and better system stability can occur. To create the thread pools, java.util.concurrent.Executors class usually provides factory methods.

    

13. What is Executor Framework in Java, its different types and how to create these executors?

    - **FixedThreadPool**：create a fixed amount of threads in thread pool

      `ExecutorService es = Executors.newFixedThreadPool(4);`

    - **CachedThreadPool**：create a dynamic amount of threads in thread pool

      ```java
      int min = 4;
      int max = 10;
      ExecutorService es = new ThreadPoolExecutor(min, max,
              60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
      ```

    - **SingleThreadExecutor**：create only one thread in thread pool

    - **ScheduledThreadPool**

      ```java
      ScheduledExecutorService ses = Executors.newScheduledThreadPool(4);
      // 1秒后执行一次性任务:
      ses.schedule(new Task("one-time"), 1, TimeUnit.SECONDS);
      
      // 2秒后开始执行定时任务，每3秒执行:
      //FixedRate是指任务总是以固定时间间隔触发，不管任务执行多长时间：
      ses.scheduleAtFixedRate(new Task("fixed-rate"), 2, 3, TimeUnit.SECONDS);
      
      // 2秒后开始执行定时任务，以3秒为间隔执行:
      //而FixedDelay是指，上一次任务执行完毕后，等待固定的时间间隔，再执行下一次任务：
      ses.scheduleWithFixedDelay(new Task("fixed-delay"), 2, 3, TimeUnit.SECONDS);
      ```

      

14. Difference between shutdown() and shutdownNow() methods of executor

    Shutdown() will wait the tasks to be finished and then close the thread pool.

    shutdownNow() will immediately shut down the thread pool.

    

15. What is Atomic classes? when do we use it?

    Java provides [**atomic classes**](https://www.geeksforgeeks.org/tag/java-util-concurrent-atomic-package/) such as [AtomicInteger](https://www.geeksforgeeks.org/tag/java-atomicinteger/), [AtomicLong](https://www.geeksforgeeks.org/tag/java-atomiclong/), [AtomicBoolean](https://www.geeksforgeeks.org/tag/java-atomicboolean/) and **AtomicReference**. Objects of these classes represent the **atomic variable** of int, long, boolean, and object reference respectively. These classes contain the following methods.

    1. **set(int value):** Sets to the given value

    2. **get():** Gets the current value

    3. **lazySet(int value):** Eventually sets to the given value

    4. **compareAndSet(int expect, int update):** Atomically sets the value to the given updated value if the current value == the expected value

    5. **addAndGet(int delta):** Atomically adds the given value to the current value

    6. **decrementAndGet():** Atomically decrements by one the current value

       

16. What is the concurrent collections?

    **INTERFACE NON-THREAD-SAFE**

    List ArrayList

    Map HashMap

    Set HashSet / TreeSet

    Queue ArrayDeque / LinkedList

    Deque ArrayDeque / LinkedList

    **THREAD-SAFE**

    CopyOnWriteArrayList

    ConcurrentHashMap

    CopyOnWriteArraySet

    ArrayBlockingQueue / LinkedBlockingQueue

    LinkedBlockingDeque

    

17. what kind of locks you know?

    **ReentrantLock** - like synchronized, but it can tryLock()

    **ReadWriteLock**

    **StampedLock**

    

18. What is the difference between class lock and object lock?

    **class lock** locks all instances created from the class. If a thread wants to execute a static synchronized method, then the thread requires a class level lock. Once a thread got the class level lock, then it is allowed to execute any static synchronized method of that class. 

    **object lock** only locks the current instance

    

19. What is future and completableFuture?

    **Future** represents the generic result got from Callable interface and it means a result that could be got in the future.

    ```java
    ExecutorService executor = Executors.newFixedThreadPool(4); 
    // 定义任务:
    Callable<String> task = new Task();
    // 提交任务并获得Future:
    Future<String> future = executor.submit(task);
    // 从Future获取异步执行返回的结果:
    String result = future.get(); // 可能阻塞
    ```

    

    **completableFuture** is created when the release of java8.  the CompletableFuture class **allows us to handle it in a special handle method**. This method receives two parameters: a result of a computation (if it finished successfully), and the exception thrown (if some computation step did not complete normally).

    

20. what is ThreadLocal?

    The *TheadLocal* construct allows us to store data that will be **accessible only** by **a specific thread**.

    `ThreadLocal<Integer> threadLocalValue = new **ThreadLocal**<>();`

    Next, when we want to use this value from a thread, we only need to call a *get()* or *set()* method. Simply put, we can imagine that *ThreadLocal* stores data inside of a map with the thread as the key.

    As a result, when we call a *get()* method on the *threadLocalValue*, we'll get an *Integer* value for the requesting thread:

    `threadLocalValue.set(1);`

    `Integer result = threadLocalValue.get();`

    To remove the value from the *ThreadLocal*, we can call the *remove()* method:

    ```java
    threadLocal.remove();
    ```

    

21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

    

22. Read those interview questions and pick some important questions to this home work.

    