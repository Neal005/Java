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
                int product = queue.poll();
                System.out.println("- Consumed: " + product);
                System.out.println("\tSo luong hang trong kho: " + queue.size());
                queue.notifyAll();
            }
            
//            try {
//                Thread.sleep(2000); // Dừng 2 giây sau mỗi lần tiêu thụ
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}