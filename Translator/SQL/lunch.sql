drop table logins if exists;
CREATE table if NOT EXISTS logins(EMAIL VARCHAR(45) NOT NULL UNIQUE,PASS VARCHAR(45) NOT NULL,PRIMARY KEY(EMAIL)) ;
insert into logins values('rame','1');

drop table lang if exists;
CREATE table if NOT EXISTS lang(ID int NOT NULL UNIQUE,LANG VARCHAR(45) UNIQUE NOT NULL,PRIMARY KEY(ID)) ;
insert into lang values(1,'Ukrainian');
insert into lang values(2,'Russian');
insert into lang values(3,'English');

drop table type if exists;
CREATE table if NOT EXISTS type(ID SMALLINT NOT NULL UNIQUE,TYPE VARCHAR(45) UNIQUE NOT NULL,PRIMARY KEY(ID)) ;
insert into type values(1,'General');
insert into type values(2,'Sepecific');
insert into type values(3,'Technology');
insert into type values(4,'Medicine');
insert into type values(5,'Literature');
insert into type values(6,'Law');
insert into type values(7,'Economix/Finance');
insert into type values(8,'IT');

drop table quality if exists;
CREATE table if NOT EXISTS quality(ID TINYINT NOT NULL UNIQUE,QUALITY VARCHAR(45) UNIQUE NOT NULL,PRIMARY KEY(ID)) ;
insert into quality values(1,'Standart');
insert into quality values(2,'Business');
insert into quality values(3,'Extra');

drop table target if exists;
CREATE table if NOT EXISTS target(ORDER_ID BIGINT NOT NULL UNIQUE,TARGET int UNIQUE NOT NULL,PRIMARY KEY(ORDER_ID)) ;

drop table orders if exists;
CREATE table if NOT EXISTS orders(ID INT UNIQUE NOT NULL,USER VARCHAR(45) UNIQUE,SOURCE int NOT NULL,
TYPE int,QUALITY int,FILE BLOB,ADD BLOB,SYMBOLS int,FORMED_DATE TIMESTAMP,FINISH_DATE TIMESTAMP,PRIMARY KEY(ID)) ;
