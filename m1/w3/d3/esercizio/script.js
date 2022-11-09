// creo la funzione di add
function newElement() {
    var li = document.createElement("li");
    var inputValue = document.getElementById("inputItem").value;
    var t = document.createTextNode(inputValue);
    li.appendChild(t);
    if (inputValue === '') {
      alert("You must write something!");
    } else {
      document.getElementById("lista").appendChild(li);
    }
    document.getElementById("inputItem").value = "";
  
    var span = document.createElement("span");
    var testo = document.createTextNode("\u00D7");
    span.className = "close";
    span.appendChild(testo);
    li.appendChild(span);
  
    for (i = 0; i < close.length; i++) {
      close[i].onclick = function() {
        var div = this.parentElement;
        div.style.display = "none";
      }
    }
  }
// Creo un bottone cancella vicino ad ogni elemento della lista
var elementoLi = document.getElementsByTagName("li");
var i;
for (i = 0; i < elementoLi.length; i++) {
  var span = document.createElement("span");
  var testo = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(testo);
  elementoLi[i].appendChild(span);
}

// rendo reattivo il mio bottone cancella
var close = document.getElementsByClassName("close");
var i;
for (i = 0; i < close.length; i++) {
  close[i].onclick = function() {
    var div = this.parentElement;
    div.style.display = "none";
  }
}

// creo un simbolo check al click su un task
var list = document.querySelector('ul');
list.addEventListener('click', function(ev) {
  if (ev.target.tagName === 'LI') {
    ev.target.classList.toggle('checked');
  }
}, false);
