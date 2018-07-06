
public class Sequence {

    private static Person p = new Person("Static member");

    static {
        new Person("static block");
    }

    {
        new Person("initialize block");
    }

    public Sequence() {
        new Person("constructor");
    }
}
