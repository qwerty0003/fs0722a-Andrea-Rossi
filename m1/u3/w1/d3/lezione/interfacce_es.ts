interface IPerson {
    firstname:string;
    lastname:string;
    sayHi:()=>string
}
//l'oggetto ha il vincolo definito nell'interfaccia
var customer:IPerson={
    firstname:'Pam',
    lastname:'Jerry',
    sayHi:():string=>{return 'Hi there!'}
}
console.log(customer.firstname)
console.log(customer.lastname)
console.log(customer.sayHi())

//ereditarietà
interface Person{
    eta:number
}
interface Musician extends Person{
    instrument:string
}
var drummer = <Musician>{}
drummer.eta=27
drummer.instrument='drum'
