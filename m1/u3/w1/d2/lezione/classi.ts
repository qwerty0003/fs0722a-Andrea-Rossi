//TS supporta l'ereditarietà delle classi
//la keyword extends estende una classe 'base'
//nel costruttore della classe derivata useremo super() per invocare il costruttore della classe base
class Vehicle {
    modello:string;
    marca:string;
    tipoVeicolo:string;
    constructor(marca:string,modello:string,tipoVeicolo:string){
        this.marca=marca;
        this.modello=modello;        
        this.tipoVeicolo=tipoVeicolo;
    }
    dettagliveicolo():string{
        return `${this.tipoVeicolo} - ${this.marca} - ${this.modello}`;
    }
}
class Cars extends Vehicle{
    constructor(marca:string,modello:string){
        super(marca, modello, 'Automobile');
    }
}
class MotorBike extends Vehicle{
    constructor(marca:string,modello:string){
        super(marca,modello,'Motoveicolo')
    }
}
const jaguar = new Cars('Jaguar','F-Type')
const ducati = new MotorBike('Ducati','Pinagale V4')
console.log(jaguar instanceof Cars)//true
console.log(ducati instanceof MotorBike)//false
console.log(ducati instanceof Cars)//true
