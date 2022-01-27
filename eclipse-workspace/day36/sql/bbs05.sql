drop table bbs05;
drop sequence bbs05_seq;

create table bbs05(
	num number primary key,		--번호
	sub varchar2(30),			--제목
	id varchar2(30) not null,	--작성자
	cnt number default 0,		--조회수
	content varchar2(2000),		--내용
	grp number,
	ord number default 0,
	dep number default 0
);
create sequence bbs05_seq;
--
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval,'테스트1','guest','test',bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval,'테스트2','guest','test',bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval,'테스트3','guest','test',bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval,'테스트4','guest','test',bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval,'테스트5','guest','test',bbs05_seq.currval);
commit;
select * from bbs05 order by grp desc,ord asc;
update bbs05 set cnt=cnt+1 where num=1;	-- 조회수 counting

-- ord = 0
insert into bbs05 (num,sub,id,content,grp,ord,dep)
	values (bbs05_seq.nextval,'답글1','guest','test',4,(select max(ord)+1 from bbs05 where grp=4),0+1);
-- ord != 0
update bbs05 set ord=ord+1 where grp=4 and ord>param;
insert into bbs05 (num,sub,id,content,grp,ord,dep)
	values (bbs05_seq.nextval,'답글1','guest','test',4,param+1,0+1);


