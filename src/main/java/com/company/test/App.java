package com.company.test;

public class App {
    public static void main(String args[]) {
        while (true) {
            System.out.println("Hello, world!");
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}