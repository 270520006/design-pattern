import java.util.Arrays;
import java.util.List;

public interface Filter {
    void doFilter(String data);
}
class FilterEgg implements Filter{
    @Override
    public void doFilter(String data) {
        List<String> strings = Arrays.asList(data.split(","));
        boolean egg = strings.contains("egg");
        if (egg){ System.out.println("过滤了鸡蛋~");}
    }
}
class FilterDrunk implements Filter{
    @Override
    public void doFilter(String data) {
        List<String> strings = Arrays.asList(data.split(","));
        boolean drunk = strings.contains("drunk");
        if (drunk) {System.out.println("过滤了奶粉~");}
    }
}
class FilterShit implements Filter{
    @Override
    public void doFilter(String data) {
        List<String> strings = Arrays.asList(data.split(","));
        boolean shit = strings.contains("shit");
        if (shit){ System.out.println("过滤了屎~"); }
    }
}


