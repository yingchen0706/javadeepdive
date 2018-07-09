
public class MultiFactory {
    public static Auto getCar() {
        return new Car();
    }

    public static Auto getTruck() {
        return new Truck();
    }
}
