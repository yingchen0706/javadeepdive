import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
            i++;
            if (i == 3) {
                map.remove(i);
            }
        }
    }
}
