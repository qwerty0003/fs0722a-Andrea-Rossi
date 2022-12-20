//keyword ABSTRACT
//classi base che non possono essere istanziate, e devono avere almeno un metodo su cui farò la dichiarazione senza che venga implementato
abstract class Veicolo {
    private colore:string;
    protected modello:string
    protected marca:string
    //private solo all'interno della classe||protected solo nella classe e nelle estensioni della classe
    constructor(marca:string,modello:string,colore:string){
        this.marca=marca;
        this.modello=modello;
        this.colore=colore;
    }

    public vernicia(colore:string):void{
        this.colore=colore;
    }
    public coloreCorrente():string{
        return this.colore
    }
    public abstract dettagliVeicolo():string
}

class Automobilina extends Veicolo {
    constructor(marca:string,modello:string,colore:string){
        super(marca,modello,colore);
    }
    public dettagliVeicolo():string {
        return `${this.marca} - ${this.modello}`
    }
}

// const veicolino = new Veicolo('jaguar','666-Type','darkred') non posso
const veicolino = new Automobilina('Jaguar','666-Type','#666')
console.log(veicolino.dettagliVeicolo)
console.log(veicolino.coloreCorrente())
veicolino.vernicia('#fff')
console.log(veicolino.coloreCorrente())