package static_proxy;
public class TestStaticProxy {
    public static void main(String[] args) {
        ZSP zsp = new ZSP();
        Programmer java3y = new Java3y(zsp);
        java3y.coding();
    }
}
