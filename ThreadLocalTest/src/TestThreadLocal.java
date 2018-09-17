
public class TestThreadLocal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * StoreData sd1 = new StoreData("Ying", "123"); StoreData sd2 = new
         * StoreData("Chen", "456");
         * 
         * Thread t1 = new Thread(sd1); Thread t2 = new Thread(sd2); t1.start();
         * t2.start();
         */
        int a = 0;
        int b = a + 1;
        Thread td = new Thread(() -> System.out.println("Here" + b));
        td.start();

        System.out.println("Done");

    }

}
