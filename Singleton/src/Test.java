import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            Constructor<?> cons = Class.forName("Singleton1").getDeclaredConstructor();
            cons.setAccessible(true);
            Singleton1 instance1 = (Singleton1) cons.newInstance();
            Singleton1 instance2 = (Singleton1) cons.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
