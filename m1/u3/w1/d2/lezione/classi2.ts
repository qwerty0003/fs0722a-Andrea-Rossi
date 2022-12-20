class Vehicles {
    modello:string;
    marca:string;
    tipoVeicolo:string;
    constructor(marca:string,modello:string,tipoVeicolo:string){
        this.marca=marca;
        this.modello=modello;        
        this.tipoVeicolo=tipoVeicolo;
    }
    dettagliVeicolo():string{
        return `${this.tipoVeicolo} - ${this.marca} - ${this.modello}`;
    }
}
class Carz extends Vehicles{
    constructor(marca:string,modello:string){
        super(marca, modello, 'Automobile');
    }
    dettagliVeicolo():string{
        console.log('Dettagli auto:')
        return super.dettagliVeicolo()
    }
}
var jaguaretta = new Carz('Jaguar','Type-666')
console.log(jaguaretta.dettagliVeicolo())