package com.chuwa.pattern.singleton.demo3;

// Lazy Load:  Class loading would not result in creating object,
// the object will only be created when we refer it for the first time
// method 1: thread-unsafe



public class Singleton {
    // private constructor
    private Singleton() {}

    //declare variable (not create)
    // note here we have not initialized instance!
    private static Singleton instance;

    //provide public access
    // note here getInstance would not just return
    public static synchronized Singleton getInstance(){
        /*
        We cannot just do below, because we might create many object by this public method:
        instance = new Singleton();
        return instance;
        */

        // so we have to check if instance has been created before we try to use getInstance()
        // if not, we create one and return, else we directly return that existed instance

        //We add synchronized key word in method signature just because of multithreading safe in below:
        if (instance==null){
        // imagine now thread1 enters the block when instance is null. Suddenly thread1 waits here and have not new Singleton()
        // then thread2 is running, since now instance is still null, thread2 also enters this block
        // in this case, thread1 and 2 will eventually create two objects, this is not what we want for Singleton
            instance = new Singleton();
        }
        return instance;
    }
}
//NOTE: when we add "synchronized" keyword in the method, it means that only one thread can use that method until it is done
// in this way, when thread1 is using getInstance(), and it enters the if(instance==null) block but haven't created object
// now suddenly thread1 waits and thread2 is running, this time thread2 is not gonna use getInstance()
//because thread1 locks this method by keyword synchronized as thread1 have not finish using getInstance()
// so thread2 can only wait until thread1 finishes and unlock getInstance(), then thread2 will use the method and lock again
// but this time when thread2 goes to the if clause, it will not create object because thread1 have already done so.
// this ensures our expectation for singleton even in multithreading.