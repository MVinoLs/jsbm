package com.trumanliu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.trumanliu.dao.ArticleDao;
import com.trumanliu.domain.Article;
@Transactional
public class ArticleDaoImpl implements ArticleDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addArticle(Article article) {
		sessionFactory.getCurrentSession().save(article);

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
		String hql = "select title from Article";
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

}
