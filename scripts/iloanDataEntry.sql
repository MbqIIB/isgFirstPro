--- ====================== DROPPING TABLE ========================
/*
Drop table iloan.APPLICATION cascade constraints;
Drop table iloan.CREDITCARD cascade constraints;
Drop table iloan.ADDRESS cascade constraints;
Drop table iloan.APPLICATION cascade constraints;
Drop table iloan.DOA cascade constraints;
Drop table iloan.FUND cascade constraints;
Drop table iloan.INSTRUCTION cascade constraints;
Drop table iloan.JOB_DETAIL cascade constraints;
Drop table iloan.PERSONALDATA cascade constraints;
Drop table iloan.SAVEANDSWIPE cascade constraints;
Drop table iloan.SUPPLEMENTARY cascade constraints;
*/
---- ==================== END ====================================



CREATE TABLE iloan.ADDRESS 
(
   -- ID NUMBER(20,0) NOT NULL,
    ADDRESS_ID NUMBER(20,0) NOT NULL,    
    ADDRESSLINE1 VARCHAR2(100 BYTE) DEFAULT NULL,
    ZIPCODE VARCHAR(5 BYTE) DEFAULT NULL,
    HOMEADDRESS VARCHAR(5 BYTE) DEFAULT NULL,
    PERMADDRESS VARCHAR(5 BYTE) DEFAULT NULL,
    TELNUM VARCHAR(20 BYTE) DEFAULT NULL    
   
);


CREATE TABLE iloan.APPLICATION 
(
   -- ID NUMBER(20,0) NOT NULL,
    APP_ID NUMBER(20,0) NOT NULL,
	JOB_DETAIL_ID NUMBER(20,0) NOT NULL,
	PERSONALDATA_ID NUMBER(20,0) NOT NULL,
	SUPP_ID NUMBER(20,0) NOT NULL,	
	INSTRUCTION_ID NUMBER(20,0) NOT NULL,
	SS_ID NUMBER(20,0) NULL,
    ACCEPTCLASSICCARD VARCHAR(10 BYTE) DEFAULT NULL,
    ACCEPTSAVEANDSWIPE VARCHAR(10 BYTE) DEFAULT NULL,
    APPDATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    CARDTYPECODE VARCHAR(5 BYTE) NULL,
    CARDTYPEDESC VARCHAR(50 BYTE) NULL,
    APPSTATUS NUMBER(2,0) NULL,
    APPSTATUSDESC VARCHAR2(50 BYTE) NULL,
    ENROLLSOS VARCHAR(5 BYTE) NULL
);


CREATE TABLE iloan.CREDITCARD(
   -- ID NUMBER(20,0) NOT NULL,
    APP_ID NUMBER(20,0) NOT NULL,
    CREDITCARD_ID NUMBER(20,0) NOT NULL,
    CREDITCARDNUM VARCHAR(20 BYTE) DEFAULT NULL,
    CREDITLIMIT NUMBER(20,0) NULL,
    COMPANY VARCHAR(64 BYTE) DEFAULT NULL,
    MEMBERDATE TIMESTAMP DEFAULT NULL,
    EXISTINGCARD VARCHAR(5 BYTE) DEFAULT NULL,
    OTHERCARD VARCHAR(5 BYTE) DEFAULT NULL
    
);


CREATE TABLE iloan.DOA 
(
   -- ID NUMBER(20,0) NOT NULL,    
    DOA_ID NUMBER(20,0) NOT NULL,
    ISSUANCE VARCHAR(5 BYTE) NULL,
    INCDEC_LIMIT VARCHAR(5 BYTE) NULL,
    INCDEC_LIMIT_VAL VARCHAR2(64 BYTE) NULL,
    CHANGE_DEP_INST VARCHAR(5 BYTE) NULL,
    PLEDGE_ACCNT_CODE VARCHAR(5 BYTE) NULL,
    PLEDGE_ACCNT_DESC VARCHAR2(64 BYTE) NULL,
	PLEDGE_ACCNT_SPECIAL VARCHAR(2 BYTE) NULL,
    PLEDGE_ACCNT_NUM VARCHAR2(64 BYTE)  NULL,
    PLEDGE_ACCNT_BRANCH VARCHAR2(50 BYTE)  NULL,
    PLEDGE_AMT_WORDS VARCHAR2(100 BYTE)  NULL,
    PLEDGE_AMT NUMBER(20,0) NULL,
	DATE_APPLIED TIMESTAMP DEFAULT NULL,
	METROBANK_BRANCH VARCHAR2(50 BYTE)  NULL,
	ACCEPT_DOA VARCHAR(2 BYTE) NULL
);


