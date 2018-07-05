import java.util.concurrent.BlockingQueue;

public class NumbersConsumer implements Runnable {
    private BlockingQueue<Integer> numbersQueue;
    private final int poisonPill;

    public NumbersConsumer(BlockingQueue<Integer> numbersQueue, int poisonPill) {
        this.numbersQueue = numbersQueue;
        this.poisonPill = poisonPill;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int next = numbersQueue.take();
                if (next == poisonPill) {
                    System.out.println("Consumed:Pill ");
                    break;
                }
                System.out.println("Consumed: " + next);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
