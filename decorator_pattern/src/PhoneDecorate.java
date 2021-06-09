public class PhoneDecorate implements Phone{

    private Phone phone;
//    这边是对方法进行了重写
    public  PhoneDecorate(Phone phone) {
        this.phone=phone;
    }
//    调用phone的call方法
    @Override
    public void call() {
        phone.call();
    }
}
