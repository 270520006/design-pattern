package abstract_factory_pattern;

public class Egg extends Food {
    @Override
    public void canEat() {
        System.out.println("蛋可以吃！");
    }

    @Override
    public void pack() {
    }
}
