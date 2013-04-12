package com.trumanliu.domain;



/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student  implements java.io.Serializable {


    // Fields    

     private String stuid;
     private String password;
     private Short gender;
     private String realname;
     private String email;
     private String tele;
     private Short isPro;
     private Short majorId;


    // Constructors

    /** default constructor */
    public Student() {
    }

    
    /** full constructor */
    public Student(String stuid, String password, Short gender, String realname, String email, String tele, Short isPro, Short majorId) {
        this.stuid = stuid;
        this.password = password;
        this.gender = gender;
        this.realname = realname;
        this.email = email;
        this.tele = tele;
        this.isPro = isPro;
        this.majorId = majorId;
    }

   
    // Property accessors

    public String getStuid() {
        return this.stuid;
    }
    
    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Short getGender() {
        return this.gender;
    }
    
    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getRealname() {
        return this.realname;
    }
    
    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return this.tele;
    }
    
    public void setTele(String tele) {
        this.tele = tele;
    }

    public Short getIsPro() {
        return this.isPro;
    }
    
    public void setIsPro(Short isPro) {
        this.isPro = isPro;
    }

    public Short getMajorId() {
        return this.majorId;
    }
    
    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }
   








}