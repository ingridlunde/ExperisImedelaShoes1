
--Lager en varerelageroversikt

CREATE TABLE Varelager (
vareNr INTEGER AUTO_INCREMENT NOT NULL,
antall INTEGER(100) NOT NULL,
modell VARCHAR(255) NOT NULL,
størrelse VARCHAR(255) NOT NULL,
pris INTEGER(100) NOT NULL,
PRIMARY KEY(vareNr)
FOREIGN KEY(modellNr)
)

--Ledige størrelser ?? egen?
CREATE TABLE
    VareNr

--Egen tabell for hvert merke. Viser bare et eksempelmerke for sko og klokker

--Eks sko
CREATE TABLE Moma (
 modellNr INTEGER AUTO_INCREMENT NOT NULL,
 merke VARCHAR(255) NOT NULL,
 navn VARCHAR(255) NOT NULL,
 modell VARCHAR(255) NOT NULL,
 PRIMARY KEY(modellNr),
 FOREIGN KEY (vareNr)
)

--Eks klokke
CREATE TABLE MauriceLacroix (
 modellNr INTEGER AUTO_INCREMENT NOT NULL,
 merke VARCHAR(255) NOT NULL,
 navn VARCHAR(255) NOT NULL,
 modell VARCHAR(255) NOT NULL,
 PRIMARY KEY(modellNr),
 FOREIGN KEY (vare