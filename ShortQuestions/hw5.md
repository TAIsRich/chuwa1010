### 1
volatile keyword would remind the compiler that this variable would be changed anytime, and the compiler would read the variable from its address rather than store it in register, will cause some conflict.   
### 2
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
### 3
Runnable has no return. 
Callable has a return
### 4
`t.start()` will create a new thread and run it otherwise 
`t.run()` will run thread in main thread and not create a new thread.
### 5
If we want to extend another class, in this case we can not extend the Thread class, but use Runnable interface can solve this conflict.
### 6
Thread status are 
new, runnable, blocked, waiting, timed_waiting, terminated.
Java use a static inside enum class to record it and we can call getState() to get a thread's status.
### 7 
`wait()` is in Object class, would release the lock. And it would let the thread be waiting until get notified.

`sleep()` is in Thead class, only thread object can call it and it would not release the lock, and it would sleep in a specific period, if timeout, it would awake.
### 8
`Dead lock` is a condition that two or more thread are waiting for locked resource from each other. In this case no one would release theirs resource, but their all need other resource from other thread to finish their task. 
So all the thread can not complete their work and all thread are waiting all the time.
### 9
When we need a thread to operate, use `notify()` or `notifyAll()` to wake up and run a thread, then use `wait()` to release the resource from this thread to give chances to other threads to get resource.
### 10
`join()` when t.join() called, the current thread must waiting for t done its task, then the current thread can continue.
### 11
`yield()` when t.yield() called, the running t would become to ready status and would compete CPU with other thread again to run.
### 12
Thread pool can help us to handle multiple threads to avoid create and destroy thread by ourselves too often and lower the performance too much.
### 13
Executor is a tool class to create thread pool. 
`FixedThreadPool`  ExecutorService executor = Executor.newFixedThreadPool(n);

`CachedThreadPool` ExecutorService executor = Executor.newCachedThreadPool();

`SingleThreadExecutor`  ExecutorService executor = Executor.newSingleThreadExecutor ();
### 14
`shutdown()` will wait for the running thread competing and then shutdown, however the `shutdownNow()` would shut it down immediately, no matter whether any thread is running.
### 15
Atomic class support atomic operations to make sure thread safe without lock.
It is suitable for Counter and Accumulator.

### 16 
cocurrent collections is thread safe collections that java supported.

### 17
`ReetrantLock` a lock class that can be use for synchronized block

`ReadWriteLock` when one thread are writing, on any other thread can read or write. But if no thread are writing, all thread can read.

`StampedLock` allow write when a thread are reading,

### 18
`object lock` is a normal lock a object to make sure this object can only be accessed by one thread everytime

`class lock` is use for static function and static blocks.

### 19
Since Callable would have a return and our program are asynchronisn, We might not get a return immediately, the `Future` class can call the asynchronic result.
Because we do not know when can we get the return result, if we only use the `Future` , we might have to check the return many times to get the result. But the 
`CompletableFuture` will get the return result automatically when a callable thread competed.

### 20

A ThreadLocal can creat a temporary variable that only can be accessed by a specific thread
### 22
1.  Explain thread priority.
```angular2html
thread class gives the getPriority and setPriority funtions, it is a way to know and set the chance of a thread can be executed earlier or later than other threads.
```
2. What will happen if we don’t override the thread class run() method?
```angular2html
nothing will be executed cause no code inside of the run function
```