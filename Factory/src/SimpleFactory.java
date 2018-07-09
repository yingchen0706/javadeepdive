
public class SimpleFactory {
    private final static int CAR = 1;
    private final static int TRUCK = 2;
    private final static int BUS = 3;

    public static Auto getAuto(int type) {
        switch (type) {
        case CAR:
            return new Car();
        case TRUCK:
            return new Truck();
        case BUS:
            return new Bus();
        default:
            return null;
        }
    }

}
