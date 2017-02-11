package myapps.wycoco.com.midtermproject.Models;

import java.util.ArrayList;

/**
 * Created by dell on 2/11/2017.
 */

public class NewsModel {

    private String status;
    private String source;
    private String sortBy;
    private ArrayList<ArticlesModel> articles;

    public NewsModel(){}

    public NewsModel(String status, String source, String sortBy, ArrayList<ArticlesModel> articles) {
        this.status = status;
        this.source = source;
        this.sortBy = sortBy;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ArrayList<ArticlesModel> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ArticlesModel> articles) {
        this.articles = articles;
    }
}
