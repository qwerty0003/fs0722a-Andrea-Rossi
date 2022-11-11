/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/
let sum = 10 + 20 // avvio la var sum e le do il valore di 10 + 20
console.log(sum) //controllo

/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/
let random = Math.ceil(Math.random() * 20) // creo la var random e le do il valore random
//uso math ceil per approssimare e math random *20 per avere un numero random da 0 a 20
console.log(random)
/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/
var me = {
  name: 'Andrea',
  surname: 'Rossi',
  age: 26
} //creo l'oggetto richiesto
console.log(me)
/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/
const removeAge = () => delete me.age
removeAge() //una funzione freccia per cancellare la propietà richiesta che poi avvio
console.log(me)
/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/
//uso define property per creare nell'oggetto me una prop skills 
Object.defineProperty(me, 'skills', {
  value: ['Javascript'] //qui do a skills il valore
})
console.log(me)
/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/
//do un nome all'array che mi serve e poi gli do un nuovo elemento
const addNewSkill = () => {
  let arr = me.skills
  arr.push('Comin up Typescript')
}
addNewSkill()
console.log(me)

/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/
/*const cancLast = () => {
  let arr = me.skills
  arr.pop()
}*/ //ho provato entrambi i modi ma quello che ho lasciato mi sembra più pulito
me.skills.pop()
console.log(me)
console.log('============')

/******************************************************************** */
const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]



// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/
const dice = () => Math.ceil(Math.random() * 6) // come esercizio B
console.log(dice())
console.log(dice())
console.log('============')
/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/
//un semplice if else che controlla il maggiore e lo restituisce
const whoIsBigger = (n, m) => {
  if (n < m) {
    return m
  } else {
    return n
  }
}
console.log(whoIsBigger(3, 6))
console.log(whoIsBigger(6, 3))
console.log('============')

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/
const splitMe = (string) => string.split(' ') //uso split con uno spazio così dividerà dove trova uno spazio
console.log(splitMe('ciao come stai?'))
console.log('============')

/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/
const deleteOne = function (str, bool) {
  if (bool = true) {
    string1 = str.slice(1)
    return string1
  } else {
    string2 = str.slice(3)
    return string2
  }
}
console.log(deleteOne('prova', false))
console.log(deleteOne('prova', true))
console.log('============')


/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/
const onlyLetters = (str) => {
  newStr = str.replace(/[0-9]/g, '')
  return console.log(newStr)
}
onlyLetters('pro0va')
console.log('============')

/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/
//una funzione per vedere se un indirizzo email è valido, una breve regex e torna un valore booleano riferito al test
function isThisAnEmail(email) {
  var re = /\S+@\S+\.\S+/;
  return re.test(email);
}

console.log(isThisAnEmail('prova@gamil.com'));

console.log(isThisAnEmail('holaa89.it'));
console.log('============')

/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/
const whatDayIsIt = function () {
  let now = new Date()
  let today = now.getDay()//l'indice del giorno della settimana selezionata, partendo da 0 = domenica
  switch (today) { //voglio il nome del giorno e quindi li nomino uno per uno
    case 0:
      console.log('Domenica')
      break
    case 1:
      console.log('Lunedì')
      break
    case 2:
      console.log('Martedì')
      break
    case 3:
      console.log('Mercoledì')
      break
    case 4:
      console.log('Giovedì')
      break
    case 5:
      console.log('Venerdì')
      break
    case 6:
      console.log('Sabato')
      break
  }
}
whatDayIsIt()
console.log('============')


/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/

/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/
function howManyDays(first, second) {        //funzione per calcolare la differenza tra i giorni con funzione per trasformarli da ms in giorni
  return console.log(Math.round((second - first) / (1000 * 60 * 60 * 24)))
}
function dateF(str) { //funzione per trasformare le date in numeri calcolabili
  var mod = str.split('/');
  return new Date(mod[2], mod[0] - 1, mod[1]);
}
howManyDays(dateF('23/12/2012'), dateF('16/11/2015'))


