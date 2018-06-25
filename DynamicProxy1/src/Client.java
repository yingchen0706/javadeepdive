import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Auto myAuto = new Car();

        InvocationHandler handler = new DynamicInvocationHandler(myAuto);

        Car car = (Car) Proxy.newProxyInstance(myAuto.getClass().getClassLoader(), myAuto.getClass().getInterfaces(),
                handler);

        car.run();
    }

}
