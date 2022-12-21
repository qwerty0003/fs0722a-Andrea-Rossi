/*
interface -> è un modo di definire dei tipi personalizzati in TS
interface -> è una sorta di vincolo di contratto cioè stabilisce come un oggetto può interagire con un altro oggetto
interface -> definisce i membri che una classe deve avere così che gli oggetti che devono interagire sanno che propietà/metodi chiave
*/
interface IPersona{
    nome:string;
    cognome:string;
    visualizzaNomeCognomoe():string
}
//una classe  deve 'aderire al contratto' per usare l'0interfaccia, cioè avere nome, cognome e visualizzaNomeCognome() e questi propietà/metodi devono essere stringhe

//la classe persona dichiara di implementare l'interfaccia usando la keyword IMPLEMENTS
class Persona implements IPersona{
    nome: string;
    cognome:string;
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
    }
    visualizzaNomeCognomoe():string {
        return this.nome + ' ' + this.cognome
    }
}
//implemento propietà non prevista dall'interfaccia
enum Materie {Storia,Informatica,Matematica,HTML,CSS,Javascript}
/*class Studentello implements IPersona{
    nome: string;
    cognome:string;
    materie:Materie[];//propieta non prevista
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
        this.materie=[];
    }
    visualizzaNomeCognomoe():string {
        return this.nome + ' ' + this.cognome
    }

}
*/
//posso implementare più interfacce contemporaneamente
interface IStudio{
    materie:Materie[]
}
/*
class Studentello implements IPersona,IStudio{
    nome: string;
    cognome:string;
    materie:Materie[];
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
        this.materie=[];
    }
    visualizzaNomeCognomoe():string {
        return this.nome + ' ' + this.cognome
    }
}*/
//TS prevede l'estendibilità delle interfacce -> definiamo una nuova interfaccia ereditante le caratteristiche definite in un altra interfaccia
interface IStudente extends IPersona{
    materie:Materie[]
}
class Studentello implements IStudente{
    nome: string;
    cognome:string;
    materie:Materie[];
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
        this.materie=[];
    }
    visualizzaNomeCognomoe():string {
        return this.nome + ' ' + this.cognome
    }
}