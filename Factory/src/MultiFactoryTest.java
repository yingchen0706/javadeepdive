
public class MultiFactoryTest {

    public static void main(String[] args) {
        Auto auto = MultiFactory.getCar();
        auto.run();
    }

}
