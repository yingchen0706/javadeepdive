
public class Test {

    public static void main(String args[]) {
        MememberInner mi = new MememberInner("Jenny");
        mi.funcO();

        MememberInner.Inner in = mi.new Inner("Tom");
        in.funcI();
    }
}
