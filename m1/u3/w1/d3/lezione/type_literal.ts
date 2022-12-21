//tipi letterali -> possiamo definire un set customizzato di valori possibili
//non solo string, number, boolean ma possiamo anche specificare che valori esatti le nostre stringhe, numeri,booleani possono avere
//riduzione -> elenco i casi potenziali di errore
type testResult = 'passato' | 'fallito' | 'incompleto'
let myResult:testResult
myResult='incompleto'//ok
myResult='passato'//ok
// myResult='fallimento' error
type dado = 1|2|3|4|5|6
let tirodado:dado
tirodado = 1 //ok
tirodado = 2 //ok
tirodado = 6 //ok
tirodado = 4 //ok
tirodado = 5 //ok
// tirodado= 5.5 error
// tirodado= 7 error

