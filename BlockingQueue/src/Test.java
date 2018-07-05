import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {

    public static void main(String[] args) {
        int BOUND = 10;
        int N_CONSUMER = Runtime.getRuntime().availableProcessors();
        int N_PRODUCER = 4;

        int poisonPill = Integer.MAX_VALUE;
        int poisonPillPerProducer = N_CONSUMER / N_PRODUCER;

        BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(BOUND);

        for (int i = 0; i < N_PRODUCER; i++) {
            new Thread(new NumbersProducer(bq, poisonPill, poisonPillPerProducer)).start();
        }
        for (int i = 0; i < N_CONSUMER; i++) {
            new Thread(new NumbersConsumer(bq, poisonPill)).start();
        }
        System.out.println(N_CONSUMER);
    }

}
