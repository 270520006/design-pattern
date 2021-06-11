public interface Filter {
    void doFilter(String data);
}
class FilterEgg implements Filter{
    @Override
    public void doFilter(String data) {
        System.out.println("过滤了鸡蛋~");
    }
}
class FilterDrunk implements Filter{
    @Override
    public void doFilter(String data) {
        System.out.println("过滤了奶粉~");
    }
}
class FilterShit implements Filter{
    @Override
    public void doFilter(String data) {
        System.out.println("过滤了屎~");
    }
}


