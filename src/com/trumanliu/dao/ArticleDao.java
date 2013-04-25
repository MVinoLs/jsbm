package com.trumanliu.dao;

import java.util.List;

import com.trumanliu.domain.Article;

public interface ArticleDao {
	void addArticle(Article article);
	void delArticle(Article article);
	void updArticle(Article article);
	Article getArticle(Article article);
	List<Article> getAllaArticles();
	List<String> getTitles();

}
