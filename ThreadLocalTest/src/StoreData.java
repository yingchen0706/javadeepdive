
public class StoreData implements Runnable {
    private static ThreadLocal<String> tl = new ThreadLocal<>();
    public String id;
    public String data;

    public StoreData(String id, String data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public void run() {
        tl.set(id);
        tl.set(data);
        System.out.println(tl.get());
        StringBuilder sb = new StringBuilder("123");
        StringBuffer sb2 = new StringBuffer("456");
        String s3 = "789";

        System.out.println(sb + s3);
    }
}
