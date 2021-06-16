package abstract_factory_pattern;

public class PackEgg extends Egg{
    @Override
    public void pack() {
        System.out.println("这是一个包装的鸡蛋！");
    }
}
