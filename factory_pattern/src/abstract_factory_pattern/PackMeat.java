package abstract_factory_pattern;

public class PackMeat extends Meat {
    @Override
    public void pack() {
        System.out.println("这是一个包装的肉！");
    }
}
