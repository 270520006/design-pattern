package abstract_factory_pattern;

public class UnPackFoodFactory implements FoodFactory{

    @Override
    public Food createEgg() {
        return new UnPackEgg();
    }

    @Override
    public Food createMeat() {
        return new UnPackMeat();
    }
}
