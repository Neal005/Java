package producerandconsumer;

import java.util.Queue;

class Producer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    public void run() {
        int productNumber = 1;
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    System.out.println(" ___________________________");
                    System.out.println("|Kho day, tam ngung san xuat|");
                    System.out.println("|___________________________|");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.add(productNumber);
                System.out.println("+ Produced: " + productNumber);
                System.out.println("\tSo luong hang trong kho: " + queue.size());
                productNumber++;
                queue.notifyAll();
            }
            
//            try {
//                Thread.sleep(1000); // Dừng 1 giây sau mỗi lần sản xuất
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}