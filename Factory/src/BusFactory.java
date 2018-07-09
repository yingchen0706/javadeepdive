
public class BusFactory implements Factory {

    @Override
    public Auto getAuto() {
        return new Bus();
    }
}
