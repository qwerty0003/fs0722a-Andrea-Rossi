interface IPersonaTax{
    name:string
    redditoannuolordo:number
    codredd:number
    tasseinps:number
    tasseirpef:number
    getTasseIrpef():any
    getTasseInps():any
    getCoddRed():any
    getUtileTasse():number
    getRedditoAnnuoNetto():number
}

class Persona implements IPersonaTax{
    name:string
    redditoannuolordo:number
    codredd:number
    tasseinps:number
    tasseirpef:number
    constructor(redditoannuolordo:number,name:string){
        this.name=name;
        this.redditoannuolordo=redditoannuolordo;
        this.tasseirpef=this.getTasseIrpef();
        this.tasseinps=this.getTasseInps();
        this.codredd=this.getCoddRed();
    }

    getTasseIrpef():any{
        let el:number = this.redditoannuolordo
        let e:number = this.tasseirpef
        if(el <= 15000){
            e = 0.23
            return e
        }if(el > 15000 && el <= 28000){
            e = 0.25
            return e
        }if(el > 28000 && el <= 50000){
            e = 0.35
            return e
        }if(el > 50000){
            e = 0.43
            return e
        }
    }

    getTasseInps():any{
        let el:number = this.redditoannuolordo
        let e:number = this.tasseinps
        if(el <=  48279){
            e = 0.2328
            return e
        }else{
            e = 0.2428
            return e
        }
    }
    
    getCoddRed():any{
        let el:number = this.redditoannuolordo
        let e:number = this.codredd
        if(el <= 15000){
            e = 0.5
            return e
        }if(el > 15000 && el <= 28000){
            e = 0.6
            return e
        }if(el > 28000 && el <= 50000){
            e = 0.7
            return e
        }if(el > 50000 && el < 300000){
            e = 0.85
            return e
        }if(el >= 300000){
            e = 0.96
            return e
        } 
    }

    getUtileTasse():number{
        let el:number = this.redditoannuolordo
        let e:number = this.codredd
        console.log(`Reddito tassabile di ${this.name}: ${(el*e)}`)
        return el*e
    }

    getRedditoAnnuoNetto():number{
        let redd:number = this.redditoannuolordo
        let el:number = this.getUtileTasse()
        let e1:number = this.tasseinps
        let e2:number = this.tasseirpef
        let f1:number = el*e1
        let f2:number = el*e2
        let f3:number = f1+f2
        console.log(`Reddito lordo di ${this.name}: ${redd}`)
        console.log(`Reddito al netto delle tasse di ${this.name}: ${(redd-f3)}`)
        return redd - f3
    }
}

var mario = new Persona(10000,'Mario Rossi') //10k fratello povero di Gino
var gigi = new Persona(20000,'Gigi Bianchi') //20k
var piero = new Persona(35000,'Piero Neri') //35k
var gino = new Persona(60000,'Gino Rossi') //60k fratello di Mario
var riccone = new Persona(500000,'Richie Rich') //500k

//log varie persone
console.log(mario, gigi, piero, gino, riccone)

//calcolo reddito al netto delle tasse
mario.getRedditoAnnuoNetto()
gigi.getRedditoAnnuoNetto()
piero.getRedditoAnnuoNetto()
gino.getRedditoAnnuoNetto()
riccone.getRedditoAnnuoNetto()