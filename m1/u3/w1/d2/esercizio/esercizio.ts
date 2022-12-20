class BankAccount { //creo una classe 
    balanceinit:number;
    constructor(balanceInit:number){ //costruttore per scegliere saldo iniziale
        this.balanceinit=balanceInit;
    }
    oneDeposit(n:number){ //metodo per deposito alla propria banca
        let newBalance = this.balanceinit + n;
        console.log('After this deposit your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    oneWithDraw(n:number){ //metodo per prelievo alla propria banca
        let newBalance = this.balanceinit - n;
        console.log('After this withdraw your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    twoDeposit(n:number,n1:number){ //metodo per deposito ad un altra banca
        let newBalance = (this.balanceinit + n + n1);
        console.log('After this deposit(unknown ATM) your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    twoWithDraw(n:number,n1:number){ //metodo per prelievo ad un altra banca
        let newBalance = (this.balanceinit - n - n1);
        console.log('After this withdraw(unknown ATM) your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
}

class AdultsAccount extends BankAccount{
    addInterest(){ //metodo per interessi conto corrente
        let balance = (this.balanceinit * 0.1);
        let newBalance = this.balanceinit - balance;
        console.log('New balance after interest withdrew: '+newBalance)
        this.balanceinit = newBalance
    }
}

let MotherAccount = new AdultsAccount(20000) //apertura conto con 20k
let SonAccount = new BankAccount(2000) //apertura cionto con 2k
console.log(MotherAccount.balanceinit)
console.log(SonAccount.balanceinit)
//deposito n 1
MotherAccount.oneDeposit(2000) //22000
SonAccount.oneDeposit(50) //2050
//prelievo n1
MotherAccount.oneWithDraw(400) //21600
SonAccount.oneWithDraw(70) //1980
//deposito 2
MotherAccount.twoDeposit(700,450) //22750
SonAccount.twoDeposit(30,55) //2065
//prelievo 2
MotherAccount.twoWithDraw(250,300) //22200
SonAccount.twoWithDraw(150,40) //1875
//interessi
MotherAccount.addInterest() //19980
