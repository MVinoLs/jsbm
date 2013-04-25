package com.trumanliu.service.impl;

import java.util.List;

import com.trumanliu.dao.ArticleDao;
import com.trumanliu.domain.Article;
import com.trumanliu.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDao articleDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public void addArticle(Article article) {
		articleDao.addArticle(article);

	}

	public void delArticle(Article article) {
		// TODO Auto-generated method stub

	}

	public void updArticle(Article article) {
		// TODO Auto-generated method stub

	}

	public Article getArticle(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Article> getAllaArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getTitles() {
		return articleDao.getTitles();
	}

}
