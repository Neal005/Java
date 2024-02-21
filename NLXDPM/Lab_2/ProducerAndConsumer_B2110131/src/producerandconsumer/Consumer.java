package producerandconsumer;

import java.util.Queue;

class Consumer extends Thread {
    private Queue<Integer> queue;
    

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                int product = queue.poll();
                System.out.println("- Consumed: " + product);
                System.out.println("\tSo luong hang trong kho: " + queue.size());
                queue.notifyAll();

                while (queue.isEmpty()) {
                    System.out.println(" ____________________________");
                    System.out.println("|Kho rong, tam ngung tieu thu|");
                    System.out.println("|____________________________|");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            
            try {
                Thread.sleep(500); // Dừng 0.5 giây sau mỗi lần tiêu thụ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}