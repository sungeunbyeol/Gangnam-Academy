#2-1번
#CREATE DATABASE business
#CHARACTER SET = UTF8MB4;

#2-2번
#CREATE TABLE department(
#	deptno INT,
#	deptname VARCHAR(20),
#	manager VARCHAR(20),
#	constraint pk_deptno PRIMARY KEY(deptno));
	
#CREATE TABLE employee(
#	empno INT,
#	name VARCHAR(20),
#	phoneno INT,
#	address VARCHAR(20),
#	gender VARCHAR(20),
#	position VARCHAR(20),
#	deptno INT,
#	CONSTRAINT pk_empno PRIMARY KEY(empno));

#CREATE TABLE project(
#	projno INT,
#	projname VARCHAR(20),
#	deptno INT,
#	CONSTRAINT pk_projno PRIMARY KEY(projno));
	
#CREATE TABLE works(
#	projno INT,
#	empno INT,
#	hoursworked INT);

#3번
#INSERT INTO department VALUE(1, 'IT', '고남순');
#INSERT INTO department VALUE(2, 'Marketing', '홍길동');
#INSERT INTO employee VALUE(1, '김덕성', 01012341232, '서울','여','Programmer',1);
#INSERT INTO employee VALUE(2, '이서울', 01012323122, '서울','남','Programmer',1);
#INSERT INTO employee VALUE(3, '박연세', 01076851231, '대전','여','Saleperson',2);
#INSERT INTO employee VALUE(4, '홍길동', 01012341546, '서울','남','Manager',2);
#INSERT INTO employee VALUE(5, '고남순', 01012311112, '서울','여','Manager',1);
#INSERT INTO project VALUE(1, '데이터베이스구축', 1);
#INSERT INTO project VALUE(2, '시장조사', 2);
#INSERT INTO works VALUE(1, 1, 3);
#INSERT INTO works VALUE(1, 2, 1);
#INSERT INTO works VALUE(1, 5, 1);
#INSERT INTO works VALUE(2, 3, 1);
#INSERT INTO works VALUE(2, 4, 5);

#4번
#SELECT name, address
#FROM employee WHERE deptno=1;

#5번
#SELECT COUNT(position) AS "사원수"
#FROM employee WHERE POSITION="Manager";

#6번
#SELECT SUM(hoursworked) AS "총투입시간"
#FROM works WHERE projno=1;

#7번
#CREATE USER 'park'@'localhost' IDENTIFIED BY '0000';
#GRANT SELECT ON business.department TO 'park'@'localhost';
