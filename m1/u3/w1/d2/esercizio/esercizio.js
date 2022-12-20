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
var BankAccount = /** @class */ (function () {
    function BankAccount(balanceInit) {
        this.balanceinit = balanceInit;
    }
    BankAccount.prototype.oneDeposit = function (n) {
        var newBalance = this.balanceinit + n;
        console.log('After this deposit your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.oneWithDraw = function (n) {
        var newBalance = this.balanceinit - n;
        console.log('After this withdraw your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.twoDeposit = function (n, n1) {
        var newBalance = (this.balanceinit + n + n1);
        console.log('After this deposit(unknown ATM) your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.twoWithDraw = function (n, n1) {
        var newBalance = (this.balanceinit - n - n1);
        console.log('After this withdraw(unknown ATM) your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    return BankAccount;
}());
var AdultsAccount = /** @class */ (function (_super) {
    __extends(AdultsAccount, _super);
    function AdultsAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    AdultsAccount.prototype.addInterest = function () {
        var balance = (this.balanceinit * 0.1);
        var newBalance = this.balanceinit - balance;
        console.log('New balance after interest withdrew: ' + newBalance);
        this.balanceinit = newBalance;
    };
    return AdultsAccount;
}(BankAccount));
var MotherAccount = new AdultsAccount(20000); //apertura conto con 20k
var SonAccount = new BankAccount(2000); //apertura cionto con 2k
console.log(MotherAccount.balanceinit);
console.log(SonAccount.balanceinit);
//deposito n 1
MotherAccount.oneDeposit(2000); //22000
SonAccount.oneDeposit(50); //2050
//prelievo n1
MotherAccount.oneWithDraw(400); //21600
SonAccount.oneWithDraw(70); //1980
//deposito 2
MotherAccount.twoDeposit(700, 450); //22750
SonAccount.twoDeposit(30, 55); //2065
//prelievo 2
MotherAccount.twoWithDraw(250, 300); //22200
SonAccount.twoWithDraw(150, 40); //1875
//interessi
MotherAccount.addInterest(); //19980
