public class TestDecoratorPhone {
    public static void main(String[] args) {
        Phone  iphoneX = new IphoneX();
        iphoneX=new MusicPhone(iphoneX);
        iphoneX=new GetCurrentTimePhone(iphoneX);
        iphoneX.call();
    }
}
