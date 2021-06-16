package abstract_factory_pattern;

public class UnPackEgg extends Egg{
    @Override
    public void pack() {
        System.out.println("这是一个没有包装的鸡蛋！");
    }
}
