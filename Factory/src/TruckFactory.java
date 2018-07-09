
public class TruckFactory implements Factory {

    @Override
    public Auto getAuto() {
        return new Truck();
    }

}
