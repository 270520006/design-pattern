package dynamic_proxy;

import java.lang.reflect.Proxy;

public class Dynamic_Proxy {
    public static void main(String[] args) {
        ZSP zsp = new ZSP();
        Programmer  programmerWaterArmy  = (Programmer) Proxy.newProxyInstance(zsp.getClass().getClassLoader(), zsp.getClass().getInterfaces(), ((proxy, method, args1) -> {
            if (method.getName().equals("coding")) {
                method.invoke(zsp, args);
                System.out.println("水军，来水评论了");
            } else {
                return method.invoke(zsp, args);
            }
            return null;
        }));
        programmerWaterArmy.coding();
    }
}
