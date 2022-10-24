# HW5 Short Questions
## 1. Explain volatile variables in java? (we also use it in Singleton)
   Volatile is a key work to ensure and address the visibility of changes to variable in multithread program.In other words, volatile keyword here makes sure that the changes made in one thread are immediately reflect in other thread. This keyword can’t use with classes and. It‘s simply use to achieve thread safe. 
    volatile:保证多线程中一处改变在多线程中的可见性。
    synchronized:保证只有一个线程可以做更改；guarantees both mutual exclusion and visibility. If we make the blocks of threads that modify the value of the shared variable synchronized only one thread can enter the block and changes made by it will be reflected in the main memory. All other threads trying to enter the block at the same time will be blocked and put to sleep.

## 2. how to create a new thread(Please also consider the Thread Pool case)?
    Method 1： Extends the thread class
        a. new Thread(new Task("name"))
        b. thread pool： es.submit(new Task("name"))
    Method 2：Implements the runnable interface
    Method 3： Implement the callable interface

## 3. Difference between Runnable and Callable
   Runnable has no return values, Callable can return value
## 4. what is the diff between t.start() and t.run()?
   t.start(） is to create another thread then run
   t.run() is use the current thread to run
## 5. Which way of creating threads is better: Thread class or Runnable interface?
   The Runnable interface is better, it will inherit all the thread methods if it extends the thread class, which we only need the run method.

## 6. what is the thread status?
   Thread status is the state of the thread. The cycle of a thread is
   New: create a thread.
   Runnable： ready to run.
   Blocked: the thread id blocked.
   Waiting: waiting for notification from other thread to run or pause.
   Timed Waiting: wait for a specific time and then return
   Terminated: the thread is terminated.
## 7. difference between wait() and sleep() method
   wait() is defined in the object class, it tells the calling thread to wait until another thread invokes notify() or notifyAll() to wake up. The thread **waits until it reobtains the ownership** of the monitor and Resume’s Execution.
   Sleep() is a method to **pause** the execution of current thread for a specific time in milliseconds. Thread does not lose its ownership of the monitor and **resumes** its execution.

## 8. What is deadlock?
   When multiple thread working simultaneously, sometimes will cause a problem which is called deadlock. It is a situation that tasks need two resources to start, but one task takes resource A, and another task takes resource B, and they are waiting for the other resource, which they will never get it. So, the task will never start.
   Deadlock in java is a programming situation where two or more threads are blocked forever. Java deadlock situation arises with at least two threads and two or more resources.
    To avoid deadlock:
    avoid nested lock;
    lock only what is required;
    avoid waiting indefinitely.

## 9. How do threads communicate with each other?
Implement the inner-thread communication using three methods:
**wait():** the current thread releases all locks it holds and goes waiting state until another thread calls the notify() or notifyAll() method for this object
**notify():** wakes a single thread out of the multiple threads on the current object's monitor randomly
**notify():** wakes all the threads on the current object's monitor.

## 10. What is the join() method?
    Join() is a synchronization method, it will block the calling thread(the thread who call the join method) until the thread whose join method is called has completed. This can ensure that a thread has terminated.
## 11. what is yield() method
    It can stop the currently executing thread and will give a chance for other waiting threads that **have the same priority**. If there is no waiting thread or other waiting thread has low priority, then the same thread will continue to execute.
## 12. Explain thread pool
    A thread pool is a collection of pre-initialized threads to execute the current task. Since the thread already exists when the request arrives, it will eliminate the thread creation time, which will make the program more responsive.
    A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing, in other words, to save time and memory.
## 13. What is Executor Framework in Java, its different types and how to create these executors?
Java executor framework (java.util.concurrent.Executor), released with the JDK 5 is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads.
Some types of Java Executors are listed below:
**Executor 1: SingleThreadExecutor**
A single thread pool can be obtained by calling the static newSingleThreadExecutor() method of the Executors class. It is used to execute tasks sequentially.
Syntax:
ExecutorService executor = Executors.newSingleThreadExecutor();
**Executor 2: FixedThreadPool(n)**
As the name indicates, it is a thread pool of a fixed number of threads. The tasks submitted to the executor are executed by the n threads and if there is more task they are stored on a LinkedBlockingQueue. It uses Blocking Queue.
Syntax:
ExecutorService fixedPool = Executors.newFixedThreadPool(2);
**Executor 3: CachedThreadPool**
Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. Calls to execute will reuse previously constructed threads if available. If no existing thread is available, a new thread will be created and added to the pool. It uses a SynchronousQueue queue.
ExecutorService executorService = Executors.newCachedThreadPool();
**Executor 4: ScheduledExecutor**
Scheduled executors are based on the interface ScheduledExecutorService which extends the ExecutorService interface. This executor is used when we have a task that needs to be run at regular intervals or if we wish to delay a certain task.
ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);

