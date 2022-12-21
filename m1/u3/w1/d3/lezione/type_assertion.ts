//type assertion imposta il tipo di valore e dice al compilatore di non inserirlo
//la usiamo quando abbiamo una comprensione migliore del tipo di dato rispetto a ciò che TS deduce da solo
let code: any = 123
let employeeCode = <number> code // sappiamo che il codice è un numero anche se è dichiarato any
//abbiamo asserito che in questo caso il codice è number
console.log(typeof(employeeCode))//number
/*
let employee = {}
employee.name = 'john' error
employee.code = 123    error
*/
interface Employee {
    name:string
    code:number
}
let employee = <Employee>{}
employee.name = 'John'
employee.code = 123