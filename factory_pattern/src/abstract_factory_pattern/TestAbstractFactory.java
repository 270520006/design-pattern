package abstract_factory_pattern;

public class TestAbstractFactory {
    public static void main(String[] args) {
//        先取包装过的
        PackFoodFactory packFoodFactory = new PackFoodFactory();
        Food egg = packFoodFactory.createEgg();
        egg.canEat();
        egg.pack();
//        取没有包装的
        UnPackFoodFactory unPackFoodFactory = new UnPackFoodFactory();
        Food meat = unPackFoodFactory.createMeat();
        meat.pack();
        meat.canEat();
    }
}
