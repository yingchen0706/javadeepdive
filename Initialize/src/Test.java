import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Sequence sq = new Sequence();

        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("2");
        Set<String> set = new HashSet<>();
        set.addAll(list);

        list = new ArrayList();
        list.addAll(set);
        Collections.sort(list);

        HashMap<String, String> map = new HashMap();
        map.put("a", "aa");
        map.put("b", "bb");
        list.add(0, map);
        System.out.println(list.toString());
    }

}
