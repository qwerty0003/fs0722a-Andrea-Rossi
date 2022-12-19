//sintassi che dichiara una variabile
let nome:string = "Mary" //la var memorizza un tipo di dato stringa
let nome0:string //la var è una stringa ma il valore è undefined
let nome1 =  "Marie" //tipo di dato dedotto dal valore che scrivo(quindi la var nome1 sarà di tipo stringa)
let nome2 //tipo di dato any, valore undefined
let name0:string = "John"
let score1:number = 50
let score2:number = 42.50
let sum = (score1 + score2)/11
console.log("nome: "+nome)
console.log("first score: "+score1)
console.log("second score: "+score2)
console.log("sum of the scores/11: "+sum)

//Type assertion
let code:any = 123 //tipo any
let employeeCode = <number> code //type assertion
console.log(typeof(employeeCode))//tipo number

//Inferred typing
var num = 2 // data type inferred as number
console.log("value of num "+num)
//se provo a scrivere num = "12" avrò un errore perchè ormai num è num:number

//scopes
var global_num = 12 //global
class Numbers {
    num_val=13; //class
    static sval = 10;  //static
    storeNum():void{
        var local_num = 14 //locale
    }
}
console.log("Global num: "+global_num)
console.log("static numb: "+Numbers.sval)
var obj2 = new Numbers()
console.log("Class num: "+obj2.num_val)
//console.log("local num: "+local_sum) avremo un errore