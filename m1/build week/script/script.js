let i=1;
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
    
    if(count==15){
      count=20;
      deleteQuestion();
      nextQuestion(questions);
      counterQuest(questions,i);
      nextAnswer(questions);
      i++;
      update(count);
    };
  }, 1000);







function nextQuestion(domanda){
  
  let contain=document.querySelector("#question");
  let head=document.createElement("h1");
  head.style.marginBottom="5rem";
  head.innerText=domanda[0].question;
  contain.appendChild(head);
}

function counterQuest(arr,i){
    let foot=document.querySelector('#foot');
    foot.className='testi';
    foot.innerText= 'Questions ' + [i] + '/' + [arr.length];
}
    
function deleteQuestion(){
document.querySelector('#risposte').innerText='';
document.querySelector('#question').innerText='';
     
   }

   function nextAnswer(risposta){
    let contain=document.querySelector('#risposte')
    let correctAnswer = document.createElement('button')
    correctAnswer.innerText = risposta[0].correct_answer
  
    let incorrectAnswer0 = document.createElement('button')
    incorrectAnswer0.innerText = risposta[0].incorrect_answers[0]
  
    let incorrectAnswer1 = document.createElement('button')
    incorrectAnswer1.innerText = risposta[0].incorrect_answers[1]
  
    let incorrectAnswer2 = document.createElement('button')
    incorrectAnswer2.innerText = risposta[0].incorrect_answers[2]
  
    contain.appendChild(correctAnswer) 
    contain.appendChild(incorrectAnswer0) 
    contain.appendChild(incorrectAnswer1) 
    contain.appendChild(incorrectAnswer2) 
  }










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
      "In the programming language Java, which of these keywords would you put on a variable to make sure it doesn&#039;t get modified?",
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
    difficulty: "easy",
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
];