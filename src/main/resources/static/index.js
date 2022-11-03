$(function () {
    lastInnVarer()
});


function lastInnVarer() {
    $.get("/hentVarer", function (varer) {
        formaterVarer(varer);
    })
}

//Når varen trykkes må handlekurv opppdateres
function oppdaterhandlekurv() {
}


function oppdaterOmsetning () {


}

function varerSendt() {


}






