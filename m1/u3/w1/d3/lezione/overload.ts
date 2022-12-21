//overload list-> quando in una funzione dichiaro tipi diversi
//compliler-> analizza la lista e cerca la compilazione corretta da invocare in base agli argomenti
//possiamo definire più funzioni con lo stesso nome ma che hanno parametri diversi per numero e tipo
//possiamo avere valori di ritorno diversi
//1. elenco le varie versioni di una funzione (senza il corpo della funzione, ma con  i tipi di parametri + dei valori di ritorno)
//2.definisco le funzioni e assegno i diversi comportamenti
/*
function sommina(addendo1: number, addendo2: number): number
function sommina(addendi: number[]): number
function sommina(a: number | number[], b?: number) {
    if (typeof a === 'number') {
        return a + b
    }
    return a.reduce(
        (
            parziale: number,
            valoreCorrente: number,
            indiceCorrente: number,
            a: number[]=> {
                return parziale+valoreCorrente + indiceCorrente
            })
    )
}
console.log(somma(1,2))
console.log(somma([6,12,13,56]))
*/
