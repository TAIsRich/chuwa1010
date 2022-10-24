package com.chuwa.pattern.singleton.demo4;

// Singleton: Lazy Load
// dual check method (need to remember)

public class Singleton {
    private Singleton() {}

    private static volatile Singleton instance;

    public static Singleton getInstance(){

        // first check: if instance is not null, we don't have to add lock, just return instance
        if (instance==null){
            // if instance is null, we add lock here for the Singleton Object
            // we put the lock here just for more efficiency of multithreading,
            // the lock is actually a block leads by synchronized (Object.class) {...}
            // when one thread goes out from that block, it will unlock the block
            synchronized (Singleton.class){
                //second check, if now instance is null, we create instance, else just return
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
//1
// In multithreading concept, read operation is thread-safe while write operation is not.
// "instance = new Singleton();" is a write operation while "return instance;" is a read operation

//this means we don't have to lock the entire method for a thread like demo3,
// because it is less efficient, imagine many threads should wait outside of method just for one thread
// so instead, we can find a way to add lock somewhere else inside getInstance() method
// * when we say add lock, we mean add keyword synchronized in some clause

//example: thread1,2,3 comes into getInstance() together, and they will all face (line:17): synchronized (Singleton.class),
// this clause allows only one thread coming into the block, let's say thread2 gets in and 1,3 wait,
// so thread2 will firstly create Singleton, then thread2 leaves that synchronized block
//, now thread1 and 3 will go into the block one by one. This time, instance is created by thread2 so 1 and 3 will skip for the SECOND check
// as a result, no new instance will be created.
// from now on, all the later thread that gets in getInstance() will skip in the FIRST check (line:14),
// those threads even have no chance to reach synchronized lock block, and will just return directly.
// In this case we can find out the efficiency of this dual check method

//2
// a common problem in multithreading is the null pointer.
// use keyword volatile can solve the problem bring by null pointer
// where do we put this keyword? -- In the variable declaration

//example: same situation that thread1,2,3 comes together and face (line:17), and we still say thread2 gets in the synchronized block
// after thread2 creates the object and finishes, then maybe thread1 gets in, actually what thread1 sees about instance is still null
//this is because of some inner issue of JVM,
// the information that instance is created by thread2 hasn't been updated to all other thread that quick
// just after thread2 created it, thread1 goes to the second check, it happens too fast so thread1 still see instance as null
// then thread1 will also create an object. This happens to thread3 again as they happen to be so close to each other.
// from now on, when thread after 1,2,3 use getInstance(), it will skip and return in the first check. They have no chance to lock something,
// but the problem is, we still have 3 Singleton Objects because of thread1,2,3!.
// ** This is why we need keyword volatile when we declare the variable instance,
// ** after using it, the information that thread2 created an instance will be immediately updated to all threads, including 1 and 3.
