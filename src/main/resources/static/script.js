$(function() {
    lastInnVarer();
})

//Når det trykkes på en vare til handlekurv
    //function leggTilVarer();

//Når varen trykkes må handlekurv opppdateres
    //function oppdaterhandlekurv();
}

function leggTilVarer() {
    $.get("/hentVarer", function (varer) {
        formaterVarer(varer); //er den nødvendig?
    })
}

function registrerHandel () {

    //Må kunde registrere seg? Epost for å få kvittering
    //Kunde må ikke ha addresse, når det gjøres fra butikken.
    //Kopler attributtene til id i HTML.
    const varenr = $("#vare");
    const antall = $("#antall");
    const størrelse = $("#størrelse")
    const pris = $("#pris");
    const epost = $("#epost");
    const addresse = $("#addresse");


    //Samler alle inputene i const bestilling, fra id i HTML gjort over.
    const bestilling = {
        //Autogenerere et kundenr som blir koplet opp om de velger å registrere seg.
        kunde: kundenr(),
        vare: varenr.val(),
        antall: antall.val(),
        størrelse: størrelse.val(),
        epost: epost.val(),
        adresse: adresse.val()
    };

}
    //Sjekke bestilling før lagring
    if (!sjekkHandel(bestilling)) {
        return;
    }

    //Lagrer inputene
    $.post("/lagre", bestilling, function() {

    });

//Hvis kunde ønsker å registrere seg.
const registrerKunde = {
    //Henter kundenr fra bestiling.
    kunde: kundenr.val(),
    fornavn: fornavn.val(),
    etternavn: etternavn.val(),
    epost: epost.val(),
    telefonnr: telefonnr.val(),
    antallkjop: antallkjop.val(),
}

registrerKunde();

    $.post("/registrerKunde", registrerkunde, function()})





    // Viser handlekurv som tar getkal frå server og henter handlekurv
    visHandlekurv();