package factory_method_pattern;

public class Egg extends Food {
    @Override
    public void canEat() {
        System.out.println("蛋可以吃！");
    }
}
