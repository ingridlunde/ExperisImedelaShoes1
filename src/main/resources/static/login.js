function loggInnAnsatt() {
    if (loggInnValideringOk) {
        const url = "/loggInnAnsatt=" + $("#brukernavn").val() + $("#passord").val()
        $.get(url, function (OK) {
            if (OK) {
                window.location.href = 'ansatt.html';
            } else {
                $("#feil").html = "feil i brukernavne eller passord";
            }
        })

    }

    function loggInnKunde() {
        if (loggInnValideringOk) {
            const url = "/loggInnKunde=" + $("#brukernavn").val() + $("#passord").val()
            $.get(url, function (OK) {
                if (OK) {
                    window.location.href = 'kunde.html';
                } else {
                    $("#feil").html = "feil i brukernavne eller passord";
                }
            })

        }
    }
}

