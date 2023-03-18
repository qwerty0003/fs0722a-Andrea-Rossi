//alert("ciao");

const regexMail = /^((?!\.)[\w-_.]*[^.])(@\w+)(\.\w+(\.\w+)?[^.\W])$/gm;
const regexPass = /^(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\w\d\s:])([^\s]){8,16}$/gm;

document.addEventListener("DOMContentLoaded", ()=>{
    let btnSignup = document.querySelector("#signup");
    if(btnSignup !== null)
      btnSignup.addEventListener("click", registrazione)

    let btnSignin = document.querySelector("#login");
    if(btnSignin !== null)
      btnSignin.addEventListener("click", signin)
})

let signin = (e) => {
  e.preventDefault();
 
  let username = document.querySelector("#username").value;
  let password = document.querySelector("#password").value;

  if(username.trim().length> 5 && validatePassword(password)) {
    let obj = {
      username: username,
      password: password
    }
    login(obj);
  }
}

// LASTONE
// Ciaociao666$$

function login(obj) {
  fetch('http://localhost:8080/api/auth/login', {
    method: 'POST',
    body: JSON.stringify( obj ),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then(response => response.json())
    .then(json => console.log(json))
}

let registrazione = (e)=>{
  e.preventDefault();

  let name = document.querySelector("#name").value;
  let username = document.querySelector("#username").value;
  let email = document.querySelector("#email").value;
  let password = document.querySelector("#password").value;

  if(username.trim().length> 5 && validateEmail(email) && validatePassword(password)) {
    let obj = {
      name: name,
      username: username,
      email: email,
      password: password,
      roles:["ROLE_USER"]
    }
    console.log(obj);
    register(obj);
  } else {
    alert("Dati non validi!!!");
  }
}

function register(obj) {
  fetch('http://localhost:8080/api/auth/register', {
    method: 'POST',
    body: JSON.stringify( obj ),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then((response) => console.log(response))
}

function validateEmail(email) {
 if (regexMail.test(email)) return (true)

  alert("You have entered an invalid email address!")
  return (false)
}

function validatePassword(password) {
  if (regexPass.test(password)) return (true)
 
   alert("You have entered an invalid password!")
   return (false)
 }


