mysql -uroot -pmysql // 로그인

use javatest;

drop table if exists room; // room 지우기

create table if not exists room (
pno int(10) auto_increment primary key,
roomnum int(10) not null,
emp varchar(100) not null,
checkintime datetime default now(),
checkouttime datetime default now(),
name varchar(100) not null,
age int(10) not null,
gen varchar(50) not null
);

desc room;

insert into room (name, age, gen) 
values ('joo', 23, 'm');

select * from room; // 전체 테이블 리스트조회

select roomnum, name, age, gen from room; // 객실 리스트 조회

select * from room where roomnum = 2; // 개별(roomnum만) 디테일 조회

update room set pname = 'Test room 11', price = 12347, 
regdate = now(), madeby = 'kim'
where pno = 1;  // 수정

select * from room where name = 1;

delete from room where pno = 5; //삭제

select * from room;



regdate = now()