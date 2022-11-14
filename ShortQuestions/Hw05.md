#### 1. Explain volatile variables in java? (we also use it in Singleton)
```
Volatile keyword is used to modify the value of a variable by different threads. 
It is also used to make classes thread safe.
```
#### 2. how to create a new thread(Please also consider Thread Pool case)?
```
1. extends Thread class
2. Implements Runnable
3. Implements Callable
4. use Thread pool
```
#### 3. Difference between Runnable and Callable
| Runnable                  | Callable            |
|:--------------------------|:--------------------|
| cannot throw an exception | can throw exception |
| use run() method          | use call() method   |
| don't have return         | have return value   |

#### 4. what is the diff between t.start() and t.run()?
| t.start()                                                                 | t.run()                                                                         |
|:--------------------------------------------------------------------------|:--------------------------------------------------------------------------------|
| create a new thread and the run() is executed on the newly created thread | no new thread is created and the run() is executed on the calling thread itself |
| cannot be invoke more than one time otherwise throw exception             | Multiple invocation is possible                                                 |
#### 5. Which way of creating threads is better: Thread class or Runnable interface?
```
it is preferred to implement a Runnable interface instead of extending Thread class
```
#### 6. what is the thread status?
```
New: a new thread is created, the thread has not yest started to run

Runnable: either running or ready for execution but it's waiting for resource allocation

Blocked: waiting to acquire a monitor lock to enter or re-enter a synchronized block/method

Waiting: waiting for some other thread to perform a particular action without any time limit

Timed Waiting: waiting for some other thread to perform a specific action for a specified period

Terminated: has completed its execution
```
#### 7. difference between wait() and sleep() method
| wait()                                          | sleep()                                                    |
|:------------------------------------------------|:-----------------------------------------------------------|
| belongs to Object class                         | belongs to Thread class                                    |
| releases lock during Synchronization            | does not release the lock on object during Synchronization |
| should be called only from Synchronized context | There is no need to call sleep() from Synchronized context |
| not a static method                             | a static method                                            |
#### 8. What is deadlock?
```
Deadlock is a situation where a set of processes are blocked because each process is holding a resource and waiting for another resource acquired by some other process. 
```
#### 9. how do threads communicate with each other?
```
wait()
notify()
notifyAll()
```
#### 10. what is join() method?
```
Join() allows one thread to wait until another thread completes its execution
```
#### 11. what is yield() method
```
A yield() method is a static method of Thread class.
it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
```
#### 12. Explain thread pool
```
A thread pool reuses previously created threads to execute current tasks 
and offers a solution to the problem of thread cycle overhead and resource thrashing
```
#### 13. What is Executor Framework in Java, its different types and how to create these executors?
```
Executor Framework is used to run the Runnable objects without creating new threads every time and mostly re-using the already created threads. 
```

Types of Java Executors
```
1. SingleThreadExecutor: 
ExecutorService executor = Executors.newSingleThreadExecutor();

2. FixedThreadPool(n)+ :
ExecutorService fixedPool = Executors.newFixedThreadPool(2);

3. CachedThreadPool:
ExecutorService executorService = Executors.newCachedThreadPool();

4. ScheduledExecutor:
ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
```
#### 14. Difference between shutdown() and shutdownNow() methods of executor
```
shutdown() will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run
shutdownNow() will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads. 

if your tasks ignore the interruption, shutdownNow will behave exactly the same way as shutdown
```
#### 15. What is Atomic classes? when do we use it?
```
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable.
```
#### 16. What is the concurrent collections?
```
Concurrent collections in java are designed and optimized specifically for synchronized multithreaded access. 
These are the thread safe collections
```
#### 17. what kind of locks you know?
```
1. ReentrantLock
2. ReadWriteLock
3. StampedLock
```
#### 18. What is the difference between class lock and object lock?
| Object Lock  | Class Lock |
|:-------------|:-----------|
|It can be used when you want non-static method or non-static block of the code should be accessed by only one thread|It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime|
|It should always be used to make non-static data thread safe. |It should always be used to make static data thread safe. |
|Every object the class may have their own lock|Multiple objects of class may exist but there is always one class’s class object lock available|
#### 19. What is future and completableFuture?
```
Future: A Future interface provides methods to check if the computation is complete, to wait for its completion and to retrieve the results of the computation. 
CompletableFuture: A CompletableFuture is an extension to Java's Future API
```
#### 20. what is ThreadLocal?
```
A thread pool reuses previously created threads to execute current tasks 
and offers a solution to the problem of thread cycle overhead and resource thrashing
```
#### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
#### 22. Read those interview questions and pick some important questions to this homework.
#### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
```java
public class OddEvenPrinter {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
    
    static class PrintRunnbale implements Runnable {
        @Override
        public void run(){
            synchronized (monitor) {
                while (value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try{
                        if (value < 11){
                            monitor.wait();
                        }
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

```