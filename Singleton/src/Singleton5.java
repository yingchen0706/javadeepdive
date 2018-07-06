import java.util.concurrent.ConcurrentHashMap;

public class Singleton5 {
    private static ConcurrentHashMap<String, Singleton5> map;

    static {
        Singleton5 instance = new Singleton5();
        map.put(Singleton5.class.getName(), instance);
    }

    protected Singleton5() {

    }

    public Singleton5 getInstance(String name) {
        Singleton5 instance = map.get(name);
        if (instance == null) {
            try {
                instance = (Singleton5) Class.forName(name).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            map.put(name, instance);
        }
        return instance;
    }
}
