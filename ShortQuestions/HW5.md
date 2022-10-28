1. ##### Explain volatile variables in java? (we also use it in Singleton)

   Volatile keyword is used to modify the value of a variable by different threads. It is another way to make thread safe.

2. ##### how to create a new thread(Please also consider Thread Pool case)?

   ```java
   Thread thread = new Thread();
   thread.start();
   ```

   ```java
   Thread thread = new Thread(new MyRunnabale());
   ```

   

3. ##### Difference between Runnable and Callable

   Runnable has a void method to be implemented, while Callable has to reutrn value.

4. ##### What is the diff between t.start() and t.run()?

   `t.starts()` only makes a threaed runnable, while `t.run()` actually runs the tasks in the method body.

5. ##### Which way of creating threads is better: Thread class or Runnable interface?

   Runnable interface is better, because a class can implaents multiple interfaces while can only be able to extend one parent class. Using runnable interface makes it easier for any class to becomea thread.

6. ##### what is the thread status?

   - New: The object is initiated
   - Runnable: The thread is either ready to run or is running
   - Blocked: The thread is blocked in a lock
   - Waiting: The thread is waiting for responses from other threads
   - Timed_Waiting: The thread is waiting for a set time
   - Terminated: The thread has done executing tasks and ended

7. ##### difference between wait() and sleep() method

   `wait()` would release the lock on the current object under the synchronized context, while `sleep()` does not do anything with the lock.

8. ##### What is deadlock?

   A deadlock occurs when there are two threads both waiting for the lock to be released by the other thread after finishing up operating on the object that the lock is on, while it will never be released because the necessary object is used by the other threaed.

9. ##### How do threads communicate with each other?

   They can use. `notify()` to wake up the other thread and use `wait()` to sleep to release the lock.

10. ##### What is join() method?

    A thread can use `theOtherThread.join()` method to wait for the other thread to finsih then continue to do its own tasks.

11. ##### what is yield() method

    Depending on the processor platform, `yield()` will put the current threade into sleep and give priority to other thread to be executed and to be put back in execution some time in a non-deterministic manner.

12. ##### Explain thread pool

    A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing.

13. ##### What is Executor Framework in Java, its different types and how to create these executors?

    A framework having a bunch of components that are used for managing worker threads efficiently is referred to as Executor Framework. The Executor API reduces the execution of the task from the actual task to be executed through the Executors. In order to use the executor framework, we have to create a thread pool for executing the task by submmiting that task to that thread pool.

    There are different types of executors avaliable:

    1. ###### SingleThreadExecutor

       The SingleThreadExecutor is a special type of executor that has only a single thread. It is used when we need to execute tasks in sequential order.

       ```java
       ExecutorService executor = Executors.newSingleThreadExecutor();
       ```

    2. ###### FixedThreadPool(n)

       FixedThreadPool is another special type of executor that is a thread pool having a fixed number of threads. By this executor, the submitted task is executed by the n thread. In case when we need to execute more tasks after submitting previous tasks, they store in the LinkedBlockingQueue until previous tasks are not completed.

       ```java
       ExecutorService executor = Executors.newFixedThreadPool(4);
       ```

    3. ###### CachedThreadPool

       The CachedThreadPool is a special type of thread pool that is execute short-lived parallel tasks. The cached thread pool doesn't have a fixed numner of threads. When a new task comes at a time when all the threads are busy in executing some other tasks, a new thread creates by the pool and add to the executor. When a thread becomes free, it carries out the execution of the new tasks. Threads are terminated and removed from the cached when they remain idle for sixty seconds.

       ```java
       ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
       ```

14. ##### Difference between shutdown() and shutdownNow() methods of executor

    `shutdown()` will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run.

    `shutdownNow()` will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. If your tasks ignore the interruption, `shutdownNow` will behave exactly the same way as `shutdown`.

15. ##### What is Atomic classes? when do we use it?

    The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the `get()` and `set()` methods that work on the volatile variable. The method works the same as read and writes on volatile variables.

16. ##### What is the concurrent collections?

    Most of the collections classes objects are non-synchronized in nature i.e. multiple threads can perform on a object at a time simultaneously. Therefore objects are not thread-safe. The main problem is when one thread is iterating an collections object then if another thread cant modify the content of the object. If another thread try to modify the content of object then we will get RuntimException saying ConcurrentModificationException.

17. ##### what kind of locks you know?

    1. ReentrantLock

       ReentrantLock interface maintain a pair of locks, one for read-only operations and one for the write operation. The read lock amy be simultaneously held by multiple threads as long as there is no write.

    2. ReentrantReadWriteLock

       Read lock - if no thread acquired the write lock or requested for it, multiple threads can acquire the read lock.

       Write Lock - if no threads are reading or writing, onlt one thread can acquire the write lock.

    3. StampedLock

       StampedLock allow optimistic locking for read operations

       ReentrantLocks are reentrant (StampedLocks are not)

18. ##### What is the difference between class lock and object lock?

    1. Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
    2. Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime

19. ##### What is future and completableFuture?

    Since Callable would have a return and our program are asynchronisn, We might not get a return immediately, the Future class can call the asynchronic result. Because we do not know when can we get the return result, if we only use the Future , we might have to check the return many times to get the result. But the CompletableFuture will get the return result automatically when a callable thread competed.

20. ##### what is ThreadLocal?

    A ThreadLocal can creat a temporary variable that only can be accessed by a specific thread

    ##### 

    

    

