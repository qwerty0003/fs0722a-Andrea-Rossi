var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (g && (g = 0, op[0] && (_ = 0)), _) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
var Vestito = /** @class */ (function () {
    function Vestito(id, codprod, collezione, capo, modello, quantita, colore, prezzoivainclusa, prezzoivaesclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
        this.valoresconto = this.getsaldocapo();
        this.costotot = this.getacquistocapo();
    }
    Vestito.prototype.getsaldocapo = function () {
        console.log((this.prezzoivainclusa * this.saldo) / 100);
        return (this.prezzoivainclusa * this.saldo) / 100;
    };
    Vestito.prototype.getacquistocapo = function () {
        console.log((this.prezzoivainclusa - this.getsaldocapo()));
        return (this.prezzoivainclusa - this.getsaldocapo());
    };
    return Vestito;
}());
var capoAbbigliamento = [];
function loadJSON(url) {
    return __awaiter(this, void 0, void 0, function () {
        var res;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0: return [4 /*yield*/, fetch(url)];
                case 1:
                    res = _a.sent();
                    return [4 /*yield*/, res.json()];
                case 2: return [2 /*return*/, _a.sent()];
            }
        });
    });
}
loadJSON('https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f').then(function (res) {
    for (var _i = 0, res_1 = res; _i < res_1.length; _i++) {
        var vestito = res_1[_i];
        var vestitino = new Vestito(vestito.id, vestito.codprod, vestito.collezione, vestito.capo, vestito.modello, vestito.quantita, vestito.colore, vestito.prezzoivainclusa, vestito.prezzoivaesclusa, vestito.disponibile, vestito.saldo);
        capoAbbigliamento.push(vestitino);
    }
    for (var _a = 0, capoAbbigliamento_1 = capoAbbigliamento; _a < capoAbbigliamento_1.length; _a++) {
        var pls = capoAbbigliamento_1[_a];
        document.getElementById('attaccati').innerHTML += "\n         <div class=\"card col-2 me-2\">        \n         <div class=\"card-body\">\n                     <h5 class=\"card-title\">".concat(pls.capo, " di colore: ").concat(pls.colore, "</h5>\n                     <h6 class=\"card-subtitle mb-2\">Collezione ").concat(pls.collezione, " al prezzo di ").concat(pls.prezzoivainclusa, " IVA inclusa</h6>\n                   <p class=\"card-text\">Disponibilit\u00E0: ").concat(pls.quantita, "</p>\n                    <p class=\"card-text\">Sconto del ").concat(pls.saldo, "%, il prezzo finale sar\u00E0 ").concat(pls.costotot, "</p>\n                 </div></div>");
    }
});
