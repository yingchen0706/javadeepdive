
public class MememberInner {
    private String name;

    public MememberInner(String name) {
        this.name = name;
    }

    public void funcO() {
        System.out.println("Hello " + name);
        Inner in = new Inner("Jane");
        in.funcI();
    }

    class Inner {
        private String nameI;

        public Inner(String name) {
            this.nameI = name;
        }

        public void funcI() {
            System.out.println("Inner Hello " + nameI);
        }

    }

}
