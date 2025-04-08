package com.example.thread;

import java.util.LinkedList;

public class Consumer implements Runnable {

    private final LinkedList<Integer> buffer;

    // ✅ Proper constructor (outside main or any method)
    public Consumer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                System.out.println("Consumer is waiting...");
                buffer.wait(); // waits until producer notifies
            }

            int num = buffer.removeFirst();
            System.out.println("Consumer consumed: " + num);
            buffer.notifyAll();
            Thread.sleep(5); // simulate processing time
        }
    }
}
