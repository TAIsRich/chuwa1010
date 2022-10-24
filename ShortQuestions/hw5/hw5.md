1. Explain volatile variables in java? 

- For Java, “volatile” tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself.

2. how to create a new thread(Please also consider Thread Pool case)?

```
// method 1
Thread t1 = new MyThread();

// method 2
Thread t2 = new Thread(new MyRunnable());

// method 3
Thread t3 = new Thread(() -> {
            System.out.println("start new thread!");
        });
        
// method 4
Callable<String> callable = new MyCallable();
ExecutorService executor = Executors.newFixedThreadPool(5);
Future<String> future = executor.submit(callable);
```

3. Difference between Runnable and Callable

- A callable interface throws the checked exception and returns the result. A runnable interface, on the other hand, shows the result or throws an exception, but does not do both.

4. what is the diff between t.start() and t.run()?

- t.start() starts a new thread to excute the task, t.run() excute the task in the current thread.
- We can't call the start() method twice otherwise it will throw an IllegalStateException whereas run() method can be called multiple times as it is just a normal method calling.

5. Which way of creating threads is better: Thread class or Runnable interface?

- Implementing Runnable is the preferred way to do it. Because, we’re not really specializing or modifying the thread’s behavior. We’re just giving the thread something to run.

6. what is the thread status?

-NEW
-RUNNABLE
-WAITING
-BLOCKED
-TIMED_WAITING
-TERMINATED

7. difference between wait() and sleep() method

- The major difference is that wait() releases the lock while sleep() doesn't release any lock while waiting.

8. What is deadlock?

- Deadlock is a situation where two or more threads are blocked forever.

9. how do threads communicate with each other?

- Java uses three methods, namely, wait(), notify(), and notifyAll().

10. what is join() method?

-  Join method in Java allows one thread to wait until another thread completes its execution.

11. what is yield() method?

- A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.

12. Explain thread pool

- Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

13. What is Executor Framework in Java, its different types and how to create these executors?

- What is Executor Framework in Java is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. 
- SingleThreadExecutor:
```
ExecutorService executor = Executors.newSingleThreadExecutor();
```
- FixedThreadPool(n):
```
ExecutorService fixedPool = Executors.newFixedThreadPool(2);
```
- CachedThreadPool:
```
ExecutorService executorService = Executors.newCachedThreadPool();
```
- ScheduledExecutor:
```
ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
```

14. Difference between shutdown() and shutdownNow() methods of executor

- The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

15. What is Atomic classes? when do we use it?

- The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.
- Atomic variables and operations are used in concurrency when multiple threads shares a common object.

16. What is the concurrent collections?

- The concurrent collections are a set of collections APIs that are designed and optimized specifically for synchronized multithreaded access, and achieve thread-safety..

17. what kind of locks you know?

- ReentrantLock, ReadWriteLock, StampledLock

18. What is the difference between class lock and object lock?

- Object Level Locks: It can be used when you want non-static method or non-static block of the code should be accessed by only one thread. 
- Class Level locks : It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime.

19. What is future and completableFuture?
- A Future represents the result of an asynchronous computation. A CompletableFuture is an extension to Java's Future API.
- Limitations of Future:
    - It cannot be manually completed : Let’s say that you’ve written a function to fetch the latest price of an e-commerce product from a remote API. Since this API call is time-consuming, you’re running it in a separate thread and returning a Future from your function. Now, let’s say that If the remote API service is down, then you want to complete the Future manually by the last cached price of the product. Can you do this with Future? No!
    - Future does not notify you of its completion. It provides a get() method which blocks until the result is available. You don’t have the ability to attach a callback function to the Future and have it get called automatically when the Future’s result is available.
    - Multiple Futures cannot be chained together : Sometimes you need to execute a long-running computation and when the computation is done, you need to send its result to another long-running computation, and so on. You can not create such asynchronous workflow with Futures.
    - You can not combine multiple Futures together : Let’s say that you have 10 different Futures that you want to run in parallel and then run some function after all of them completes. You can’t do this as well with Future.
    - No Exception Handling : Future API does not have any exception handling construct.
- That’s why we have CompletableFuture. You can achieve all of the above with CompletableFuture.

20. what is ThreadLocal?

- The ThreadLocal class in Java allows programmers to create variables that are accessible only to the thread that created them. This is useful for creating thread-safe code, as it ensures that each thread has its own copy of a variable and can not interfere with other threads.

21. Type the code by yourself and try to understand it. (package
com.chuwa.tutorial.t08_multithreading)
22. Read those interview questions and pick some important questions to this home
work.
- a. What is Multi-threading?
    - Multi-threading is a process of executing two or more threads concurrently, utilizing available CPU resources.
    - A single thread is a lightweight sub-process and the smallest unit of processing. Threads are independent, if any exception occurs in one thread, it does not affect other threads.
- b. Why wait, notify and notifyAll methods are defined in the Object class instead of Thread class?
    - The methods wait, notify and notifyAll are present in the Object class, that means they are available to all class objects, as Object class is the parent of all classes.
23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. 
- Pleas check folder: Coding/junyi_eij/my_java_exercise/src/main/java/com/chuwa/multithreading
24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random.
- Pleas check folder: Coding/junyi_eij/my_java_exercise/src/main/java/com/chuwa/multithreading