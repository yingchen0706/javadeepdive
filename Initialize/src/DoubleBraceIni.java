
public class DoubleBraceIni {
    protected String str;

    public DoubleBraceIni(String str) {
        this.str = str;
        System.out.println("abc");
    }

    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "abc";
        DoubleBraceIni instance = new DoubleBraceIni(s) {
            {
                str = s;
                System.out.println("def");
            }

            @Override
            public void print() {
                System.out.println("OVerride print");
            }
        };
        // System.gc();
        instance.print();
    }

}
