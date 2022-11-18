const questions = [
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question: "What does CPU stand for?",
    correct_answer: "Central Processing Unit",
    incorrect_answers: [
      "Central Process Unit",
      "Computer Personal Unit",
      "Central Processor Unit",
    ],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "In the programming language Java, which of these keywords would you put on a variable to make sure it doesn't get modified?",
    correct_answer: "Final",
    incorrect_answers: ["Static", "Private", "Public"],
  },
  {
    category: "Science: Computers",
    type: "boolean",
    difficulty: "easy",
    question: "The logo for Snapchat is a Bell.",
    correct_answer: "False",
    incorrect_answers: ["True"],
  },
  {
    category: "Science: Computers",
    type: "boolean",
    difficulty: "easy",
    question:
      "Pointers were not used in the original C programming language; they were added later on in C++.",
    correct_answer: "False",
    incorrect_answers: ["True"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "What is the most preferred image format used for logos in the Wikimedia database?",
    correct_answer: ".svg",
    incorrect_answers: [".png", ".jpeg", ".gif"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question: "In web design, what does CSS stand for?",
    correct_answer: "Cascading Style Sheet",
    incorrect_answers: [
      "Counter Strike: Source",
      "Corrective Style Sheet",
      "Computer Style Sheet",
    ],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "What is the code name for the mobile operating system Android 7.0?",
    correct_answer: "Nougat",
    incorrect_answers: [
      "Ice Cream Sandwich",
      "Jelly Bean",
      "Marshmallow",
    ],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "medium",
    question: "On Twitter, what is the character limit for a Tweet?",
    correct_answer: "140",
    incorrect_answers: ["120", "160", "100"],
  },
  {
    category: "Science: Computers",
    type: "boolean",
    difficulty: "easy",
    question: "Linux was first created as an alternative to Windows XP.",
    correct_answer: "False",
    incorrect_answers: ["True"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "Which programming language shares its name with an island in Indonesia?",
    correct_answer: "Java",
    incorrect_answers: ["Python", "C", "Jakarta"],
  },

{"category":"Science: Computers","type":"boolean","difficulty":"medium","question":"The common software-programming acronym I18N comes from the term Interlocalization.","correct_answer":"False","incorrect_answers":["True"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"Which internet company began life as an online bookstore called 'Cadabra'?","correct_answer":"Amazon","incorrect_answers":["eBay","Overstock","Shopify"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"Moore's law originally stated that the number of transistors on a microprocessor chip would double every...","correct_answer":"Year","incorrect_answers":["Four Years","Two Years","Eight Years"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"While Apple was formed in California, in which western state was Microsoft founded?","correct_answer":"New Mexico","incorrect_answers":["Washington","Colorado","Arizona"]},{"category":"Science: Computers","type":"boolean","difficulty":"medium","question":"MacOS is based on Linux.","correct_answer":"False","incorrect_answers":["True"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"In CSS, which of these values CANNOT be used with the position property?","correct_answer":"center","incorrect_answers":["static","absolute","relative"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"Which of the following is a personal computer made by the Japanese company Fujitsu?","correct_answer":"FM-7","incorrect_answers":["PC-9801","Xmillennium ","MSX"]},{"category":"Science: Computers","type":"boolean","difficulty":"medium","question":"It's not possible to format a write-protected DVD-R Hard Disk.","correct_answer":"True","incorrect_answers":["False"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"What was the first Android version specifically optimized for tablets?","correct_answer":"Honeycomb","incorrect_answers":["Eclair","Froyo","Marshmellow"]},{"category":"Science: Computers","type":"multiple","difficulty":"medium","question":"Unix Time is defined as the number of seconds that have elapsed since when?","correct_answer":"Midnight, January 1, 1970","incorrect_answers":["Midnight, July 4, 1976","Midnight on the creator of Unix's birthday","Midnight, July 4, 1980"]},

{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"The Harvard architecture for micro-controllers added which additional bus?","correct_answer":"Instruction","incorrect_answers":["Address","Data","Control"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"How many Hz does the video standard PAL support?","correct_answer":"50","incorrect_answers":["59","60","25"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"The internet domain .fm is the country-code top-level domain for which Pacific Ocean island nation?","correct_answer":"Micronesia","incorrect_answers":["Fiji","Tuvalu","Marshall Islands"]},{"category":"Science: Computers","type":"boolean","difficulty":"hard","question":"DHCP stands for Dynamic Host Configuration Port.","correct_answer":"False","incorrect_answers":["True"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"Which data structure does FILO apply to?","correct_answer":"Stack","incorrect_answers":["Queue","Heap","Tree"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"What does the International System of Quantities refer 1024 bytes as?","correct_answer":"Kibibyte","incorrect_answers":["Kylobyte","Kilobyte","Kelobyte"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"What was the first company to use the term Golden Master?","correct_answer":"Apple","incorrect_answers":["IBM","Microsoft","Google"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"Released in 2001, the first edition of Apple's Mac OS X operating system (version 10.0) was given what animal code name?","correct_answer":"Cheetah","incorrect_answers":["Puma","Tiger","Leopard"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"What is the codename of the eighth generation Intel Core micro-architecture launched in October 2017?","correct_answer":"Coffee Lake","incorrect_answers":["Sandy Bridge","Skylake","Broadwell"]},{"category":"Science: Computers","type":"multiple","difficulty":"hard","question":"Lenovo acquired IBM's personal computer division, including the ThinkPad line of laptops and tablets, in what year?","correct_answer":"2005","incorrect_answers":["1999","2002","2008"]}]










//prendo dalla memoria d'ambiente la stringa con la difficoltà scelta su index
let b=localStorage.getItem("difficult");


//Array
const filtred=questions.filter(domanda =>{
  return domanda.difficulty==b
});


//mescolo l'array di domande
mescola(filtred);



let giuste=0;//conta risposte giuste
let i=1;//Indice che permette di scorrere larray di domande e passare alla porssima

//Script timer
var totaltime = 20;
function update(percent){
  var deg;
  if(percent<(totaltime/2)){
    deg = 90 + (360*percent/totaltime);
      $('.pie').css('background-image',
                'linear-gradient('+deg+'deg, transparent 50%, white 50%),linear-gradient(90deg, white 50%, transparent 50%)'
               );
  } else if(percent>=(totaltime/2)){
          deg = -90 + (360*percent/totaltime);
          $('.pie').css('background-image',
                'linear-gradient('+deg+'deg, transparent 50%, #1fbba6 50%),linear-gradient(90deg, white 50%, transparent 50%)'
               );
          }
}

  var count = parseInt($('#time').text());
  myCounter = setInterval(function () {
    count-=1;
    $('#time').html(count);
      update(count);
    
    if(count==0){ //se il timer scade
      if(i==filtred.length) //se siamo all ultima domanda
      {
        salva(); //salvo in memoria in muero di risposte giuste
        window.location.href="risultati.html"//mi sposto alla pagina successiva
      }
      else{
      
      i++;//passo alla prossima domanda
      count=20;//resetto il timer a 20 secondi

      //Eliminazione domanda attuale e allocazione della successiva
      deleteQuestion();
      nextQuestion(filtred,i-1);
      counterQuest(filtred,i);
      nextAnswer(filtred,i-1);
      update(count);//Riparte il timer
      }
      
    };
  }, 1000);
//Fine script timer

//Istruzioni necessarie a visualizzare la prima domanda
nextQuestion(filtred,i-1);
nextAnswer(filtred,i-1);
counterQuest(filtred,i);


  //Prende tutti i bottoni che ci sono attualmente nella pagina e gli aggiunge un eventListner per passare all domanda successiva
  function listner()
  {
    
    let array=document.querySelectorAll("button")
    if(i!=filtred.length)
    {
      for(let bottone of array)
      {
        bottone.addEventListener("click",()=>{
          i++;
          count=20;
          deleteQuestion();
          nextQuestion(filtred,i-1);
          counterQuest(filtred,i);
          nextAnswer(filtred,i-1);
          update(count)
  
        })
      }
    }else//se è l'ultimo href alla pagina risultati
    {
      for(let bottone of array)
      {
        bottone.addEventListener("click",function(){
          salva();
          window.location.href="risultati.html"
        })
      }

    }
      
    }
    //quando arriviamo all ultima domanda salviamo in memoria d'ambiente la variabile che contiene il numero di risposte giuste
      //Reindirizzo l'utente alla pagina dei risultati
    
    
  



//Funzione che ci permette di inserire nell'html il titolo della domanda
function nextQuestion(domanda,i){
  
  let contain=document.querySelector("#question");
  let head=document.createElement("h1");
  head.style.marginBottom="5rem";
  head.innerText=domanda[i].question;
  contain.appendChild(head);
}

//Funzione che ci permette di aggiornare il contatore di domande in basso
function counterQuest(arr,i){
    let foot=document.querySelector('#foot');
    foot.className='testi';
    foot.innerText= 'Question ' +[i ] + '/' + [arr.length];
}
//Funzione che ci permette di eliminare la domanda attuale per poi crearne una nuova
function deleteQuestion(){
document.querySelector('#risposte').innerText='';
document.querySelector('#question').innerText='';
     
}


//Funzione che ci permette di aggiungere i bottoni con le risposte alla pagina html
   function nextAnswer(risposta,i){
    let contain=document.querySelector('#risposte')
    //Caso in cui le domande sono a risposta multipla
    if(risposta[i].type=="multiple")
    {
      
      let correctAnswer = document.createElement('button')
      correctAnswer.innerText = risposta[i].correct_answer
  
      let incorrectAnswer0 = document.createElement('button')
      incorrectAnswer0.innerText = risposta[i].incorrect_answers[0]
  
      let incorrectAnswer1 = document.createElement('button')
      incorrectAnswer1.innerText = risposta[i].incorrect_answers[1]
  
      let incorrectAnswer2 = document.createElement('button')
      incorrectAnswer2.innerText = risposta[i].incorrect_answers[2]
      
      let array=[correctAnswer,incorrectAnswer0,incorrectAnswer1,incorrectAnswer2];
      //mescolo l'array
      mescola(array);
      for(let domanda of array)
      contain.appendChild(domanda);

      
      //Aggiungo degli eventListner per tener traccia delle risposte giuste
     

      correctAnswer.addEventListener("click",function(){
        giuste++;
      })

      listner();
      
      //Caso in cui le domande sono Boolean
    }else{
      let  right=document.createElement('button')
      right.innerText = risposta[i].correct_answer
      let wrong=document.createElement('button')
      wrong.innerText = risposta[i].incorrect_answers
      contain.appendChild(right) 
      contain.appendChild(wrong)
      right.addEventListener("click",function(){
        giuste++
        
      })
      
      listner();

  }

}

function mescola(array) {
  //Ci prendiamo la lunghezza dell'array e partiamo dal fondo!
  var currentIndex = array.length, temporaryValue, randomIndex;
  // Finché ci sono elementi da mescolare, iteriamo l'array
  while (0 !== currentIndex) {
    //Prendiamo un indice a caso dell'array, purché sia compreso tra 0 e la lunghezza dell'array
    randomIndex = Math.floor(Math.random() * currentIndex);
    //Riduciamo di un'unità l'indice corrente
    currentIndex -= 1;
    // Una volta che abbiamo preso l'indice casuale, invertiamo l'elemento che stiamo analizzando alla posizione corrente (currentIndex) con quello alla posizione presa casualmente (randomIndex)
    //Variabile temporanea
    temporaryValue = array[currentIndex];
    //Eseguiamo lo scambio
    array[currentIndex] = array[randomIndex];
    array[randomIndex] = temporaryValue;
  }
  //Torniamo l'array mescolato a fine ciclo
  return array;
}


//Funzioned che ci permette di salvare la variabile contenente le risposte giuste nella memoria d'ambiente
function salva()
{
  localStorage.setItem("risposteG",giuste)
}

//Setto musica di sottofondo
var myMusic = document.querySelector("#music");
	myMusic.volume = 0.2;

  

  //setto quante domande ci sono nell array in memoria d'ambiente
  localStorage.setItem("length",filtred.length)