package org.example;

public class ThreadDemo3 extends Thread {

    public static void main(String[] args) {
        printRandomNumber();
    }

    public static void printRandomNumber() {
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    //System.out.println("Thread: " + getName() + " running.");
                    System.out.print(getName());
                }
            }.start();
        }
    }
}

