// ESEMPIO
// var person = {
//     fisrtname: 'Fede',
//     lastname: 'De Filippis',
//     sayHello:function(){}
// }
// person.sayHello = function(){
//     console.log('hello '+person.fisrtname)
// }
// person.sayHello()
/* ESEMPIO
var person = {
    fisrtname: 'Fede',
    lastname: 'De Filippis'
}
var invoked = function(obj: {fisrtname:string, lastname:string}){
    console.log('fist name: '+obj.fisrtname)
    console.log('last name: '+obj.lastname)
}
invoked(perosn)*/
//classi
//ESEMPIO
/*
class Persona {
    nome:string;
    cognome:string
    constructor(nome:string,cognome:string){
        this.nome=nome
        this.cognome=cognome
    }
    visualizzaNomeCognome(){
        return this.nome + ' ' + this.cognome
    }
}*/
//ESEMPIO
class Car{
    //field
    engine:string

    //constructor (funzione speciale che serve ad inizializzare le var -> è una funzione e quindi può avere parametri)
    contructor(engine:string){
        this.engine=engine
    }

    //metodi(funzioni delle classi)
    disp():void{
        console.log('Engine is: '+this.engine)
    }

}
//create an obj
var obj = new Car("XXSY12")
console.log("engine"+ obj.engine)
obj.disp()