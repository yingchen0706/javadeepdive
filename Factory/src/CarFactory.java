
public class CarFactory implements Factory {

    @Override
    public Auto getAuto() {
        return new Car();
    }

}
