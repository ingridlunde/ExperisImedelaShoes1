function registrerOrdre () {

    //Epost for å få kvittering
    //Kunde må ikke ha addresse, når det gjøres fra butikken.
    //Kopler attributtene til id i HTML.
    const varenr = $("#vare");
    const antall = $("#antall");
    const størrelse = $("#størrelse")
    const epost = $("#epost");
    const addresse = $("#addresse");


    //Samler alle inputene i const bestilling, fra id i HTML gjort over.
    const bestilling = {
        //Autogenerere et kundenr som blir koplet opp om de velger å registrere seg.
        kunde: kundenr(),
        ordrenr: ordrenr(),
        vare: varenr.val(),
        antall: antall.val(),
        størrelse: størrelse.val(),
        epost: epost.val(),
        adresse: adresse.val()
    };


    //Sjekke bestilling før lagring
    if (!sjekkOrdre(bestilling)) {
        return;
    }

    sjekkAntallOrdre();

    //Lagrer inputene
    $.post("/lagre", bestilling, function () {

    });

}

function sjekkAntallOrdre() {
    $.get("/sjekkAntallOrdre", bestilling, function() {
        return sjekkAntallOrdre()
    })

}