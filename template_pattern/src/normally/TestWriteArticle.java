package normally;

public class TestWriteArticle {
    public static void main(String[] args) {
//        ZSPWriteArticle zspWriteArticle = new ZSPWriteArticle();
//        zspWriteArticle.introduction();
//        System.out.println("这是文章的主体");
//        zspWriteArticle.theLast();
        FriendWriteArticle friendWriteArticle = new FriendWriteArticle();
        friendWriteArticle.introduction();
        System.out.println("文章主体！");
        friendWriteArticle.theLast();


    }
}
