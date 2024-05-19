package org.example;

public class ThreadDemo1 extends Thread {

    public static void main(String[] args) {
        ThreadDemo1 thread = new ThreadDemo1();
        thread.start();
        System.out.println("Outside of a thread");
    }
    public void run() {
        System.out.println("Inside of a thread");
    }

}
