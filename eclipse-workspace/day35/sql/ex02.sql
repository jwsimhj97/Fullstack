--old 조인 (2,4,5)
--1. Cross Join
--2. Equi Join
--3. NonEqui Join
--4. Outer Join
--5. Self Join
--
--
--ANSI 조인 (2,4)
--1. select * from ex01 cross join ex02;	[cross Join]
--2. select * from ex01 inner join ex02 on ex01.num=ex02.num where loc=’부산’;	[inner Join]
--2-1. select * from ex01 inner join ex02 using (num);	[inner Join > using] : 중복된 컬럼명이 하나 이상 필수
--3. select * from ex01 natural join ex02;	[natural Join] : 반드시 하나의 컬럼명이 중복되어야함
--4-1. select * from ex01 left outer join ex02 on ex01.num=ex02.num; [outer Join] : left outer Join
--4-2. select * from ex01 right outer join ex02 on ex01.num=ex02.num;	[outer Join] : right outer Join
--4-3. select * from ex01 full outer join ex02 on ex01.num=ex02.num;	[outer Join] : full outer Join
--
--
drop table ex01;
drop table ex02;
create table ex01(
	idx number,
	name varchar2(10),
	num number
);
create table ex02(
	num number,
	loc varchar2(6)
);
insert into ex01 values (1,'user1',1111);
insert into ex01 values (2,'user2',2222);
insert into ex01 values (3,'user3',3333);
insert into ex01 values (4,'user4',4444);

insert into ex02 values (1111,'서울');
insert into ex02 values (2222,'부산');
insert into ex02 values (3333,'대전');
insert into ex02 values (4444,'제주');
commit;



--1. 교집합
select * from ex01 inner join ex02 on ex01.num=ex02.num;
--2. 왼쪽전체
select * from ex01 left outer join ex02 on ex01.num=ex02.num;
--3. 오른쪽전체
select * from ex01 right outer join ex02 on ex01.num=ex02.num;
--4. 차집합(전체-오른쪽)
select * from ex01 left outer join ex02 on ex01.num=ex02.num where loc='서울';
--5. 차집합(전체-왼쪽)
select * from ex01 right outer join ex02 on ex01.num=ex02.num where loc='서울';
--6. 대칭차집합(전체-교집합)
select * from ex01 full outer join ex02 on ex01.num=ex02.num where ex01.num='1111' or ex02.num='2222';


--서브쿼리
select ename,(select ename from);