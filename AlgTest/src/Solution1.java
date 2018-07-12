import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution1 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.get(prerequisites[i][0]);
            if (list == null) {
                list = new ArrayList<Integer>();
                map.put(prerequisites[i][0], list);
            }
            list.add(prerequisites[i][1]);
        }

        Set<Integer> set = new HashSet<>();
        Iterator<Map.Entry<Integer, List<Integer>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, List<Integer>> entry = it.next();
            Set<Integer> set1 = new HashSet<>();
            if (!set.contains(entry.getKey())) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(entry.getKey());
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    set.add(node);
                    set1.add(node);
                    List<Integer> list = map.get(node);
                    if (list == null) {
                        break;
                    }
                    for (int target : list) {
                        if (set1.contains(target)) {
                            return false;
                        }
                        queue.offer(target);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution1 s1 = new Solution1();
        int[][] prerequisites = new int[][] { { 1, 0 }, { 2, 6 }, { 1, 7 }, { 6, 4 }, { 7, 0 }, { 0, 5 } };
        System.out.println(s1.canFinish(8, prerequisites));
    }

}
