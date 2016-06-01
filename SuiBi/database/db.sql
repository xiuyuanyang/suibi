create table users (
	id varchar(64) primary key,
	username varchar(64) unique,
	mobile varchar(64),
	password varchar(64)
);

create table books (
	bkid varchar(64) primary key,
	owner varchar(64),
	bookname varchar(64)
);

create table users_to_books (
	bkid varchar(64),
	zuozhe varchar(64)
);

create table books_chapters (
	bcid varchar(64),
	bkid varchar(64),
	bookname varchar(64),
	owner varchar(64),
	zuozhe varchar(64),
	chapter int(4),
	chapter_name varchar(64),
	content varchar(20000)
);

create table branch_openning_pool (
	bcid varchar(64),
	fangshi varchar(8),
	insert_date date
);

create table election_mode (
	fangshi varchar(8),
	miaoshu	varchar(64),
	tianshu int(10),	-- 2 ge yue zuo you
	beixuanshu int(10)  -- xiao yu deng yu 5 ge
);

create table branch_voting_pool (
	bvpid varchar(64) primary key,
	owner varchar(64),
	zuozhe varchar(64),
	bookname varchar(64),
	chapter int(4),
	chapter_name varchar(64),
	content varchar(20000),
	voted_number int(10)
);

create table vote_records (
	bvpid varchar(64),
	id varchar(64)
);

create table branch_owner_pick (
	owner varchar(64),
	zuozhe varchar(64),
	bookname varchar(64),
	chapter varchar(64),
	content varchar(20000)
);





