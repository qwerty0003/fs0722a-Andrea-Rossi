class Person {
    constructor(name,age){
        this.name=name;
        this.age=age;
    }
    static compara(pers1,pers2){
        if(pers1.age > pers2.age){
            return console.log(pers1.name + ' è più anziano di ' + pers2.name);
        }
        else if(pers1.age < pers2.age){
            return console.log(pers1.name + ' è più giovane di ' + pers2.name);
        }
        else(pers1.age == pers2.age);{
            return console.log(pers1.name + ' e ' + pers2.name + ' hanno la stessa età')
        }     
    }
}

var mario = new Person('Mario',50)
var luca = new Person('Luca',20)
var gigi = new Person('Gigi',20)
Person.compara(mario,luca)
Person.compara(gigi,luca)
Person.compara(gigi,mario)