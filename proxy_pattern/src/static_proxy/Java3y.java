package static_proxy;
public class Java3y implements Programmer{
//    Java3y是我很崇拜的一个程序猿，
//    得到他的点赞会让我很开心
//    也能让更多人认识我
    private ZSP zsp;
    public Java3y(ZSP zsp){
        this.zsp=zsp;
    }
    public void like(){
        System.out.println("Java3y给我点了一个赞");
    }
    @Override
    public void coding() {
        zsp.coding();
        like();
    }
}
