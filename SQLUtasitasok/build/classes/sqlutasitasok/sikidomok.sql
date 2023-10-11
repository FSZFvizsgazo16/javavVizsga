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
INSERT INTO megnevezesek(megnevezes) VALUES("H�romsz�g");
INSERT INTO megnevezesek(megnevezes) VALUES("N�gysz�g");
INSERT INTO megnevezesek(megnevezes) VALUES("T�glalap");
INSERT INTO megnevezesek(megnevezes) VALUES("�tsz�g");
INSERT INTO megnevezesek(megnevezes) VALUES("N�gysz�g");
INSERT INTO megnevezesek(megnevezes) VALUES("N�gyzet");
INSERT INTO megnevezesek(megnevezes) VALUES("Hatsz�g");
INSERT INTO megnevezesek(megnevezes) VALUES("N�gyzet");
INSERT INTO megnevezesek(megnevezes) VALUES("T�glalap");
INSERT INTO megnevezesek(megnevezes) VALUES("H�romsz�g");


