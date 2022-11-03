//Henter infor fra betalingssiden hvis kunde har lagt inn deler av informasjonen. Det fylles ut automatisk i boksene det tilhører.

function registrerKunde() {

    //Kopler attributter fra Html
    const fornavn = $("#fornavn");
    const etternavn = $("#etternavn");
    const epost = $("#epost");
    const telefonnr = $("#telefonnr")
    const addresse = $("#addresse");

//Hvis kunde ønsker å registrere seg.
    const registrerKunde = {
        //Henter kundenr fra bestiling.
        kunde: kundenr(),
        fornavn: fornavn.val(),
        etternavn: etternavn.val(),
        epost: epost.val(),
        telefonnr: telefonnr.val(),
        adresse: addresse.val()
    }

    if (!sjekkKunde(registrerKunde)) {
        return;
    }

//Lagre kunde
    $.post("/registrerKunde", registrerKunde, function () {
    });

}
