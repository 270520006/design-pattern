package factory_method_pattern;

public class TestFactory {
    public static void main(String[] args) {
//        想吃肉
        MallFactory meatFactory = new MeatFactory();
        Food meatFood = meatFactory.stockFood();
        meatFood.canEat();
//        想吃蛋
        EggFactory eggFactory = new EggFactory();
        Food eggFood = eggFactory.stockFood();
        eggFood.canEat();
    }
}
