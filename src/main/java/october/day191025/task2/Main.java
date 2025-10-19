package october.day191025.task2;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        Produser produser = new Produser(queue);
        Consumer consumer = new Consumer(queue);


        new Thread(produser).start();
        new Thread(consumer).start();

    }
}


class Produser implements Runnable {
    private final BlockingQueue<Integer> queue;

    Produser(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Продюсер создал " + i + " Свободно ячеек "+ queue.remainingCapacity());
                queue.put(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}


class Consumer implements Runnable {
    public final BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Integer number = queue.take();
                System.out.println("Консюмер обработал " + i+ " Свободно ячеек "+ queue.remainingCapacity());
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}