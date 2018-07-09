
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Auto auto = SimpleFactory.getAuto(1);
        auto.run();
    }

}
