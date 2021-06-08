public class StuGoSchool {
    public static void main(String[] args) {
        ZSPGo zspGoByFoot=new ZSPGo(new ByFoot());
        zspGoByFoot.exec();
        System.out.println("===============");
        ZSPGo zspGoByPlane=new ZSPGo(new ByFoot());
        zspGoByPlane.exec();
        System.out.println("===============");
        ZSPGo zspGoByTaxi=new ZSPGo(new ByTaxi());
        zspGoByTaxi.exec();
    }
}
//设计模式的学习：包装模式、策略模式、责任链模式等