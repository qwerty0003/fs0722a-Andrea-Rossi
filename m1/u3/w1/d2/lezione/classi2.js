var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Vehicles = /** @class */ (function () {
    function Vehicles(marca, modello, tipoVeicolo) {
        this.marca = marca;
        this.modello = modello;
        this.tipoVeicolo = tipoVeicolo;
    }
    Vehicles.prototype.dettagliVeicolo = function () {
        return "".concat(this.tipoVeicolo, " - ").concat(this.marca, " - ").concat(this.modello);
    };
    return Vehicles;
}());
var Carz = /** @class */ (function (_super) {
    __extends(Carz, _super);
    function Carz(marca, modello) {
        return _super.call(this, marca, modello, 'Automobile') || this;
    }
    Carz.prototype.dettagliVeicolo = function () {
        console.log('Dettagli auto:');
        return _super.prototype.dettagliVeicolo.call(this);
    };
    return Carz;
}(Vehicles));
var jaguaretta = new Carz('Jaguar', 'Type-666');
console.log(jaguaretta.dettagliVeicolo());
