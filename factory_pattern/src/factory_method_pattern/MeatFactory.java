package factory_method_pattern;

public class MeatFactory implements MallFactory {
    @Override
    public Food stockFood() {
        return new Meat();
    }
}
