
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory fac = new TruckFactory();
        fac.getAuto().run();
        System.out.println(fac.getClass().getName());
    }

}
