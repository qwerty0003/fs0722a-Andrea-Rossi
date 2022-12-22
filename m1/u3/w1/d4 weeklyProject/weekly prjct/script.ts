interface IAbbigliamento {
    id: number
    codprod: number
    collezione: string
    capo: string
    modello: number
    quantita: number
    colore: string
    prezzoivaesclusa: number
    prezzoivainclusa: number
    disponibile: string
    saldo: number
    valoresconto: number
    costotot: number
    getsaldocapo(): number
    getacquistocapo(): number
}

class Vestito implements IAbbigliamento {
    id: number
    codprod: number
    collezione: string
    capo: string
    modello: number
    quantita: number
    colore: string
    prezzoivaesclusa: number
    prezzoivainclusa: number
    disponibile: string
    saldo: number
    valoresconto: number
    costotot: number

    constructor(id: number, codprod: number, collezione: string, capo: string, modello: number, quantita: number, colore: string, prezzoivainclusa: number, prezzoivaesclusa: number, disponibile: string, saldo: number) {
        this.id = id
        this.codprod = codprod
        this.collezione = collezione
        this.capo = capo
        this.modello = modello
        this.quantita = quantita
        this.colore = colore
        this.prezzoivaesclusa = prezzoivaesclusa
        this.prezzoivainclusa = prezzoivainclusa
        this.disponibile = disponibile
        this.saldo = saldo
        this.valoresconto = this.getsaldocapo()
        this.costotot = this.getacquistocapo()
    }


    getsaldocapo(): number {
        console.log((this.prezzoivainclusa * this.saldo) / 100)
        return (this.prezzoivainclusa * this.saldo) / 100
    }

    getacquistocapo(): number {
        console.log((this.prezzoivainclusa - this.getsaldocapo()))
        return (this.prezzoivainclusa - this.getsaldocapo())
    }
}


var capoAbbigliamento: IAbbigliamento[] = [];


async function loadJSON(url) {
    const res = await fetch(url);
    return await res.json();

}
loadJSON('https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f').then((res) => {

    for (let vestito of res) {

        let vestitino = new Vestito(vestito.id, vestito.codprod, vestito.collezione, vestito.capo, vestito.modello, vestito.quantita, vestito.colore, vestito.prezzoivainclusa, vestito.prezzoivaesclusa, vestito.disponibile, vestito.saldo)

        capoAbbigliamento.push(vestitino)
    }
     for (let pls of capoAbbigliamento) {
         (<HTMLDivElement>document.getElementById('attaccati')).innerHTML += `
         <div class="card col-2 me-2">        
         <div class="card-body">
                     <h5 class="card-title">${pls.capo} di colore: ${pls.colore}</h5>
                     <h6 class="card-subtitle mb-2">Collezione ${pls.collezione} al prezzo di ${pls.prezzoivainclusa} IVA inclusa</h6>
                   <p class="card-text">Disponibilità: ${pls.quantita}</p>
                    <p class="card-text">Sconto del ${pls.saldo}%, il prezzo finale sarà ${pls.costotot}</p>
                 </div></div>`
    }
})
