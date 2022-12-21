//uso più variabili di tipo
//funzione identity che accetta due parametri -> posso usare due generics T, U e assegno tipi diversi ad ogni parametro e ad ogni tipo che restituisce
function identity<T,U>(value:T,message:U):T{
    console.log(message)
    return value
}

let reurnNumb = identity<number, string>(100, 'Hello')
let reurnString = identity<string, string>('Ehi', 'Hello')
let reurnBool = identity<boolean, string>(true, 'or false?')