CREATE TABLE iloan.FUND 
(
    --ID NUMBER(20,0) NOT NULL,
    FUND_ID NUMBER(20,0) NOT NULL,
    JOB_DETAIL_ID NUMBER(20,0) NOT NULL,
    FUND_CODE VARCHAR(5 BYTE) NOT NULL,
    FUND_DESC VARCHAR2(64 BYTE) NOT NULL
);


CREATE TABLE iloan.INSTRUCTION 
(
    --ID NUMBER(20,0) NOT NULL,    
    INSTRUCTION_ID NUMBER(20,0) NOT NULL,
    DELIVERY_PLACE VARCHAR2(100 BYTE) NULL,
    PAYMENTMODE VARCHAR(50 BYTE) NULL,
    ADA_ACCNT_NUM VARCHAR(20 BYTE) NULL,
    ADA_BANK_BRANCH VARCHAR(30 BYTE) NULL,
    MIN_AMOUNT VARCHAR(1 BYTE) NOT NULL DEFAULT '1',
    TOTAL_AMOUNT VARCHAR(1 BYTE) NOT NULL DEFAULT '0'
);


CREATE TABLE iloan.JOB_DETAIL 
(
   -- ID NUMBER(20,0) NOT NULL,   
    JOB_DETAIL_ID NUMBER(20,0) NOT NULL,
    COMPANY VARCHAR2(100 BYTE) NULL,
    OCCUPATION VARCHAR(50 BYTE) NULL,
    WORKNATURE VARCHAR(50 BYTE) NULL,
    ADDRESS_ID NUMBER(20,0) NULL,
    YEARS_EMPLOYED NUMBER(2,0) NULL,
    TOTAL_YRS_WORKING NUMBER(2,0) NULL,
    MONTHLYGROSS NUMBER(10,0) NULL,
    SPOUSE_FAM_NAME VARCHAR(30 BYTE) NULL,
	SPOUSE_GIV_NAME VARCHAR(30 BYTE) NULL,
    SPOUSE_MIDD_NAME VARCHAR(30 BYTE) NULL,
    SPOUSE_DOB TIMESTAMP DEFAULT NULL    
);


CREATE TABLE iloan.PERSONALDATA 
(
   -- ID NUMBER(20,0) NOT NULL,  
    PERSONALDATA_ID NUMBER(20,0) NOT NULL,
    FAMILYNAME VARCHAR(30 BYTE) NULL,
    GIVENNAME VARCHAR(30 BYTE) NULL,
    MIDDLENAME VARCHAR(30 BYTE) NULL,
    CARDNAME VARCHAR(30 BYTE) NULL,
    BIRTHDATE TIMESTAMP NULL,
    BIRTHPLACE VARCHAR(64 BYTE) NULL,
    CIVILSTATUS VARCHAR(20 BYTE) NULL,
    GENDER VARCHAR(10 BYTE) NULL,
    NATIONALITY VARCHAR(30 BYTE) NULL,
    OTHERNATIONAL VARCHAR(5 BYTE) NULL,
    MOBILENUM VARCHAR(30 BYTE) NULL,
    EMAIL VARCHAR(50 BYTE) NULL,
    MOTHERNAME VARCHAR2(100 BYTE) NULL,
    CHILDREN NUMBER(2,0) NULL,
    HOME_ADDR_ID NUMBER(20,0) NULL,
    PERM_ADDR_ID NUMBER(20,0) NULL,
    HOME_OWNERSHIP VARCHAR(30 BYTE) NULL,
    LEN_STAY NUMBER(2,0)  NULL,
    CARS NUMBER(2,0)  NULL,
    CARMODEL VARCHAR(64 BYTE) NULL,
    EDUCATION VARCHAR(64 BYTE) NULL,
    TIN VARCHAR(30 BYTE) NULL,
    SSSNUM VARCHAR(30 BYTE) NULL,
    SSSMEMBER VARCHAR(5 BYTE) NULL,
    GSISMEMBER VARCHAR(5 BYTE) NULL,
    OTHER_ID_CODE VARCHAR(5 BYTE) NULL,
    OTHER_ID_VALUE VARCHAR(64 BYTE) NULL,
    PERSON_REF_NAME VARCHAR(30 BYTE) NULL,
    PERSON_REF_REL VARCHAR(3 BYTE) NULL,
    PERSON_REF_ADDR_ID NUMBER(20,0) NULL   
);


CREATE TABLE iloan.SAVEANDSWIPE 
(
   -- ID NUMBER(20,0) NOT NULL,   
    SS_ID NUMBER(20,0) NOT NULL,
    DEPOSITOR VARCHAR(5 BYTE) NULL,
    ACCNT_NUM VARCHAR(30 BYTE) NULL,
    BRANCH VARCHAR(30 BYTE) NULL,
    ACCEPT_PLEDGE VARCHAR(5 BYTE) NULL,
    DOA_ID NUMBER(20,0) NOT NULL  
   
);


