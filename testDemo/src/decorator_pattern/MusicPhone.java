package decorator_pattern;

public class MusicPhone extends PhoneDecorator{
    public MusicPhone(Phone phone) {
        super(phone);
    }
    public void music(){
        System.out.println("天山天山有天神内天神天神叫帝江，选自《帝江混沌》");
    }
    public void call(){
        music();
        super.call();
    }

}
