###  Explain volatile variables in java? 
Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem. The volatile keyword can be used either with primitive type or objects.

### how to create a new thread(Please also consider Thread Pool case)?
1. Inherit Thread class and use new.
```
class MyThread extends Thread{
...
@override
public void run(){...}
}
...
public static void main(String[] args){
MyThread my = new MyThread;
}
```
2. Implement Runnable interface and new thread in static proxy way.
```
class MyThread implements Runnable{
...
@override
public void run(){...}
}
...
public static void main(String[] args){
Thread my = new Thread(new MyThread);
}
```

### Difference between Runnable and Callable
Runnable has no return, while Callable has a return.

### what is the diff between t.start() and t.run()?
**t.start()** will create a new thread and run it otherwise
**t.run()** will run thread in main thread and not create a new thread.

### Which way of creating threads is better: Thread class or Runnable interface?
It is preferred to implement a Runnable interface instead of extending Thread class. 
As implementing Runnable makes your code loosely coupled as the code of thread is different from the class that assign job to the thread. 
It requires less memory and also allows a class to inherit any other class.

###  what is the thread status?
new, runnable, blocked, waiting, timed_waiting, terminated.

###  difference between wait() and sleep() method
The major difference is that wait() releases the lock while sleep() doesn't release any lock while waiting.
wait() is used for inter-thread communication while sleep() is used to introduce a pause on execution, generally.

### What is deadlock?
Deadlock is a condition that two or more thread are waiting for locked resource from each other. In this case no one would release theirs resource, but their all need other resource from other thread to finish their task.

### how do threads communicate with each other?
When we need a thread to operate, use `notify()` or `notifyAll()` to wake up and run a thread, then use `wait()` to release the resource from this thread to give chances to other threads to get resource.

### what is join() method?
when t.join() called, the current thread must waiting for t done its task, then the current thread can continue.

###  what is yield() method
when t.yield() called, the running t would become to ready status and would compete CPU with other thread again to run.
### Explain thread pool
a thread pool is a software design pattern for achieving concurrency of execution in a computer program. 
Often also called a replicated workers or worker-crew model, a thread pool maintains multiple threads waiting for tasks to be allocated for concurrent execution by the supervising program.
### What is Executor Framework in Java, its different types and how to create these executors?
The java.util.concurrent.Executors provide factory methods that are being used to create ThreadPools of worker threads. 
Thread pools overcome this issue by keeping the threads alive and reusing the threads.
### Difference between shutdown() and shutdownNow() methods of executor
shutdown() will wait for the running thread competing and then shutdown, however the shutdownNow() would shut it down immediately, no matter whether any thread is running.
###  What is Atomic classes? when do we use it?
The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It also supports atomic operations. All the atomic classes have the get() and set() methods that work on the volatile variable. The method works the same as read and writes on volatile variables.
### What is the cocurrent collections?
cocurrent collections is thread safe collections that java supported.

### what kind of locks you know?
- ReetrantLock a lock class that can be use for synchronized block
- ReadWriteLock when one thread are writing, on any other thread can read or write. But if no thread are writing, all thread can read.
- StampedLock allow write when a thread are reading,
### What is the difference between class lock and object lock?
1. Object Level Locks − It can be used when you want non-static method or non-static block of the code should be accessed by only one thread.
2. Class Level locks − It can be used when we want to prevent multiple threads to enter the synchronized block in any of all available instances on runtime
### What is future and completableFuture?
Since Callable would have a return and our program are asynchronisn, We might not get a return immediately, the Future class can call the asynchronic result. Because we do not know when can we get the return result, if we only use the Future , we might have to check the return many times to get the result. 
But the CompletableFuture will get the return result automatically when a callable thread competed.
### what is ThreadLocal?
A ThreadLocal can creat a temporary variable that only can be accessed by a specific thread

### Read those interview questions and pick some important questions to this homework.
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
### 
### 

