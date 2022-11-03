
CREATE TABLE Kunde (
                       kundenr INTEGER AUTO_INCREMENT NOT NULL,
                       fornavn VARCHAR(255) NOT NULL,
                       etternavn VARCHAR(255) NOT NULL,
                       epost VARCHAR(255) NOT NULL,
                       adresse VARCHAR(255) NOT NULL,
                       telefonnr VARCHAR(20),
                       PRIMARY KEY (kundenr)
);

