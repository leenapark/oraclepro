--계정 생성
create user phonedb IDENTIFIED by phonedb;
grant resource, connect to phonedb;

--테이블 삭제
drop table person;

--시퀀스 삭제
drop sequence seq_phone_id;

--phonedb 테이블 만들기
create table person (
    phone_id number(5),
    name varchar2(30) not null,
    hp varchar2(20),
    company varchar2(20),
    primary key(phone_id)
);

--시퀀스 생성
create sequence seq_phone_id
increment by 1
start with 1;


---------------------------------------------------------------
--insert문
insert into person
values (seq_phone_id.nextval, '이효리', '010-1111-1111', '02-1111-1111');

insert into person
values (seq_phone_id.nextval, '정우성', '010-2222-2222', '02-2222-2222');

insert into person
values (seq_phone_id.nextval, '유재석', '010-3333-3333', '02-3333-3333');

insert into person
values (seq_phone_id.nextval, '이정재', '010-4444-4444', '02-4444-4444');

insert into person
values (seq_phone_id.nextval, '서장훈', '010-5555-5555', '02-5555-5555');


commit;

--select문
select  phone_id,
        name,
        hp,
        company
from person;

--Update문
update person
set hp = '010-9999-9999',
    company = '02-9999-9999'
where phone_id = 4;

--delete문
delete person
where phone_id = 5;

--검색
select  name,
        hp,
        company
from person
where name like '%유%'
or hp like '%3%'
or company like '%123%';