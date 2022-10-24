#### 1.  Explain volatile variables in java? (we also use it in Singleton

Volatile variables is a kind of volatile variables will pass immediately after variables changed, can let the whole system knows the updates at the first time

#### 2.how to create a new thread(Please also consider Thread Pool case)?

We can use Thread extends to create a child object of the thread. Or we can use Runnable interface to create a non-returnable new thread, use Callable interface to create a returnable new thread.

#### 3.Difference between Runnable and Callable?

Runnable will not return anything, but Callable will return

#### 4.what is the diff between t.start() and t.run()?

t.run() will run the code by current thread, t.start() will create a new thread or assign a free thread then run the code.

#### 5.Which way of creating threads is better: Thread class or Runnable interface

It depends on what you need. My runnable interface has only a run method. But Thread class is a built- in object in Java, which means Thread class has everything a thread need, a fully functional thread can be created by thread class 

#### 6.what is the thread status?

new, runnable,blocked,waiting,timed_waiting,terminated

#### 7. difference between wait() and sleep() method?

wait method tells the calling thread (a.k.a Current Thread) to wait until another thread invoke’s the notify() or notifyAll() method for this object, The thread waits until it reobtains the ownership of the monitor and Resume’s Execution. Sleep() Method is used to pause the execution of current thread for a specified time in Milliseconds. Here, Thread does not lose its ownership of the monitor and resume’s it’s execution

#### 8.  What is deadlock?

two or more threads have parts of resource but they all need all resource to complete the task, so now they trap into a endless wait-loop, they wait each other to release resource but neither of them will release resource until their own job done.

#### 9.  how do threads communicate with each other?

wait & Notify method

#### 10. what is join() method ? 

Join() is a method  of wait and continue, a thread call join(),then it will stop and wait for other thread to complete its task, after other thread done, this hread will continue to do its own task



#### 11. what is yield() method?

A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.

#### 12. Explain thread pool ?

Thread pool is another way to create thread, not only by new Thread. Developer can created a thread pool with multiple threads and a task queue will assign task to each different thread to do works. Because deleted a thread after job done is too expensive for our computer, so left thread free and wait for next task is a good choice.

#### 13. What is Executor Framework in Java, its different types and how to create these executors ?

Executor is a Framework and interface in java to create thread pool. after we use ExecutorService to create a object, we can use this object to submit task

ExecutorService executor = Executors.newFixedThreadPool(4)



#### 14. Difference between shutdown() and shutdownNow() methods of executor?

The shutdown() method will allow previously submitted tasks to execute before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.

#### 15. What is Atomic classes? when do we use it

Atomic class is a kind of thread class,which can secure the safety with no lock engage.

when we use counter or iteator or CAS, we can use Atomic class



#### 16.What is the cocurrent collections

Collections is a part of Java built-in objects, but all of those objects are non-thread-safe.

So in order to use thread-safe collections, java also provide concurrent Collections. Which have almost same functionality of regular collections but they are all thread safe

#### 17.what kind of locks you know?

regular lock, deadlock(all right, this is not a real lock),ReentrantLock,ReadWriteLock, StampedLock

#### 18.What is the difference between class lock and object locck?

Object level lock is mechanism when we want to synchronize a non-static method or non-static code block such that only one thread will be able to execute the code block on given instance of the class. Class level lock prevents multiple threads to enter in synchronized block in any of all available instances of the class on runtime.

#### 19.What is future and completableFuture?

Future work for callable interface, which take the return value of callable. Since Future might be asynchronous, completableFuture can fix this problem. CompletableFuture feature can assign how to deal with Future asynchronous by developer. Usually it will automatically call the callback method of the callback object

#### 20.what is ThreadLocal?

 ThreadLocal can put a variable into local,or context. which can save time and memory for function premeter pass.

#### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

#### 22.Read those interview questions and pick some important questions to this home work



### What are the two ways of implementing thread in Java?

class ThreadExample extends Thread{

public void run(){

System.out.println("My thread had been created ");

}

public static void main(string args[]){

ThreadExample obj1 = new ThreadExample();

obj1.start();

}

}



class ThreadExample implements Runnable{

public void run(){

System.out.println("my runnable thread had been created");

}

public static void main(string args []){

ThreadExample obj = new ThreadExample();

Thread X = new Thread(obj)

X.start();

}

}





























