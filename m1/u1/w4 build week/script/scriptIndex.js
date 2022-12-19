//mi collego al contenitore
var ref=document.querySelector("#ref");
//mi collego alla checkbox
var check=document.querySelector("#check");
//mi collego al bottone
var button=document.querySelector("a");
//creo un paragrafo
var p=document.createElement("p");
//aggiungo un addEventListner al bottone per verificare se la checkbox è stata confermata
button.addEventListener("click",()=>{
    if(check.checked)
    button.href="questions.html ";
    else
    {
        button.href="javascript: void(0)";
        p.innerText="Accept condition to start test"
        ref.appendChild(p);
        p.className="testi";
    }
    
})
//setto la difficolta scelta in memoria d'ambiente
let difficult=document.querySelector("#difficult")

//setto in memoria d'ambiente il valore della difficoltà scelta al momento del click sul button
button.addEventListener("click",function(){
    let va=difficult.options[difficult.selectedIndex].value;
    localStorage.setItem("difficult",va);   
})

