salvaIDati = function (saveInfo) {
    localStorage.ultimoPensiero = saveInfo
    alert("Memorizzazione effettuata")
}

recuperaIlDato = function (el) {
    if (confirm("Sostituire il contenuto attuale con l'ultimo pensiero memorizzato?")) {
        el.value = localStorage.ultimoPensiero
    }
}