CREATE TABLE megnevezesek(
	mid INTEGER PRIMARY KEY AUTOINCREMENT,
	megnevezes VARCHAR(30));
CREATE TABLE csucsok(
	csid INTEGER PRIMARY KEY AUTOINCREMENT,
	x INTEGER,
	y INTEGER);
CREATE TABLE kapcsolatok(
	sorszam INTEGER PRIMARY KEY AUTOINCREMENT,
	mid INTEGER,
	csid INTEGER,
	FOREIGN KEY(csid) REFERENCES csucsok(csid),
	FOREIGN KEY(mid) REFERENCES megnevezesek(csid));
INSERT INTO megnevezesek(megnevezes) VALUES("Háromszög");
INSERT INTO megnevezesek(megnevezes) VALUES("Négyszög");
INSERT INTO megnevezesek(megnevezes) VALUES("Téglalap");
INSERT INTO megnevezesek(megnevezes) VALUES("Ötszög");
INSERT INTO megnevezesek(megnevezes) VALUES("Négyszög");
INSERT INTO megnevezesek(megnevezes) VALUES("Négyzet");
INSERT INTO megnevezesek(megnevezes) VALUES("Hatszög");
INSERT INTO megnevezesek(megnevezes) VALUES("Négyzet");
INSERT INTO megnevezesek(megnevezes) VALUES("Téglalap");
INSERT INTO megnevezesek(megnevezes) VALUES("Háromszög");


