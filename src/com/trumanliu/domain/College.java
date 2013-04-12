package com.trumanliu.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * College entity. @author MyEclipse Persistence Tools
 */

public class College  implements java.io.Serializable {


    // Fields    

     private Short clgId;
     private String clgname;
     private Set majors = new HashSet(0);


    // Constructors

    /** default constructor */
    public College() {
    }

	/** minimal constructor */
    public College(Short clgId, String clgname) {
        this.clgId = clgId;
        this.clgname = clgname;
    }
    
    /** full constructor */
    public College(Short clgId, String clgname, Set majors) {
        this.clgId = clgId;
        this.clgname = clgname;
        this.majors = majors;
    }

   
    // Property accessors

    public Short getClgId() {
        return this.clgId;
    }
    
    public void setClgId(Short clgId) {
        this.clgId = clgId;
    }

    public String getClgname() {
        return this.clgname;
    }
    
    public void setClgname(String clgname) {
        this.clgname = clgname;
    }

    public Set getMajors() {
        return this.majors;
    }
    
    public void setMajors(Set majors) {
        this.majors = majors;
    }
   








}