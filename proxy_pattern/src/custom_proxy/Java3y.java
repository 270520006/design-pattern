package custom_proxy;

public class Java3y implements Programmer {
    private ZSP zsp;
//自定义代理就是3Y一直给我点赞，导致看我的人越来越多（并没有）
//    然后3Y就想要向我收费了（也没有）
    public Java3y() {
        this.zsp = new ZSP();
    }
    public void like(){
        System.out.println("Java3y以后只为我点赞，不帮别人点赞了~");
    }
    public void getMoney(){
        System.out.println("现在点赞要贰佰~");
    }
    @Override
    public void coding() {
        zsp.coding();
        like();
        getMoney();
    }
}
