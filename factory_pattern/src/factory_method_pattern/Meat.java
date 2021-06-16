package factory_method_pattern;

public class Meat extends Food{
    @Override
    public void canEat() {
        System.out.println("肉可以吃！");
    }
}
