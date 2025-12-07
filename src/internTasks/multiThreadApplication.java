package internTasks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int counter = 0;
    private final Lock lock = new ReentrantLock();
    public void increment() {
        lock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }
}

class WorkerThread extends Thread {
    private final SharedResource resource;

    public WorkerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class multiThreadApplication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new WorkerThread(sharedResource);
        Thread t2 = new WorkerThread(sharedResource);
        Thread t3 = new WorkerThread(sharedResource);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final counter value: " + sharedResource.getCounter());
    }
}
