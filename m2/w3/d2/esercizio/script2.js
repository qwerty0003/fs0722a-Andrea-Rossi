let utenti = [
    { id: 1, nome: 'Luca', cognome: 'Rossi', classe: 'A' },
    { id: 2, nome: 'Luigi', cognome: 'Verdi', classe: 'A' },
    { id: 3, nome: 'Mario', cognome: 'Bianchi', classe: 'A' },
    { id: 4, nome: 'Piero', cognome: 'Neri', classe: 'A' },
    { id: 5, nome: 'Paolo', cognome: 'Rossi', classe: 'A' },
    { id: 6, nome: 'Sergio', cognome: 'Verdi', classe: 'A' },
    { id: 7, nome: 'Gianno', cognome: 'Bianchi', classe: 'A' },
    { id: 8, nome: 'Davide', cognome: 'Neri', classe: 'A' },
]
let posizioneAttuale;
class Paginazione {
    constructor(items, pageSize) {
        this.items = items;
        this.pageSize = pageSize;
    }
    impagina(i) {


        for (let riga of table) {
            let id = document.createElement("td");
            id.innerText = this.items[i].id;
            riga.appendChild(id);

            let nome = document.createElement("td");
            nome.innerText = this.items[i].nome;
            riga.appendChild(nome);

            let cognome = document.createElement("td");
            cognome.innerText = this.items[i].cognome;
            riga.appendChild(cognome);

            let classe = document.createElement("td");
            classe.innerText = this.items[i].classe;
            riga.appendChild(classe);
            i++;
        }
        posizioneAttuale = i


    }
}
let table = document.querySelectorAll(".righe");
let pagina = new Paginazione(utenti, 3);
pagina.impagina(0);
let ultimo = document.querySelector("#ultimo");
ultimo.addEventListener("click", function () {
    deleteRiga(table);

    pagina.impagina(utenti.length - 2);

})
let primo = document.querySelector("#primo");
primo.addEventListener("click", function () {
    deleteRiga(table);

    pagina.impagina(0);
})
let prossimo = document.querySelector("#successivo");
prossimo.addEventListener("click", function () {
    deleteRiga(table);
    pagina.impagina(posizioneAttuale);
})
let precedente = document.querySelector("#precedente");
precedente.addEventListener("click", function () {
    console.log("prova");
    deleteRiga(table);
    pagina.impagina(posizioneAttuale - 4);

})




function deleteRiga(table) {
    for (let riga of table) {
        riga.innerText = "";
    }

}