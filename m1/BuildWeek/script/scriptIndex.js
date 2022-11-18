
var ref=document.querySelector("#ref");
var check=document.querySelector("#check");
var button=document.querySelector("a");
var p=document.createElement("p");
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
let difficult=document.querySelector("#difficult")

button.addEventListener("click",function(){
    let va=difficult.options[difficult.selectedIndex].value;
    localStorage.setItem("difficult",va);   
})

