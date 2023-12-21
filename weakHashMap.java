package core1.basics;

import java.util.*;
public class weakHashMap {

    private static WeakHashMap wmap;
    public static void main (String args[]) {
        wmap = new WeakHashMap();
        wmap.put(new String("Maine"), "Augusta");

        Runnable runner = new Runnable() {
            public void run() {
                while (wmap.containsKey("Maine")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {
                    }
                    System.out.println("Thread waiting");
                    System.gc();
                }
            }
        };
        Thread t = new Thread(runner);
        t.start();
        System.out.println("Main waiting");
        try {
            t.join();
        } catch (InterruptedException ignored) {
        }
    }
}