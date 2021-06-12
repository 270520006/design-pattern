package template_pattern;

// 通用模板
public abstract class WriteArticle {

    // 前言
    protected abstract void introduction();

    // 结尾
    protected abstract void theLast();


    // 文章主体
    protected abstract void actualContent();

    //  把文章写出来
    public final void writeAnCompleteArticle() {

        // 前言
        introduction();

        // 文章主体
        actualContent();

        // 最后
        theLast();
    }
}