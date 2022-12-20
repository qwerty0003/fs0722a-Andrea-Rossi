class Personaa {
    nome: string
    cognome: string
    nomeCompl: string
    constructor(nome, cognome) {
        this.nome = nome
        this.cognome = cognome
        this.nomeCompl = nome + ' ' + cognome
    }
}
var marioRossi = new Personaa('Mario', 'Rossi')


class Persone {
    nome: string
    cognome: string
    constructor(nome, cognome) {
        this.nome = nome
        this.cognome = cognome
    }
    get nomeCompl(): string {
        return this.nome + ' ' + this.cognome
    }
    set nomeCompl(valore:string){
        var parti = valore.toString().split(' ');
        this.nome = parti[0] || ''
        this.cognome = parti[1] || ''
    }
} 
var mario = new Persone('Mariolino','Crozza')
console.log(mario.nomeCompl)
console.log(mario.nome)
console.log(mario.cognome)
mario.nomeCompl = 'Giuseppe Verdi'
console.log(mario.nomeCompl)
console.log(mario.nome)
console.log(mario.cognome)
mario.nomeCompl = 'Giggino Gigginiss'
console.log(mario.nomeCompl)
console.log(mario.nome)
console.log(mario.cognome)
//console.log(mariolino.nomeCompl()) funziona in ecmascript5