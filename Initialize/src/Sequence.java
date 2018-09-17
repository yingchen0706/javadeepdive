import java.util.LinkedList;
import java.util.List;

public class Sequence {

    static {
        new Person("static block");
        List<Integer> list = new LinkedList<>();
    }

    private static Person p = new Person("Static member");

    {
        new Person("initialize block");
    }

    public Sequence() {
        new Person("constructor");
    }
}
