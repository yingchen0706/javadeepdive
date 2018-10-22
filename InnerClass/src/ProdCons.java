import java.util.ArrayList;

public class ProdCons<T> {
    private ArrayList<T> list;
    private volatile int cnt;
    private final int MAX_SIZE = 100;

    ProdCons() {
        list = new ArrayList<>();
        cnt = 0;
    }

    T get() {
        return null;
    }

    int put(T value) {
        return 1;
    }

    public static void main(String[] args) {

    }
}
