package PKUYouth.ResponseVOs;

/**
 * Created by WangJian on 2017/1/30.
 */
public class SearchArticleVO extends BasicVO {
    int article_count;
    Article [] articles;

    public int getArticle_count() {
        return article_count;
    }

    public void setArticle_count(int article_count) {
        this.article_count = article_count;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }
}
