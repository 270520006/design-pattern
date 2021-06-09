public class MusicPhone extends PhoneDecorate{
    public void music(){
        System.out.println("啊嘶嘚啊嘶嘚~选自《忐忑》");
    }
    public MusicPhone(Phone phone){
        super(phone);
    }
    @Override
    public void call(){
        music();
        super.call();
    }
}
