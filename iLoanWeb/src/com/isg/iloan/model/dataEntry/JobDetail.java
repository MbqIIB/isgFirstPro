package com.isg.iloan.model.dataEntry;

import java.util.Date;
import java.util.List;

/**
 ** Class JobDetail
 **/
public class JobDetail { 
  //Fields
  private int id;
  private int jobDetailId;
  private int applicationId;
  private List<Fund> sourceOfFunds;
  private String companyName;
  private String occupation;
  private String natureOfWork;
  private Address businessAddress;
  private int yearsWithCurrentEmployer;
  private int totalWorkingYears;
  private long grossMonthlyIncome;
  private String spouseFamilyName;
  private String spouseMiddleName;
  private Date spouseDOB;

  //Constructors
  JobDetail(){}

  //Methods

  //Inner classes

} //end class JobDetail 
