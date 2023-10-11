CREATE TABLE megnevezesek(

    mid INTEGER PRIMARY KEY AUTOINCREMENT,

    megnevezes VARCHAR(20));


CREATE TABLE csucsok(

    mid INTEGER PRIMARY KEY AUTOINCREMENT,

    x INTEGER,

    y INTEGER);


CREATE TABLE kapcsolatok(

    sorszam INTEGER PRIMARY KEY AUTOINCREMENT,

    mid INTEGER,

    csid INTEGER,

    FOREIGN KEY (csid) REFERENCES csucsok(csid),

    FOREIGN KEY (mid) REFERENCES megnevezesek(mid));


INSERT INTO megnevezesek(megnevezes)

VALUES

("háromszög"),

("négyszög"),

("ötszög"),

("négyzet"),

("téglalap");


INSERT INTO csucsok(x,y)

VALUES

(10,10),

(10,100),

(100,100),

(100,10),

(20,20),

(20,100),

(100,20),

(200,10),

(10,200),

(200,200),

(200,100),

(100,200);


INSERT INTO kapcsolatok(mid,csid)

VALUES

(4,1),

(4,2),

(4,3),

(4,4),

(5,1),

(5,2),

(5,3),

(5,4),

(2,1),

(2,2),

(2,3),

(2,4),

(1,1),

(1,2),

(1,3),

(1,1),

(1,2),

(1,4),

(1,1),

(1,3),

(1,4),

(1,2),

(1,3),

(1,4),

(3,1),

(3,2),

(3,10),

(3,7),

(3,8),

(2,1),

(2,5),

(2,7),

(2,4),

(4,5),

(4,6),

(4,3),

(4,7),

(3,5),

(3,6),

(3,12),

(3,11),

(3,7),

(5,1),

(5,2),

(5,11),

(5,8);