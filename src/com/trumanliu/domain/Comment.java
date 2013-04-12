package com.trumanliu.domain;



/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Article article;
     private String content;
     private String author;
     private String authorEmail;
     private Short isShow;


    // Constructors

    /** default constructor */
    public Comment() {
    }

    
    /** full constructor */
    public Comment(Integer id, Article article, String content, String author, String authorEmail, Short isShow) {
        this.id = id;
        this.article = article;
        this.content = content;
        this.author = author;
        this.authorEmail = authorEmail;
        this.isShow = isShow;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Article getArticle() {
        return this.article;
    }
    
    public void setArticle(Article article) {
        this.article = article;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return this.authorEmail;
    }
    
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public Short getIsShow() {
        return this.isShow;
    }
    
    public void setIsShow(Short isShow) {
        this.isShow = isShow;
    }
   








}