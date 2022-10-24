#Homework 5

### 1.  Explain volatile variables in java? (we also use it in Singleton)
Fields declared volatile in java has their value updated immediately after such change, which is useful when we employ thread-safe structures such as singleton to make sure the check for instance is valid all the time.
### 2.  how to create a new thread(Please also consider Thread Pool case)?
```
Thread thread = new Thread();
thread.start();
```
```
Thread thread = new Thread(new MyRunnable());
```
### 3.  Difference between Runnable and Callable
Runnable has a void method to be implemented, while Callable has to return value.
### 4.  what is the diff between t.start() and t.run()?
`t.starts()` only makes a thread runnable, while `t.run()` actually runs the tasks in the method body.  
### 5.  Which way of creating threads is better: Thread class or Runnable interface?
Runnable interface is better, because a class can implements multiple interfaces while can only be able to extend one parent class. Using runnable interface makes it easier for any class to become a thread.
### 6.  what is the thread status?
- New: The object is initiated
- Runnable: The thread is either ready to run or is running
- Blocked: The thread is blocked in a lock
- Waiting: The thread is waiting for responses from other threads
- Timed_Waiting: The thread is waiting for a set time
- Terminated: The thread has done executing tasks and ended 
### 7. difference between wait() and sleep() method
`wait()` would release the lock on the current object under the synchronized context, while sleep() does not do anything with the lock.
### 8.  What is deadlock?
A deadlock occurs when there are two threads both waiting for the lock to be released by the other thread after finishing up operating on the object that the lock is on, while it will never be released because the necessary object is used by the other thread.
### 9. how do threads communicate with each other?
They can use `notify()` to wake up the other thread and use `wait()` to sleep to release the lock.
### 10. what is join() method?
A thread can use `theOtherThread.join()` method to wait for the other thread to finish then continue to do its own tasks.
### 11. what is yield() method
Depending on the processor platform, `yield()` will put the current thread into sleep and give priority to other thread to be executed and to be put back in execution some time in a non-deterministic manner.

### 12. Explain thread pool
### 13. What is Executor Framework in Java, its different types and how to create these executors?
### 14. Difference between shutdown() and shutdownNow() methods of executor
### 15. What is Atomic classes? when do we use it?
### 16. What is the concurrent collections?
### 17.  what kind of locks you know? 
### 18. What is the difference between class lock and object lock?
### 19. What is future and completableFuture?
### 20. what is ThreadLocal?
### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
### 22. Read those interview questions and pick some important questions to this home work.
### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
a. One solution use synchronized and wait notify 
b. One solution use ReentrantLock and await, signal
### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)