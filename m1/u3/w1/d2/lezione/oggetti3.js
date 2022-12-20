var Personaa = /** @class */ (function () {
    function Personaa(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.nomeCompl = nome + ' ' + cognome;
    }
    return Personaa;
}());
var marioRossi = new Personaa('Mario', 'Rossi');
var Persone = /** @class */ (function () {
    function Persone(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    Object.defineProperty(Persone.prototype, "nomeCompl", {
        get: function () {
            return this.nome + ' ' + this.cognome;
        },
        set: function (valore) {
            var parti = valore.toString().split(' ');
            this.nome = parti[0] || '';
            this.cognome = parti[1] || '';
        },
        enumerable: false,
        configurable: true
    });
    return Persone;
}());
var mario = new Persone('Mariolino', 'Crozza');
console.log(mario.nomeCompl);
console.log(mario.nome);
console.log(mario.cognome);
mario.nomeCompl = 'Giuseppe Verdi';
console.log(mario.nomeCompl);
console.log(mario.nome);
console.log(mario.cognome);
mario.nomeCompl = 'Giggino Gigginiss';
console.log(mario.nomeCompl);
console.log(mario.nome);
console.log(mario.cognome);
//console.log(mariolino.nomeCompl()) funziona in ecmascript5
