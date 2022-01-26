--not null
create table ex01(
	num1 number not null,	-- not null : null을 허용하지 않는다
	num2 number,
	name varchar2(10) not null,
	sub varchar2(10)
);
insert into ex01 values (1000,1111,'test1','test2');
insert into ex01 values (null,null,null,null);	-- not null인 경우에는 null들어가면 안됨으로 오류가 발생.
insert into ex01 values (2000,null,'test1',null);
insert into ex01 (num1, name) values (3000,'test2');
insert into ex01 values (4000,4444,'','');		-- ''의 경우는 null로 판단하여 오류 발생.
insert into ex01 values (4000,4444,'null','');
insert into ex01 values (5000,'','test1','test2');
insert into ex01 values (6000,0,'test1','test2');
insert into ex01 values ('7000','7777','test1','test2');

select * from ex01;



--unique
create table ex02(
	num1 number unique,		-- unique : value값 중복불허(단, null의 중복허용은 된다.)
	num2 number,
	msg1 varchar2(10) unique,
	msg2 varchar2(10)
);
insert into ex02 values (1111,1111,'test1','test1');
insert into ex02 values (2222,2222,'test2','test2');
insert into ex02 values (3333,3333,'test3','test3');
insert into ex02 values (4444,4444,'test4','test4');
insert into ex02 values (5555,5555,null,'test5');

select * from ex02;



--primary key(유일키 값)
create table ex03(
	num1 number primary key,	-- primary key : not null과 unique 조건이 합쳐진 조건이다.
	num2 number unique not null,
	msg1 varchar2(10) unique not null,
	msg2 varchar2(10)
);
insert into ex03 values (1111,1111,'test1','test1');
insert into ex03 values (2222,2222,'test2','test2');
insert into ex03 values (3333,3333,'test3','test3');
insert into ex03 values (2222,4444,'test4','test4');

select * from ex03;



--references
create table ex04(		-- 부모 테이블
	num1 number primary key,
	num2 number	
);
create table ex05(		-- 자식 테이블
	num1 number primary key,
	num2 number references ex04(num1)	-- references : 부모테이블의 있는 값만 사용 가능하다 
);
insert into ex04 values (1111,1111);
insert into ex04 values (2222,2222);
insert into ex04 values (3333,3333);
insert into ex04 values (4444,4444);
insert into ex05 values (1111,1111);
insert into ex05 values (2222,2222);
insert into ex05 values (3333,1111);
insert into ex05 values (4444,4444);

select ename,deptno from emp;

select * from dept;



--check
create table ex06(
	num number primary key,
	name varchar2(10),
	gender char(3) check (gender in ('남','여')) 	-- in () : 옵션
);
insert into ex06 values (1111,'test1','남');
insert into ex06 values (2222,'test2','여');
insert into ex06 values (3333,'test3','외');

create table ex07(
	num number primary key,
	name varchar2(10),
	age number check (age between 1 and 80)			-- check ()안에 들어가있는 조건만 실행가능
);
insert into ex07 values (1,'test1',1);
insert into ex07 values (2,'test2',10);
insert into ex07 values (3,'test3',15);
insert into ex07 values (4,'test4',80);
insert into ex07 values (5,'test5',0);				-- 조건외의 values값은 진행불가




--default
create table ex08(
	num1 number constraint ex08_num1_pk primary key,
	num2 number default 100,
	sub varchar2(12) default '제목없음'
);
insert into ex08 values (1111,1111,'test1');
insert into ex08 (num1) values (2222);
insert into ex08 values (3333,null,null);		-- default 값이 있지만 values값에 null을 넣으면 null이 들어간다

select * from ex08;



--constraint
--제약조건 명명법(테이블명_컬럼명_제약조건)
create table ex09(
	num1 number,
	num2 number,
	msg1 varchar2(10),
	msg2 varchar2(10) constraint ex09_msg2_nn not null,
	constraint ex09_num1_pk primary key(num1),
	constraint ex09_msg1_uq unique(msg1),
	constraint ex09_num2_fk foreign key(num2) references ex08(num1)
);
insert into ex09 values (1111,1111,'test1','test1');
insert into ex09 values (2222,9999,'test2','test1');
insert into ex09 values (3333,9999,'test1','test1');

select * from ex09;



--drop table ex04;	-- ex04의 내용을 ex05에서 참조하고 있기 때문에 바로 삭제 불가능하다
--alter : 수정
--drop constraint 제약조건 삭제하기
alter table ex09 drop constraint ex09_num2_fk;
alter table ex09 drop constraint ex09_msg1_uq;
alter table ex09 drop constraint ex09_num1_pk;
--add constraint 제약조건 추가하기
alter table ex09 add constraint ex09_num1_pk primary key(num1);
















