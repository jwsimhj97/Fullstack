--그룹함수
--sum,avg,min,max,count,stddev,variance
select sal from emp;

--sum
select sum(sal) from emp;
select sal+empno from emp;
select sum(sal,empno) from emp;
select ename,sum(sal) from emp;		--그룹함수는 단일함수와 같이 사용x
select sum(sal),avg(sal),max(sal),min(sal) from emp;

--avg
select avg(sal),sum(sal) from emp;	--그룹함수끼리는 같이 사용 가능

--count
select count(ename),sum(sal) from emp;	-- count는 레코드 갯수를 구하는 함수이다.
select count(sal), count(*), count(comm) from emp;	-- count는 그룹함수 중 유일하게 (*) 허용된다. 단, 컬럼값이 null일 경우 카운팅에서 제외된다.

--group by
select sum(sal) from emp where deptno=10;
select sum(sal) from emp where deptno=20;
select sum(sal) from emp where deptno=30;
select sum(sal) from emp group by deptno;	-- 위의 3줄을 group by로 요약
select deptno,sum(sal) from emp group by deptno;

--having
select deptno,avg(sal) from emp group by deptno having avg(sal)<=2000;	-- where처럼 group by에 조건을 다는 경우에 쓰인다.


--트렌젝션
--commit / rollback - 대상: insert,update,delete
--commit = 강제적으로 지금까지의 데이타를 저장해준다. (DML의 적용)
--rollback = 마지막 커밋시접으로 돌아가도록 명령한다.
--savepoint - 대상: insert,update,delete
--ex) savepoint sav1 ==> rollback to sav1;




--시퀀스
create table test01(
	num number,
	name varchar2(10)
);
--select max(num) from test01;
--insert into test01 values (1,'test1');
--insert into test01 values (2,'test2');
--insert into test01 values (3,'test3');


--create table test02(
--	num number	--0
--);
--insert into test02 value (0);

--select num+1 from test02;
--insert into test01 values (1,'test1');
--update test02 num=num+1;


create sequence test01_seq;
--insert into test01 values (test01_seq.nextval, 'test1');
select test01_seq.nextval from dual;	--sequence 호출할 때마다 자동으로 다음값이 올라간다.




