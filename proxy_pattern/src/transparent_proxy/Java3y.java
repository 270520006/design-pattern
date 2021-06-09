package transparent_proxy;

public class Java3y implements Programmer{
    private ZSP zsp;
//透明代理就是：3Y看我写的非常好（自吹的），
// 但是就没人看，于是以后每天都帮我点赞，不帮别人点赞了
    public Java3y() {
        this.zsp = new ZSP();
    }
    public void like(){
        System.out.println("Java3y以后只为我点赞，不帮别人点赞了~");
    }
    @Override
    public void coding() {
        zsp.coding();
        like();
    }
}
