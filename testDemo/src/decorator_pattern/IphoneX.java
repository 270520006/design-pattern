package decorator_pattern;

public class IphoneX implements Phone{
    @Override
    public void call() {
        System.out.println("打了个电话给漂亮的妹妹，嘟嘟嘟~未接通...");
    }
}
