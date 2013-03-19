/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/3/19 23:19:14                           */
/*==============================================================*/


drop table if exists article;

drop table if exists college;

drop table if exists commnet;

drop table if exists major;

drop table if exists student;

/*==============================================================*/
/* Table: article                                               */
/*==============================================================*/
create table article
(
   id                   int(11) not null,
   title                varchar(30) not null,
   content              text not null,
   pubDate              date not null,
   attachmentUrl        varchar(120) not null,
   primary key (id)
);

/*==============================================================*/
/* Table: college                                               */
/*==============================================================*/
create table college
(
   clgId                tinyint not null auto_increment,
   clgname              varchar(15) not null,
   primary key (clgId)
);

/*==============================================================*/
/* Table: commnet                                               */
/*==============================================================*/
create table commnet
(
   id                   int(11) not null,
   articleId            int(11) not null,
   content              text not null,
   author               varchar(30) not null,
   authorEmail          varchar(30) not null,
   isShow               tinyint not null default 0,
   primary key (id)
);

/*==============================================================*/
/* Table: major                                                 */
/*==============================================================*/
create table major
(
   majorId              tinyint unsigned not null auto_increment,
   clgId                tinyint,
   mname                varchar(15) not null,
   primary key (majorId)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   stuid                int not null,
   password             varchar(20) not null,
   gender               tinyint not null,
   realname             varchar(15) not null,
   email                varchar(50) not null,
   tele                 varchar(20) not null,
   isPro                tinyint not null,
   majorId              tinyint not null,
   primary key (stuid)
);

alter table commnet add constraint FK_article_id foreign key (articleId)
      references article (id) on delete restrict on update restrict;

alter table major add constraint FK_clgno_Fk foreign key (clgId)
      references college (clgId) on delete restrict on update restrict;

alter table student add constraint FK_majorNum_FK foreign key (majorId)
      references major (majorId) on delete restrict on update restrict;

