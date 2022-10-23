**Q1**

volatile: to ensure that updates to variables propagate predictably to other threads which could help thread-safe.

**Q3**

Callable requires return while Runnable does not require.

**Q4**

t.start() will create a new thread to execute while t.run() execute at the current thread.

**Q5**

Runnable is better. If we choose to extend Thread class, we can't extend any other class which we require. (Java does not allow inheriting more than one class). While implementing Runnable, we can save space for the class to extend any other class in future or now.

**Q6**

New: create a thread but not uses start() method it yet.

Runnable: includes ready and running. Ready means the thread has been used start() but not execution yet. Running means it has been executed.

Blocked: thread is blocked by lock.

Waiting: thread is waiting for some execution like notify or join.....

Timed Waiting: could return after specified time since sleep() is used

Terminated: thread has finished execution.

**Q7**

Wait() releases the lock which could be used in the synchronized context while sleep() does not release any lock while waiting.

**Q8**

Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. Since, both threads are waiting for each other to release the lock.

**Q9**

They could use commonly shared data in the memory space or use inter-thead communication methods like wait() -> release the lock, notify() -> wake a single thread, notifyAll() -> wake up all threads

**Q10**

Join() allows one thread to wait until another thread completes its execution.

**Q11**

Yield() will stop current executing thread and let other waiting threads of the same priority to execute

**Q12**

Thread pool is a collection of worker threads that efficiently execute asynchronous callbacks on behalf of the application. It is primarily used to reduce the number of application threads and provide management of the worker threads.

**Q13**

Executor Framework contains a bunch of components that are used to efficiently manage multiple threads. It provides SingleThreadExecutor, FixedThreadPool, CachedThreadPool and ScheduledExecutor.

E: 
```java
ExecutorService es = Executors.newSingleThreadExecutor();

ExecutorService fixedPool = Executors.newFixedThreadPool(4);

ExecutorService es3 = Executors.newCachedThreadPool();

ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
```

**Q14**

shutdown() will no accept new tasks but tasks already submitted will continue to run.

shutdownNow() will try to cancel the already submitted tesks by interupt the relevant threads. But if interruption is ignored, it will do the same as shutdown().

**Q15**

The atomic classes provide a lock-free and thread-safe environment or programming on a single variable. It minimizes synchronization and help avoid memory consistency errors. Therefore, it ensures synchronization.

**Q16**

Concurrent Collections provide thread-safe collections for us like ConcurrentHashMap, CopyOnWriteArrayList, ArrayBlockingQueue.

**Q17**

ReentrantLock, ReadWriteLock, StampedLock

**Q18**

Using object lock, multiple objects of class may exist and every object has it’s own lock. While, there is always one class’s class lock available.

**Q19**

Future: could used to represent an object which could get result in the future which is the result of an asynchronous computation.

CompletableFuture: improves Future. When asynchronous tasks finish or occur error, it will automatically return object' method like thenAccept(), exceptional(), thenApplyAsync, anyOf, allOf. Also able to realize serialization or parallelization.

**Q20**

ThreadLocal: it enables us to create variables that can only be read and written by the same thread.

