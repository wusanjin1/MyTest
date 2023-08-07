#课程表  学生表  成绩表

#创建库
create database testScore;
use testScore;

#学生信息表
create table Student
(
    sid   int primary key auto_increment,
    sname     varchar(50)
);

#创建课程表
create table Class
(
    cid int primary key auto_increment,
    cname varchar(50)
);

#创建成绩表
create table Score
(
    scid int primary key auto_increment,
    sid int,
    cid int,
    score int
);