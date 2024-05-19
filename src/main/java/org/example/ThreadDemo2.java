package org.example;

public class ThreadDemo2 implements Runnable{

    public static void main(String[] args) {
        ThreadDemo2 demoObject = new ThreadDemo2();
        Thread thread = new Thread(demoObject);
        thread.start();
        System.out.println("Outside of a thread");
    }

    public void run() {
        System.out.println("Inside of a thread");
    }
}
