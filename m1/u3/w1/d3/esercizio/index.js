var Persona = /** @class */ (function () {
    function Persona(redditoannuolordo, name) {
        this.name = name;
        this.redditoannuolordo = redditoannuolordo;
        this.tasseirpef = this.getTasseIrpef();
        this.tasseinps = this.getTasseInps();
        this.codredd = this.getCoddRed();
    }
    Persona.prototype.getTasseIrpef = function () {
        var el = this.redditoannuolordo;
        var e = this.tasseirpef;
        if (el <= 15000) {
            e = 0.23;
            return e;
        }
        if (el > 15000 && el <= 28000) {
            e = 0.25;
            return e;
        }
        if (el > 28000 && el <= 50000) {
            e = 0.35;
            return e;
        }
        if (el > 50000) {
            e = 0.43;
            return e;
        }
    };
    Persona.prototype.getTasseInps = function () {
        var el = this.redditoannuolordo;
        var e = this.tasseinps;
        if (el <= 48279) {
            e = 0.2328;
            return e;
        }
        else {
            e = 0.2428;
            return e;
        }
    };
    Persona.prototype.getCoddRed = function () {
        var el = this.redditoannuolordo;
        var e = this.codredd;
        if (el <= 15000) {
            e = 0.5;
            return e;
        }
        if (el > 15000 && el <= 28000) {
            e = 0.6;
            return e;
        }
        if (el > 28000 && el <= 50000) {
            e = 0.7;
            return e;
        }
        if (el > 50000 && el < 300000) {
            e = 0.85;
            return e;
        }
        if (el >= 300000) {
            e = 0.96;
            return e;
        }
    };
    Persona.prototype.getUtileTasse = function () {
        var el = this.redditoannuolordo;
        var e = this.codredd;
        console.log("Reddito tassabile di ".concat(this.name, ": ").concat((el * e)));
        return el * e;
    };
    Persona.prototype.getRedditoAnnuoNetto = function () {
        var redd = this.redditoannuolordo;
        var el = this.getUtileTasse();
        var e1 = this.tasseinps;
        var e2 = this.tasseirpef;
        var f1 = el * e1;
        var f2 = el * e2;
        var f3 = f1 + f2;
        console.log("Reddito lordo di ".concat(this.name, ": ").concat(redd));
        console.log("Reddito al netto delle tasse di ".concat(this.name, ": ").concat((redd - f3)));
        return redd - f3;
    };
    return Persona;
}());
var mario = new Persona(10000, 'Mario Rossi'); //10k fratello povero di Gino
var gigi = new Persona(20000, 'Gigi Bianchi'); //20k
var piero = new Persona(35000, 'Piero Neri'); //35k
var gino = new Persona(60000, 'Gino Rossi'); //60k fratello di Mario
var riccone = new Persona(500000, 'Richie Rich'); //500k
//log varie persone
console.log(mario, gigi, piero, gino, riccone);
//calcolo reddito al netto delle tasse
mario.getRedditoAnnuoNetto();
gigi.getRedditoAnnuoNetto();
piero.getRedditoAnnuoNetto();
gino.getRedditoAnnuoNetto();
riccone.getRedditoAnnuoNetto();
var button = document.getElementById('btn');
button === null || button === void 0 ? void 0 : button.addEventListener('click', function () {
    var nome = document.getElementById('nome').value;
    var reddito = document.getElementById('reddito').value;
    var user = new Persona(Number(reddito), String(nome));
    document.getElementById('output').innerHTML = "\n    <h2>Ciao ".concat(user.name, "</h2>\n    <h4>INPS: ").concat(user.tasseinps, "</h4>\n    <h4>IRPEF: ").concat(user.tasseirpef, "</h4>\n    <h4>Reddito tassabile: ").concat(user.getUtileTasse(), "</h4>\n    <h4>Reddito annuo al netto delle tasse: ").concat(user.getRedditoAnnuoNetto(), "</h4>");
});
