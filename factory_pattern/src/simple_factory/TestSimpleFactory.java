package simple_factory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        Food meat = FoodFactory.creatFood("meat");
        meat.canEat();
        Food egg = FoodFactory.creatFood("egg");
        egg.canEat();
    }
}
