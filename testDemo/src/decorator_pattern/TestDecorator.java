package decorator_pattern;

public class TestDecorator {
        public static void main(String[] args) {
        Phone iphoneX = new IphoneX();
        iphoneX =new MusicPhone(iphoneX);
        iphoneX = new getCurrentTime(iphoneX);
        iphoneX.call();
    }
}
