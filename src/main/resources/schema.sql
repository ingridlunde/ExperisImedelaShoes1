 --Utfører en varehandel -- plasserer i handlekurv

--Er det nødvendig med modell? Ligger ikke det inn i bestillingsnr?
CREATE TABLE VareBestilling (
BestillingsNr INTEGER AUTO_INCREMENT NOT NULL,
varenr INTEGER(100) NOT NULL,
antall INTEGER(100) NOT NULL,
modell VARCHAR(255) NOT NULL,
størrelse VARCHAR(255) NOT NULL,
pris INTEGER(100) NOT NULL,
PRIMARY KEY(BestillingsNr)
FOREIGN KEY(VareNr, KundeNr)
);

 --VareNR tas inn for å holde oversikt over tidligere kjøp, Brukes også til å telle kjøp for å generere gavekort.
 CREATE TABLE Kunde (
 kundeNr INTEGER AUTO_INCREMENT NOT NULL,
 fornavn INTEGER(100) NOT NULL,
 etternavn VARCHAR(255) NOT NULL,
 epost VARCHAR(255) NOT NULL,
 telefonnr INTEGER(100) NOT NULL,
 antallkjop INTEGER(100) NOT NULL),
     PRIMARY KEY(Kundenr)
     FOREIGN KEY(Bestillingsnr)
     );



--Ledige størrelser ?? egen?
CREATE TABLE Varelager
    VareNr
    modellNr
    Antall


--Egen tabell for hvert merke. Viser bare et eksempelmerke for sko og klokker

--Eks sko. Dette blir lagt inn på server og skal ikke lages ny tabell for her. Men fint å ha et bilde av modellen

CREATE TABLE MomaShoes (
 modellNr INTEGER AUTO_INCREMENT NOT NULL,
 merke VARCHAR(255) NOT NULL,
 navn VARCHAR(255) NOT NULL,
 modell VARCHAR(255) NOT NULL,
 PRIMARY KEY(modellNr),
 FOREIGN KEY (vareNr, KundeNr)
);

--Eks klokke
CREATE TABLE MauriceLacroix
(
    modellNr INTEGER AUTO_INCREMENT NOT NULL,
    merke    VARCHAR(255) NOT NULL,
    navn     VARCHAR(255) NOT NULL,
    modell   VARCHAR(255) NOT NULL,
    PRIMARY KEY (modellNr),
    FOREIGN KEY (vare)
);


