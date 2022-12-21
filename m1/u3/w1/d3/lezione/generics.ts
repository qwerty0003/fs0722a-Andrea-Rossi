//i generics sono un modo per indicare a funzioni/classi7interfacce etc che tipo di dato si vuole usare al momento della chiamata
//funziona un po' come il  passaggio di argomenti ad una funzione ma indica anche il tipo che deve aspettarsi alla chiamata
/*
quando li usiamo? 
    -quando abbiamo una gamma di dati diversi
    -quando usiamo quel tipo di dati in diversi punti
vantaggi?
    -possibilità di riutilizzare il codice
    -ridurre la necessità di usare il tipo any
*/ 
/*
function getArray(items:any[]):any{
    return new Array().concat(items);
}
//la funzione getArray restituisce un array di elementi di tipo any
let numberArray = getArray([5, 10, 15, 20])
let stringArray = getArray(['ctas','dogs','bears'])
numberArray.push(25)//ok
stringArray.push('wolves')//ok
numberArray.push('stringa a caso')//me lo stampa lo stesso perchè nella funzione ho any
//posso stabilire il tipo di valore che l'array contiene e far verificare a TS le condizioni*/
//riscrivo usando i generics
function getArray<T>(items:T[]):T[]{
    return new Array<T>().concat(items)
}
//i generics definiscono una o più varianbili di tipo -> identificano i tipi che vengono passati racchiusi tra < >
//T è un nome generico comunemente usato, ma è possibile chiamarlo come si vuole
//viene passato all aprima dichiarazione e poi viene usato per popolare nell ealtre dichiarazioni
//nella funzione getarray uso T per specificare il tipo di parametrei, il tipo restituito dalla funzione ed il tipo di dato da restituire
//per richiamare la funzionè necessario passrae il <type>
let numberArray = getArray<number>([5, 10, 15, 20])
let stringArray = getArray<string>(['ctas','dogs','bears'])
numberArray.push(25)//ok
stringArray.push('wolves')//ok
//numberArray.push('stringa a caso') avrò un errore adesso
//se si omette la variabile di tipo quando si chiama la funzione sarà TS a dedurlo