## 14. Difference between shutdown() and shutdownNow() methods of executor
Two different methods are provided for shutting down an ExecutorService. The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

## 15. What is Atomic classes? when do we use it?
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.
Atomic classes have the methods as below:
    - set(int value): set to the given value
    - get(): get the current value
    - lazySet(int value): eventually sets to the given value
    - compareAndSet(int expect, int update): atomically sets the value to the given updated value if the current value == the expected value
    - addAndGet(int delta): atomically adds the given value to the current value
    - decrementAndGet(): atomically decrements by one the current value

## 16. What is the cocurrent collections?
The java.util.concurrent package includes a number of additions to the Java Collections Framework.
The cocurrent collections includes:
CopyOnWriteArrayList
ConcurrentHashMap
CopyOnWriteArraySet
ArrayBlockingQueue / LinkedBlockingQueue
LinkedBlockingDeque
## 17. what kind of locks you know?
**ReentrantLock:**
The class ReentrantLock is a mutual exclusion lock with the same basic behavior as the implicit monitors accessed via the synchronized keyword but with extended capabilities. As the name suggests this lock **implements reentrant characteristics** just as implicit monitors.
**ReadWriteLock:**
The interface ReadWriteLock specifies another type of lock maintaining a pair of locks for read and write access. The idea behind read-write locks is that it’s usually safe to read mutable variables concurrently as long as nobody is writing to this variable. So **the read-lock can be held simultaneously by multiple threads as long as no threads hold the write-lock**.
**StampedLock:**
StampedLock also supports read and write locks. In contrast to ReadWriteLock the locking methods of a StampedLock return a stamp represented by a long value. You can use these stamps to either release a lock or to check if the lock is still valid. Additionally stamped locks support another lock mode called optimistic locking.

## 18. What is the difference between class lock and object lock?
class lock is adding the lock on the whole class.
Object lock is adding the lock on an object.
## 19. What is the future and completableFuture?
**Future:**
- It was introduced by Java 5 (2004).
- They are basically the placeholders for a result of an operation that has not finished yet. Once the operation finishes, the Future will contain that result.
- For example, an operation can be that a Runnable or Callable instance is submitted to an ExecutorService object. The submitter can use a Future object to check whether the operation isDone(), or wait it to finish using the blocked get() method directly.

**CompletableFuture:**
- It was introduced by Java 8 (2014).
- It is in fact an evolution of the regular Future, inspired by Google's Listenable Future which is part of the Guava library.
- Allow to string the tasks together in a chain. Be used to tell some worker thread to "go to do Task x, and when you are done, go to do this other thing using the result of Task x". Using CompletableFuture, you can do something with the result of the operation without  blocking a thread actually to wait for the result.
## 20. what is ThreadLocal?
TheadLocal construct allows us to store data that will be accessible only by a specific thread.
ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
when we want to use this value from a thread, we only need to call a get() or set() method.
The ThreadLocal class is used to create thread local variables which can only be read and written by the same thread. For example, if two threads are accessing code having reference to same threadLocal variable then each thread will not see any modification to threadLocal variable done by other thread.

## 21. Type the code by your self and try to understand it. (package
    com.chuwa.tutorial.t08_multithreading)
## 22. Read those interview questions and pick some important questions to this homework.
https://www.interviewbit.com/multithreading-interview-questions/

    What are the ways to implement threa in java?
    What is Runnable and callable Interface? What is the diffrence?
    What is the start() and RUn method of thread class?
    Explain thread pool?
    What’s the purpose of the join() method?

17. Explain volatile variables in Java?

## 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
    2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
    No. 1 / 3
    a. One solution use synchronized and wait notify
    b. One solution use ReentrantLock and await, signal
Code is in folder "Hw5_Multithreading" under Coding.

## 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
    output 21-22. threads run sequence is random. (solution is in
    com.chuwa.exercise.t08_multithreading.PrintNumber1
Code is in folder "Hw5_Multithreading" under Coding.