CREATE TABLE iloan.SUPPLEMENTARY 
(
   -- ID NUMBER(20,0) NOT NULL, 
    SUPP_ID NUMBER(20,0) NOT NULL,
    FAMILYNAME VARCHAR(30 BYTE) NOT NULL,
    GIVENNAME VARCHAR(30 BYTE) NOT NULL,
    MIDDLENAME VARCHAR(30 BYTE) NOT NULL,
    CARDNAME VARCHAR(30 BYTE) NOT NULL,
    ADDRESS_ID NUMBER(20,0) NULL,
    REL_TO_PRINC VARCHAR(30 BYTE) NULL,
    NATIONALITY VARCHAR(30 BYTE) NULL,
    OTHERNATIONAL VARCHAR(5 BYTE) NULL,
    BIRTHDATE TIMESTAMP DEFAULT NULL,
	BIRTHPLACE VARCHAR(30 BYTE) NULL,
    GENDER VARCHAR(10 BYTE) NULL
    
);

	
ALTER TABLE iloan.CREDITCARD add CONSTRAINT CREDITCARD_pk PRIMARY KEY (CREDITCARD_ID);		
ALTER TABLE iloan.APPLICATION ADD CONSTRAINT APPLICATION_pk PRIMARY KEY (APP_ID)  ;
ALTER TABLE iloan.PERSONALDATA ADD CONSTRAINT PERSONALDATA_pk PRIMARY KEY (PERSONALDATA_ID)  ;
ALTER TABLE iloan.ADDRESS ADD CONSTRAINT ADDRESS_pk PRIMARY KEY (ADDRESS_ID)  ;
ALTER TABLE iloan.JOB_DETAIL ADD CONSTRAINT JOB_DETAIL_pk PRIMARY KEY (JOB_DETAIL_ID)  ;
ALTER TABLE iloan.SUPPLEMENTARY ADD CONSTRAINT SUPPLEMENTARY_pk PRIMARY KEY (SUPP_ID)  ;
ALTER TABLE iloan.INSTRUCTION ADD CONSTRAINT INSTRUCTION_pk PRIMARY KEY (INSTRUCTION_ID)  ;
ALTER TABLE iloan.SAVEANDSWIPE ADD CONSTRAINT SAVEANDSWIPE_pk PRIMARY KEY (SS_ID)  ;
ALTER TABLE iloan.DOA ADD CONSTRAINT DOA_pk PRIMARY KEY (DOA_ID)  ;
ALTER TABLE iloan.FUND ADD CONSTRAINT FUND_pk PRIMARY KEY (FUND_ID)  ;
  


ALTER TABLE iloan.SAVEANDSWIPE ADD CONSTRAINT SAVEANDSWIPE_fk1 FOREIGN KEY (SS_ID) REFERENCES iloan.DOA;
ALTER TABLE iloan.CREDITCARD ADD CONSTRAINT CREDITCARD_fk1 FOREIGN KEY (APP_ID) REFERENCES iloan.APPLICATION;


--APPLICATION table constraints 
ALTER TABLE iloan.APPLICATION ADD CONSTRAINT APPLICATION_fk1 FOREIGN KEY (JOB_DETAIL_ID) REFERENCES iloan.JOB_DETAIL;
--ALTER TABLE iloan.APPLICATION ADD CONSTRAINT APPLICATION_fk3 FOREIGN KEY (SUPP_ID) REFERENCES iloan.SUPPLEMENTARY;
--ALTER TABLE iloan.APPLICATION ADD CONSTRAINT APPLICATION_fk2 FOREIGN KEY (PERSONALDATA_ID) REFERENCES iloan.PERSONALDATA;
ALTER TABLE iloan.JOB_DETAIL ADD CONSTRAINT JOB_DETAIL_fk1 FOREIGN KEY (ADDRESS_ID) REFERENCES iloan.ADDRESS;

ALTER TABLE iloan.PERSONALDATA ADD CONSTRAINT PERSONALDATA_fk1 FOREIGN KEY (HOME_ADDR_ID) REFERENCES iloan.ADDRESS;
ALTER TABLE iloan.PERSONALDATA ADD CONSTRAINT PERSONALDATA_fk2 FOREIGN KEY (PERM_ADDR_ID) REFERENCES iloan.ADDRESS;



-- ================ SEQUENCE ===============
CREATE SEQUENCE APPLICATION_SEQ INCREMENT BY 1 MINVALUE 1 NOCACHE;
CREATE SEQUENCE JOB_DETAIL_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE ADDRESS_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE CREDITCARD_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE PERSONALDATA_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE SUPPLEMENTARY_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE INSTRUCTION_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE SAVEANDSWIPE_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE FUND_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;
CREATE SEQUENCE DOA_SEQ INCREMENT BY 1 START WITH 20 MINVALUE 1 NOCACHE;





--commit;


