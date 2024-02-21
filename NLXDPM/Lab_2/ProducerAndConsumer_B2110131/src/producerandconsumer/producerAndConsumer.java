package producerandconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class producerAndConsumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Producer producer = new Producer(queue, n);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();
        
        while (true) {
            if (scanner.next().equalsIgnoreCase("e")) {
                System.exit(0);
            }
        }
    }
}