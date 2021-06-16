package abstract_factory_pattern;

public class Meat extends Food {
    @Override
    public void canEat() {
        System.out.println("肉可以吃！");
    }

    @Override
    public void pack() {
    }
}