/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/
const isTodayMyBirthday = (date) => {
  let data = new Date();
  let giorno = data.getDate()
  let mese = data.getMonth()
  let oggi = `${giorno}/${mese + 1}`
  console.log(oggi)
  if (oggi === date) {
    return console.log(true)
  } else {
    return console.log(false)
  }
}
//ho creato una new date in cui ho inserito il giorno ed il mese+1(perchè i mesi partono da 0) e ho messo un console log di oggi
isTodayMyBirthday('10/11')
isTodayMyBirthday('16/11')

console.log('================')
// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/




/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/

/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/
const countMovies = (obj) => {
  let lenght = obj.length
  return console.log(lenght)
} //misuro la lunghezza dell'oggetto, la funzione va avviata alla fine dopo aver creato movies

/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/
const onlyTheYears = () => {
  let newArr = movies.map(({ Year }) => ({ Year }))
  return console.table(newArr)
}// ho usato map per creare un nuovo array con solo gli anni

/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/
const onlyInLastMillennium = () => { //creo un ciclo che controlla tutti gli anni e se sono precedenti al 2000 allora verranno stampati in console
  for (var i = 0; i < movies.length; i++) {
    if (movies[i].Year <= "2000") {
      let anno = movies[i].Title + ' ' + movies[i].Year
      console.log(anno)
    }
  }
}
onlyInLastMillennium()

/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/



/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/
const searchByTitle = (srt) => {
  for (var i = 0; i < movies.length; i++) {
    for (Title in movies[i]) {
      if (movies[i][Title].indexOf(srt) != -1) {
        results.push(movies.Title[i]);
      }
    }
  }
}


/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/

/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/

// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/
//uso queryselector per selezionare un elemento con id container
const eserc20 = function () {
  document.querySelector('#container')
}
/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/
//uso queryselector all per selezionare tutti i td
const eserc21 = () => {
  document.querySelectorAll('td')
}
/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/
//seleziono tutti i td, poi creo un ciclo che stampa il testo dei td per ognuno
const eserc22 = () => {
  let stamp = document.querySelectorAll('td')
  for (let i = 0; i < stamp.length; i++) {
    let stampa = stamp[i].textContent //prendo il testo
    return console.log(stampa)  //lo stampo
  }
}

/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/
//faccio più omeno come l'esercizio 22
const eserc23 = () => {
  let redA = document.querySelectorAll('a')
  for (let i = 0; i < redA.length; i++) {
    redA[i].style.backgroundColor = 'red' //qui scelgo il colore
  }
}

/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/

const eserc24 = () => {
  let list = document.querySelector('#myList') //prendo l'elemento con id myList 
  let newEl = document.createElement('li') //creo elemento li
  list.appendChild(newEl) //lo metto come figlio nella lista
}
/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/
const eserc25 = () => {
  let list = document.querySelector('#myList') //seleziono l'elemento
  list.innerHTML = '' //lo svuoto completamente di ogni stringa o tag
}

/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/
const eserc26 = () => {
  let newClass = document.querySelectorAll('tr') //seleziono l'elemento
  for (let i = 0; i < newClass.length; i++) { //ciclo per aggiungere a tutti
    newClass[i].className = 'test' //aggiungo la classe
  }
}

// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/
//purtroppo ho fatto con document write
const halfTree = (n) => {
  let alb = document.createElement('div')
  for (var i = 0; i < n; i++) {
    for (var j = 0; j <= i; j++) {
      document.write("*");
    }
    document.write("<br>");
  }
}
//halfTree(8)

/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/
const tree = (n) => {
  var txt = "";
  for (i = 1; i <= n; i++) {
    txt = "";
    for (j = i; j < n; j++) {
      txt += " ";
    }
    for (k = 0; k < (i * 2) - 1; k++) {
      txt += "*";
    }
    console.log(txt);
  }
}
tree(5)

/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/



