
/*Når bestillingen er betalt blir det opprettet en ordre */
/*FOREIGN KEY(Varenr, Kundenr, prisVare )*/
CREATE TABLE Ordre (
    ordrenr INTEGER AUTO_INCREMENT NOT NULL,
    antall INTEGER(100) NOT NULL,
    totalpris INTEGER(100) NOT NULL,
    PakkeSendt BOOLEAN,
    PRIMARY KEY(ordrenr)
);



 /*Varenr tas inn for å holde oversikt over tidligere kjøp, Brukes også til å telle kjøp for å generere gavekort.*/
CREATE TABLE Kunde (
    kundenr INTEGER AUTO_INCREMENT NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    epost VARCHAR(255) NOT NULL,
    adresse VARCHAR(255) NOT NULL,
    telefonnr VARCHAR(20),
    PRIMARY KEY (kundenr)
);

/* FOREIGN KEY (produkttype)*/
/*Her har jeg oversikt over hva jeg har på lager. FOREIGN KEY (Varetype)*/
CREATE TABLE Varelager (
    varenr INTEGER AUTO_INCREMENT NOT NULL,
    skostorrelse INTEGER(100),
    antall INTEGER (100) NOT NULL,
    beskrivelse VARCHAR(255) NOT NULL,
    prisVare DECIMAL(50) NOT NULL,
    PRIMARY KEY (varenr)
);

-- varetype for å kunne ha støtte for utvidelse til klokker eller annet.
CREATE TABLE Varetype (
    modellnr INTEGER AUTO_INCREMENT NOT NULL,
    produkttype VARCHAR(255) NOT NULL,
    PRIMARY KEY (modellnr)
);

CREATE TABLE Gavekort (
    gavekortnr   INTEGER AUTO_INCREMENT NOT NULL,
    utlopsdato   DATE NOT NULL,
    datoGenerert DATE NOT NULL,
    belopTilGode DECIMAL(10) NOT NULL,
    PRIMARY KEY (gavekortnr)
);




