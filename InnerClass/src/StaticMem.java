
public class StaticMem {
    private String name;

    public StaticMem(String name) {
        this.name = name;
    }

    public void funcO() {
        System.out.println("Hello " + name);
        Inner in = new Inner("Jane");
        in.funcI();
    }

    static class Inner {
        private String nameI;

        public Inner(String name) {
            this.nameI = name;
        }

        public void funcI() {
            System.out.println("Inner Hello " + nameI);
        }

    }
}
