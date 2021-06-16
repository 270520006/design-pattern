package simple_factory;

public class FoodFactory {
    public static Egg createEgg(){
        return new Egg();
    }
    public static Meat createMeat(){
        return new Meat();
    }

    public static Food creatFood(String type){
        if ( ("egg").equals(type)){
            return createEgg();
        }else if (("meat").equals(type)){
            return createMeat();
        }else {
            return null;
        }
    }
}
