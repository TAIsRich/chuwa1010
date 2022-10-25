###### 1. Explain volatile variables in java? (we also use it in Singleton)
``Volatile`` variables means that multiple threads can use a method at the same time to modify the value of the volatile variable. In java, ``volatile`` tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself. 
###### 2. how to create a new thread(Please also consider Thread Pool case)?
- Extends ``thread`` class
```
public class MyThread extends Thread {
	@Override
	public void run() {
		Susyem.out.println("start new thread using extends thread");
	}
}
```
- Implements ``runnable``
```
public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Start new thread using Runnable");
	}
}
```
- Implements ``callable``
```
public class MyCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return "Start new thread using Callable";
	}
}
```
###### 3. Difference between Runnable and Callable
``Runnable`` doesn't return anything while ``Callable`` has a return type. 
###### 4. what is the diff between t.start() and t.run()?
``t.start()`` starts a new thread to execute the task while ``t.run()`` execute the task in the current thread. 
###### 5. Which way of creating threads is better: Thread class or Runnable interface?
``Thread`` is a class and threads created from here can use all methods in the ``Thread`` class. ``Runnable`` is a functional interface and has only one abstract method. To create threads from here, the abstract method must be overriden. ``Runnable`` interface doesn't provide any other methods thatcan be utilized.
###### 6. what is the thread status?
- New - when a thread is created and has not yet started to run. 
- Runnable - when a threadisready to run, waiting for the CPU. 
- Blocked - when a thread is temporarily inactive. 
- Waiting - when a thread is waiting for another thread to do something(notify or interrupt). 
- Timed waiting - when a thread class a method with a time-out parameter. 
- Terminated - when the code of the thread has been entirely executed or there occurred some unusual erroneous event that the thread has to stop. 
###### 7. difference between wait() and sleep() method
- ``t.wait()`` means the main thread stops and wait for thread t to complete its task. 
- ``t.sleep()`` take a parameter (millisecond) and means thread t will sleep for the time specified. 
###### 8. What is deadlock?
Deadlock in java is a programming situation where two or more threads are blocked forever. Java deadlock situation arises with at least two threads and two or more resources. For example, there is a task that must take both resource A and resource B to complete. If thread t1 takes resource A and thread t2 takes resource B, the task will never be completed because neither t1 or t2 has the resources needed to complete the task, and they are both waiting for the other thread to release the resource they need to complete the task. 
###### 9. how do threads communicate with each other?
There are three ways for threads to communicate with each other.
- Through commonly shared data. All the threads in the same program share the same memory space. If an object is accessible to various threads then these threads share access to that object's data member and thus communicate each other.
- By using thread control methods including suspend(), resume() and join().
- By using inter-process communication methods - wait(), notify() and notifyAll(). 
###### 10. what is join() method?
``t.join()`` means that the main thread stops and waits for thread t to complete, then the main thread will continue after t finishes its task. 
###### 11. what is yield() method
The ``yield()`` basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.
###### 12. Explain thread pool
The ``Thread Pool`` pattern helps to save resources in a multithreaded application and to contain the parallelism in certain predefined limits.When we use a thread pool, we write our concurrent code in the form of parallel tasks and submit them for execution to an instance of a thread pool. This instance controls several re-used threads for executing these tasks.
###### 13. What is Executor Framework in Java, its different types and how to create these executors?
Java ``Executor Framework`` is used to run the ``Runnable`` objects without creating new threads every time and mostly re-using the already created threads. 
###### 14. Difference between shutdown() and shutdownNow() methods of executor
The ``shutdown()`` method will allow previously submitted tasks to execute before terminating, while the ``shutdownNow()`` method prevents waiting tasks from starting and attempts to stop currently executing tasks. 
###### 15. What is Atomic classes? when do we use it?
The ``Atomic`` classes provide a lock-free and thread-safe environment or programming on a single variable. When we have a shared variable that we want to update its value in the multi-threading environment where we want to keep concurrency, we use ``Atomic`` classes.  
###### 16. What is the cocurrent collections?
``Concurrent collections`` are thread safe collections,they are designed and optimized specifically for synchronized multithreaded access. Concurrent collections include ``CopyOnWriteArrayList``, ``ConcurrentHashMap``, ``CopyOnWriteArraySet``, ``ArrayBlockingQueue``, ``LinkedBlockingQueue`` and ``LinkedBlockingDeque``. 
###### 17. what kind of locks you know?
``ReentrantLock``, ``ReadWriteLock`` and ``StampedLock``. 
###### 18. What is the difference between class lock and object lock?
- Class Lock: In java, each and every class has a unique lock usually referred to as a class level lock. These locks are achieved using the keyword ‘static synchronized’ and can be used to make static data thread-safe. It is generally used when one wants to prevent multiple threads from entering a synchronized block. 
- Object Lock: In java, each and every object has a unique lock usually referred to as an object-level lock. These locks are achieved using the keyword ‘synchronized’ and can be used to protect non-static data. It is generally used when one wants to synchronize a non-static method or block so that only the thread will be able to execute the code block on a given instance of the class.  
###### 19. What is future and completableFuture?
A ``Future`` represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. 
``CompletableFuture`` is used for asynchronous programming in Java. Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure. This way, your main thread does not block/wait for the completion of the task and it can execute other tasks in parallel.
###### 20. what is ThreadLocal?
``ThreadLocal`` variables are only allowed to be read and written by the same thread. Two threads cannot see each other’s ThreadLocal variable, so even if they will execute the same code, then there won't be any race condition and the code will be thread-safe.  
###### 21. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
See coding section. 
###### 22. Read those interview questions and pick some important questions to this home work.
- What is ExecutorService interface?
  - ExecutorService interface is basically a sub-interface of Executor interface with some additional methods or features that help in managing and controlling the execution of threads. It enables us to execute tasks asynchronously on threads.

- Explain volatile variables in Java?
  - A volatile variable is basically a keyword that is used to ensure and address the visibility of changes to variables in multithreaded programming. This keyword cannot be used with classes and methods, instead can be used with variables. It is simply used to achieve thread-safety. If you mark any variable as volatile, then all the threads can read its value directly from the main memory rather than CPU cache, so that each thread can get an updated value of the variable.
###### 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
a. One solution use synchronized and wait notify
```
public class OddEvenPrinter {
	private static final Object monitor = new Object();
	private static int cur = 1;

	public static void main(String[] args) {
		PrintRunnable runnable = new PrintRunnable();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}

	static class PrintRunnable implements Runnable {
		@Override
		public void run() {
			synchronized (monitor) {
				while (cur <= 10) {
					System.out.println(Thread.currentThread().getName() + ": " + cur++);
					monitor.notify();
					try {/-
						if (cur < 11) {
							monitor.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
```
b. One solution use ReentrantLock and await, signal
```
public class OddEventPrinter {
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static int cur = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                while (cur <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + cur++);
                    condition.signal();
                    try {
                        if (cur < 11) {
                            condition.await();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
```
###### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)
```
public class PrintNumber {
	private static int n = 1;

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> printNumber());
		Thread t2 = new Thread(() -> printNumber());
		Thread t3 = new Thread(() -> printNumber());
		t1.start();
		t2.start();
		t3.start();
	}

	private static synchronized void print() {
		int cnt = 10;
		while (cnt-- > 0) {
			System.out.println(Thread.currentThread().getName() + ": " + n++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		PrintNumber.class.notifyAll();
	}
}
```
