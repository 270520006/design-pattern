package factory_method_pattern;

public class EggFactory implements MallFactory{
    @Override
    public Food stockFood() {
        return new Egg();
    }
}
