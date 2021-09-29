import java.util.*;

// class used for performing put and get operations 
class Operation {
    Queue<Integer> values = new LinkedList<Integer>();
    int limit = 1;

    synchronized void put(int i) {
        if (values.size() >= limit) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Put :" + i);
        values.add(i);
        notify();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    synchronized void get() {
        if (values.size() <= 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Get :" + values.poll());
        notify();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return;
    }
}

// class for performing producer operations
class producer implements Runnable {
    Operation O;

    producer(Operation O) {
        this.O = O;
    }

    public void run() {

        for (int i = 0; i <= 10; i++) {
            O.put(i);
        }
    }
}

// class for performing consumer operations
class consumer implements Runnable {
    Operation O;

    consumer(Operation O) {
        this.O = O;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            O.get();
        }
    }
}

public class ProducerConsumer {
    public static void main(String args[]) {
        Operation oObj = new Operation();
        producer p = new producer(oObj);
        consumer c = new consumer(oObj);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}