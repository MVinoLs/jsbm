package com.trumanliu.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String title;
     private String content;
     private Date pubDate;
     private String attachmentUrl;
     private Set comments = new HashSet(0);


    // Constructors

    /** default constructor */
    public Article() {
    }

	/** minimal constructor */
    public Article(Integer id, String title, String content, Date pubDate, String attachmentUrl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pubDate = pubDate;
        this.attachmentUrl = attachmentUrl;
    }
    
    /** full constructor */
    public Article(Integer id, String title, String content, Date pubDate, String attachmentUrl, Set comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pubDate = pubDate;
        this.attachmentUrl = attachmentUrl;
        this.comments = comments;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return this.pubDate;
    }
    
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }
    
    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }
   








}