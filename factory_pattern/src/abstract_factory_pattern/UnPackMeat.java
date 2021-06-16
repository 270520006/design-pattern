package abstract_factory_pattern;

public class UnPackMeat extends Meat {
    @Override
    public void pack() {
        System.out.println("这是一个没有包装的肉！");
    }
}
