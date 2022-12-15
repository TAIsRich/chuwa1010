package org.example.singleton;

public class Singleton {

        // singleton <- creational design pattern
        // early Instantiation: creation of instance at load time

        // private constructor
        private  Singleton(){}

        // instantiate
        // static for getting the object
        private static Singleton instance = new Singleton();

        //provide public method for getting the object
        public static Singleton getInstance(){
                return instance;
        }




}