package com.trumanliu.domain;



/**
 * Major entity. @author MyEclipse Persistence Tools
 */

public class Major  implements java.io.Serializable {


    // Fields    

     private Short majorId;
     private College college;
     private String mname;


    // Constructors

    /** default constructor */
    public Major() {
    }

	/** minimal constructor */
    public Major(Short majorId, String mname) {
        this.majorId = majorId;
        this.mname = mname;
    }
    
    /** full constructor */
    public Major(Short majorId, College college, String mname) {
        this.majorId = majorId;
        this.college = college;
        this.mname = mname;
    }

   
    // Property accessors

    public Short getMajorId() {
        return this.majorId;
    }
    
    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }

    public College getCollege() {
        return this.college;
    }
    
    public void setCollege(College college) {
        this.college = college;
    }

    public String getMname() {
        return this.mname;
    }
    
    public void setMname(String mname) {
        this.mname = mname;
    }
   








}