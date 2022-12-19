function aggiungiCifra(elemento){
            
    let cifraCliccata = elemento.getAttribute('data-simbolo')
    document.getElementById('numeri').value += cifraCliccata
    
}

function tot(){
    let numeri = document.getElementById('numeri')
    numeri.value = eval(numeri.value)
}

function back() {
    var input = document.getElementById("numeri");
    input.value = input.value.substring(0, input.value.length - 1);
  }
function allback() {
    var input = document.getElementById("numeri");
    input.value = '';
  } 
  
  
function sin(){
    let numeri = document.getElementById('numeri')
    numeri.value=Math.sin(numeri.value);
}

function cos(){
	let numeri = document.getElementById('numeri')
    numeri.value=Math.cos(numeri.value);
}

function tan(){
	let numeri = document.getElementById('numeri')
    numeri.value=Math.tan(numeri.value);
}
function square(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.pow(numeri.value, 2);
}
    
function cubed(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.pow(numeri.value, 3);
}
function exp(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.exp(numeri.value);
}
    
function sqrt2(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.pow(numeri.value, 1/2);
}

function sqrt3(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.pow(numeri.value, 1/3);
}
function log(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.log2(numeri.value);
}
function ln(){
    let numeri = document.getElementById('numeri')
    numeri.value = Math.log(numeri.value);
}

const targetDiv = document.getElementById("calcolatrice");
function hideIt() {
  if (targetDiv.style.display !== "none") {
    targetDiv.style.display = "none";
  } else {
    targetDiv.style.display = "block";
  }
};




    







/*function isSymbol(s){
    let simboli = ['x','/','+','-']
    return simboli.includes(s)
}
isSymbol('+')*/