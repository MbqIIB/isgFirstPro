/***********************************************************
    Forward Engineering
 ***********************************************************


***********************************************************
    CREATE STATEMENTS
***********************************************************/


CREATE TABLE ADDRESS 
(
    ID INTEGER NULL,
    ADDRESS_ID INTEGER NOT NULL,
    PERSONALDATAID INTEGER NULL,
    ADDRESSLINE1 VARCHAR2 NULL,
    ZIPCODE VARCHAR2 NULL,
    HOMEADDRESS VARCHAR NULL,
    PERMADDRESS VARCHAR NULL,
    TELNUM VARCHAR2 NULL,
    SUPPID INTEGER NULL,
    SUPPID INTEGER NOT NULL,
    PERSONALDATAID INTEGER NOT NULL,
    JOB_DETAIL_ID INTEGER NOT NULL
);


CREATE TABLE APPLICATION 
(
    ID INTEGER NULL,
    APPID INTEGER NOT NULL,
    ACCEPTCLASSICCARD VARCHAR NULL,
    ACCEPTSAVEANDSWIPE VARCHAR NULL,
    APPDATE TIMESTAMP NULL,
    CARDTYPECODE VARCHAR NULL,
    CARDTYPEDESC VARCHAR2 NULL,
    APPSTATUS INTEGER NULL,
    APPSTATUSDESC VARCHAR2 NULL,
    ENROLLSOS VARCHAR NULL
);


CREATE TABLE CREDITCARD 
(
    ID INTEGER NULL,
    APPID INTEGER NOT NULL,
    CREDITCARDID INTEGER NOT NULL,
    CREDITCARDNUM VARCHAR2 NULL,
    CREDITLIMIT LONG NULL,
    COMPANY VARCHAR2 NULL,
    MEMBERDATE TIMESTAMP NULL,
    EXISTINGCARD VARCHAR NULL,
    OTHERCARD VARCHAR NULL,
    APPID INTEGER NOT NULL
);


CREATE TABLE DOA 
(
    ID INT NULL,
    SS_ID INT NOT NULL,
    DOA_ID INT NOT NULL,
    ISSUANCE VARCHAR NULL,
    INCDEC_LIMIT VARCHAR NULL,
    INCDEC_LIMIT_VAL VARCHAR2 NULL,
    CHANGE VARCHAR NULL,
    PLEDGE_ACCNT_CODE VARCHAR NULL,
    PLEDGE_ACCNT_DESC VARCHAR2 NULL,
    PLEDGE_ACCNT_NUM VARCHAR2 NULL,
    PLEDGE_ACCNT_BRANCH VARCHAR2 NULL,
    PLEDGE_AMT_WORDS VARCHAR2 NULL,
    PLEDGE_AMT LONG NULL
);


CREATE TABLE FUND 
(
    ID int NULL,
    FUNDID int NULL,
    JOBDET int NULL,
    FUNDCO String NULL,
    FUNDDE String NULL
);


CREATE TABLE INSTRUCTION 
(
    ID INTEGER NULL,
    APPID INTEGER NOT NULL,
    INSTRUCTION_ID INTEGER NOT NULL,
    DELIVERY_PLACE VARCHAR2 NULL,
    PAYMENTMODE VARCHAR2 NULL,
    ADA_ACCNT_NUM VARCHAR2 NULL,
    ADA_BANK_BRANCH VARCHAR2 NULL,
    MIN_AMOUNT VARCHAR NULL,
    MAX_AMOUNT VARCHAR NULL,
    APPID INTEGER NOT NULL
);


CREATE TABLE JOB_DETAILS 
(
    ID INTEGER NULL,
    JOB_DETAIL_ID INTEGER NOT NULL,
    APPID INTEGER NULL,
    COMPANY VARCHAR2 NULL,
    OCCUPATION VARCHAR2 NULL,
    WORKNATURE VARCHAR2 NULL,
    ADDRESS_ID INTEGER NULL,
    YEARS_EMPLOYED INTEGER NULL,
    TOTAL_YRS_WORKING INTEGER NULL,
    MONTHLYGROSS LONG NULL,
    SPOUSE_FAM_NAME VARCHAR2 NULL,
    SPOUSE_MIDD_NAME VARCHAR2 NULL,
    SPOUSE_DOB TIMESTAMP NULL,
    APPID INTEGER NOT NULL
);


