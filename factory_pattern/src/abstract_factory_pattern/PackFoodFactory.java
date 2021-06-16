package abstract_factory_pattern;

public class PackFoodFactory implements FoodFactory{
    @Override
    public Food createEgg() {
        return new PackEgg();
    }
    @Override
    public Food createMeat() {
        return new PackMeat();
    }
}
