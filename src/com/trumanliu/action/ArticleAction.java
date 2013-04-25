package com.trumanliu.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trumanliu.domain.Article;
import com.trumanliu.service.ArticleService;

public class ArticleAction extends ActionSupport implements
		ModelDriven<Article> {
	private static final long serialVersionUID = 2958852423230907064L;
	private Article article = new Article();
	private ArticleService articleService;

	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	public Article getModel() {
		return article;
	}
	
	public String add(){
		System.out.println(article.getTitle());
		article.setPubDate(new Date());
		article.setAttachmentUrl("-");
		articleService.addArticle(article);
		return SUCCESS;
	}

}