CREATE TABLE PERSONALDATA 
(
    ID INTEGER NULL,
    PERSONALDATAID INTEGER NOT NULL,
    APPID INTEGER NULL,
    FAMILYNAME VARCHAR2 NULL,
    GIVENNAME VARCHAR2 NULL,
    MIDDLENAME VARCHAR2 NULL,
    CARDNAME VARCHAR2 NULL,
    BIRTHDATE DATE NULL,
    BIRTHPLACE VARCHAR2 NULL,
    CIVILSTATUS VARCHAR NULL,
    GENDER VARCHAR NULL,
    NATIONALITY VARCHAR2 NULL,
    OTHERNATIONAL VARCHAR NULL,
    MOBILENUM VARCHAR2 NULL,
    EMAIL VARCHAR2 NULL,
    MOTHERNAME VARCHAR2 NULL,
    CHILDREN INTEGER NULL,
    HOMEADDRESS INTEGER NULL,
    PERMADDRESS INTEGER NULL,
    HOMEOWNERSHIP VARCHAR2 NULL,
    LENGTHOFSTAY INTEGER NULL,
    CARS INTEGER NULL,
    CARMODEL VARCHAR2 NULL,
    EDUCATION VARCHAR2 NULL,
    TIN VARCHAR2 NULL,
    SSSNUM VARCHAR2 NULL,
    SSSMEMBER VARCHAR NULL,
    GSISMEMBER VARCHAR NULL,
    OTHER_ID_CODE VARCHAR NULL,
    OTHER_ID_VALUE VARCHAR2 NULL,
    PERSON_REF_NAME VARCHAR2 NULL,
    PERSON_REF_REL VARCHAR2 NULL,
    PERSON_REF_ADDR VARCHAR2 NULL,
    APPID INTEGER NOT NULL
);


CREATE TABLE SAVEANDSWIPE 
(
    ID INTEGER NULL,
    APPID INTEGER NULL,
    SS_ID INTEGER NULL,
    DEPOSITOR VARCHAR NULL,
    ACCNT_NUM VARCHAR2 NULL,
    BRANCH VARCHAR2 NULL,
    ACCEPT_PLEDGE VARCHAR NULL,
    DOA_ID INTEGER NULL,
    SS_ID INT NOT NULL,
    APPID INTEGER NOT NULL
);


CREATE TABLE SUPPLEMENTARY 
(
    ID INTEGER NULL,
    APPID INTEGER NULL,
    SUPPID INTEGER NOT NULL,
    FAMILYNAME VARCHAR2 NULL,
    GIVENNAME VARCHAR2 NULL,
    MIDDLENAME VARCHAR2 NULL,
    CARDNAME VARCHAR2 NULL,
    ADDRESS_ID INTEGER NULL,
    RELTOPRINC VARCHAR2 NULL,
    NATIONALITY VARCHAR2 NULL,
    OTHERNATIONAL VARCHAR NULL,
    BIRTHDATE DATE NULL,
    GENDER VARCHAR NULL,
    APPID INTEGER NOT NULL
);


ALTER TABLE CREDITCARD 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    CREDITCARDID)  ;
ALTER TABLE APPLICATION 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    APPID)  ;
ALTER TABLE PERSONALDATA 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    PERSONALDATAID)  ;
ALTER TABLE ADDRESS 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    ADDRESS_ID)  ;
ALTER TABLE JOB_DETAILS 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    JOB_DETAIL_ID)  ;
ALTER TABLE SUPPLEMENTARY 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    SUPPID)  ;
ALTER TABLE INSTRUCTION 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    INSTRUCTION_ID)  ;
ALTER TABLE SAVEANDSWIPE 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    SS_ID)  ;
ALTER TABLE DOA 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    SS_ID)  ;
ALTER TABLE FUND 
  ADD CONSTRAINT Primary Key PRIMARY KEY (
    FUNDID)  ;
ALTER TABLE CREDITCARD
  ADD 
    FOREIGN KEY (APPID)
      REFERENCES APPLICATION;

ALTER TABLE PERSONALDATA
  ADD 
    FOREIGN KEY (APPID)
      REFERENCES APPLICATION;

ALTER TABLE ADDRESS
  ADD 
    FOREIGN KEY (SUPPID)
      REFERENCES SUPPLEMENTARY;

ALTER TABLE ADDRESS
  ADD 
    FOREIGN KEY (PERSONALDATAID)
      REFERENCES PERSONALDATA;

ALTER TABLE ADDRESS
  ADD 
    FOREIGN KEY (JOB_DETAIL_ID)
      REFERENCES JOB_DETAILS;

ALTER TABLE JOB_DETAILS
  ADD 
    FOREIGN KEY (APPID)
      REFERENCES APPLICATION;

ALTER TABLE SUPPLEMENTARY
  ADD 
    FOREIGN KEY (APPID)
      REFERENCES APPLICATION;

ALTER TABLE INSTRUCTION
  ADD 
    FOREIGN KEY (APPID)
      REFERENCES APPLICATION;

ALTER TABLE SAVEANDSWIPE
  ADD 
    FOREIGN KEY (SS_ID)
      REFERENCES DOA;

ALTER TABLE SAVEANDSWIPE
  ADD 
    FOREIGN KEY (APPID)
      REFERENCES APPLICATION;



    END
