import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i >= 2) {
                it.remove();
                // list.remove(i);
            }
            System.out.println(it.next());
            i++;
        }
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}