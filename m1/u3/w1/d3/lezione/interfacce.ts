/*
Il type system è di tipo strutturale(structural type system)

Il compiler quando fa il controllo/comparazione dei tipi di dato si basa sulla struttura/forma
*/
/*
function inviaMessaggio(msg:{email:string,messaggio:string}){//parametro che indica che viene accettato un oggetto che ha almeno le propietà email e messaggio
    mailSender.sendTo(msg.email,msg.messaggio)
//al netto che non creo un oggetto mailSender
    var mioMessaggio = {email:'email@email.org',messaggio:'Buongiorno'}
    inviaMessaggio(mioMessaggio)//questa chiamata è corretta perchè ci sono i parametri attesi
    var mioMessaggioo = {messaggio:'Buongiorno'}
    inviaMessaggio(mioMessaggioo)//questa chiamamta genera errore perchè l'oggetto non contiene la propietà email

    //una volta che dichiariamo la struttura per la funzione TS verifica che effettivamente venga passato un oggetto con quella struttura
    //TS consente di definire un interfaccia che definisce la struttura del nostro parametro 

}*/

interface Messaggio{
    email:string
    messaggio:string
}
//interface consente di definire il tipo di dato (Messaggio), TS quando compila verifica la struttura
//in questo modo potremo utilizzare Messaggio come se fosse un tipo di dato predefinito(per riusarlo nella nostra app)
function inviaMessaggio(msg:Messaggio){
    mailSender.sendTo(msg.email,msg.messaggio)
}
//la struttura dichiarata dall'interfaccia rappresenta gli elementi minimi che un oggetto deve avere
var mioMessaggio = {
    email:'mario.red@epic.ode',
    messaggio:'Coma va?',
    data:new Date()
}//la propietà data non pregiudica la compatibilità dell'oggetto col tipo previsto
inviaMessaggio(mioMessaggio)
//passiamo definire dentro Interface una struttura con elementi opzionali
interface Messaggio {
    email:string;
    nomeDestinatario?:string;//opzionale
    oggetto?:string;//opzionale
    messaggio:string;
    data?:string;//opzionale

}
//le interfacce non descrivono solo oggetti ma anche elementi del linguaggio
//ad esempio definisco una funzione numerica che opera su valori numerici
interface FunzioneSuNumeri{
    (x:number, y:number):number//prendo due valori numeri come parametro e restituisco un numero
}
//faccio una funz del tipo dichiarato
var somma:FunzioneSuNumeri
//dichiarare il tipo non ci obbliga ad usare gli stessi parametri ma solo loo stesso tipo di dato
somma = function(a:number,b:number){
    return a + b
}
//possiamo anche dichiarare delle interfacce che descrivono degli array
interface ArrayDiStringhe{
    [index:number]:string
    //definisco tipo di indice(number) e poi il tipo di ciascun elemento(string)
}
var x:ArrayDiStringhe=['uno','due','tre']
//per l'indice dell'array oltre al tipo number è previsto anche il tipo string
interface Dizionario{
    [index:string]:string
}
var w :Dizionario;
w['chiave1']='val1'
w['chiave2']='val2'
//per l'indice i tipi di dati sono solo number e string, per gli elementi dell'array possiamo usare un tipo qualsiasi
//array di oggetti
interface ArrayDiOggetti{
    [index:number]:{id:number,label:string}
}
var z:ArrayDiOggetti=[
    {id:1,label:'aa'},
    {id:2,label:'bb'}
]