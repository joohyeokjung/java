mysql -uroot -pmysql // 로그인

use javatest;

drop table if exists product; // product 지우기

create table if not exists product (
pno int(10) auto_increment,
pname varchar(100) not null,
price int(10) not null,
regdate datetime default now(),
madeby varchar(50) not null,
primary key(pno)
);

desc product;

insert into product (pname, price, madeby)
values ('TestProduct 1', 123, 'par');
insert into product (pname, price, madeby)
values ('TestProduct 2', 1234, 'pak');
insert into product (pname, price, madeby)
values ('TestProduct 3', 12345, 'prk');
insert into product (pname, price, madeby)
values ('TestProduct 4', 1234, 'ark');
insert into product (pname, price, madeby)
values ('TestProduct 5', 123, 'park');

select * from product; // 전체 테이블 리스트조회

select pno, pname, price from product; // 리스트 조회

select * from product where pno = 2; // 개별(pno만) 디테일 조회

update product set pname = 'Test Product 11', price = 12347, 
regdate = now(), madeby = 'kim'
where pno = 1;  // 수정

select * from product where pno = 1;

delete from product where pno = 5; //삭제

select * from product;