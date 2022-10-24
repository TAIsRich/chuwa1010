1. The volatile keyword guarantees visibility of changes to variables across the threads.
1. There are three ways in Java to create a thread including extends Thread class, implements Runnable interface and implements Callable interface. Also we can create a thread pool first and then pass the threads we want to run into it.
1. Runnable has no return but Callable has.
1. t.start() starts a new thread to execute the task and t.run() execute the task in the current thread.
1. The Runnable interface is better since the class can inherit multiple interfaces but can only inherit one class.
1.  
   1. New: a new thread object is created
   1. Runnable: the thread is ready to run or is running
   1. Blocked: the thread is blocked on the lock
   1. Waiting: the thread is waiting for another thread to preform a particular action
   1. Timed_waiting: the thread is waiting for another thread to perform an action for up to a specified waiting time
   1. Terminated: the thread was exited

1. wait() would release the synchronize lock but sleep() won't.
1. Deadlock means that two threads are blocked forever because that they are waiting for each other.
1. Threads can use wait method to let itself stop until other threads using notify method to invoke it.
1. join() would let the thread call it goes into waiting state until the referenced thread terminated.
1. Calling yield() method means that the current thread can be temporarily paused and other threads can execute.
1. A thread pool is a collection of pre-created threads which can be reused to execute tasks, which can save the resources used to created a new thread every time.
1. Executor framework is been used to create thread pool, and its implementation including FixedThreadPool, CachedThreadPool, and SingleThreadExecutor.
1. shutdown() method allows the previously submitted tasks to execute before terminating, but shutdownNow() method doesn't.
1. The atomic classes provide a lock-free and thread-safe environment or programming on a single variable and it supports atomic operations on those variables, which allows us to ensure the thread safety without applying lock on it.
1. Cocurrent collections are the implementations of the collections interfaces which keeps the thread safety.
1. We have ReentrantLock, ReadWriteLock, and StampedLock.
1. Class lock prevent multiple threads to enter the synchronized block in any of the instances of that class and object lock prevent the multiple access to a block in each of the object of a class.
1. A Future represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. And a CompletableFuture is a future which supporting dependent functions and actions that trigger upon its completion.
1. For each threads that accesses a TreadLocal variable has its own independently initialized copy of the variable.
1. See MavenProject/src/main/java/multithreading for the code of later questions.

