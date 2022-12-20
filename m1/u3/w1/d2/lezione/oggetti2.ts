//keyword PRIVATE
/*class Persona {
    nome:string;
    cognome:string;
    //se non dichiaro nulla il metodo è pubblico e quindi accessibile dall'esterno
    //se metto private sarà accessibile solo dall'interno della classe e non da fuori
    private visualizzaNomeCognome(){
        return this.nome + ' ' + this.cognome
    }
}
var mario = new Persona()
mario.nome= 'mariuccio'
mario.cognome='xyzhhh'
//mario.visualizzaNomeCognome() da errore perchè la funzione è privata
*/
//keyword STATIC
//si usa per usare un metodo senza istanziare la classe
/*
class Persona {
    nome:string;
    cognome:string;
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
    }
    static concatena(a:string, b:string){
        return a + ' ' + b;
    }
}
console.log(Persona.concatena("Mario","Rossi"))*/

//EXTENDS
//estendo una classe
class Shape {
    Area: number

    constructor(a: number) {
        this.Area = a
    }
}
class Circle extends Shape {
    disp(): void {
        console.log('area of the circle= ' + this.Area)
    }
}
var obj0 = new Circle(223)

obj0.disp()

//extends multilevel
class Root{
    str:string
}
class Child extends Root{}
class Leaf extends Child {}
var objk = new Leaf()
objk.str = "helloooo"
console.log(objk.str)
