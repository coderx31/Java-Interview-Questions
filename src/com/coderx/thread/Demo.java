package com.coderx.thread;

public class Demo {
    public static void main(String[] args) {
//        New Thread creation: When a program calls the start() method,
//        a new thread is created and then the run() method is executed.
//        But if we directly call the run() method then no new thread will
//        be created and run() method will be executed as a normal method
//        call on the current calling thread itself and no multi-threading
//        will take place.

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("From t1: " +i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("From t2: " +i);
                }
            }
        });

        //t1.start(); // this will create a new Thread and then execute the run() method
        //t1.run(); // this won't create a new Thread, it will normally execute the run() method
//        t1.start();
//        t2.start();
//        t1.run();
//        t2.run();

        for(int i=0; i<10; i++){
            System.out.println("From main method: " +i);
        }
    }

}
