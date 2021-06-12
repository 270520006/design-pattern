package template_pattern;

public class ZSPWrite extends WriteArticle{
    @Override
    protected void introduction() {
        System.out.println("我特别崇拜3y，3y说要教我追女朋友");
    }

    @Override
    protected void theLast() {
        System.out.println("今天边学习3y的设计模式，边吃狗粮");
    }

    @Override
    protected void actualContent() {
        System.out.println("这是文章的主体");
    }
}
