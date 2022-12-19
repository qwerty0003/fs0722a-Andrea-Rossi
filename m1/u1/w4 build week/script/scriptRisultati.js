
//prendo la lunghezza dell array questions da memoria d'ambiente
let lunghezza=localStorage.getItem("length");
//prendo il numero di risposte giuste da memoria d'ambiente
let giuste=localStorage.getItem("risposteG");
//calcolo le sbagliate facendo lunghezza-giuste
let sbagliate=lunghezza-giuste;
//calcolo le percentuali di risposte giiste e sbagliate
let percSbagliate=((sbagliate/lunghezza)*100).toFixed(2)
let percGiuste=((giuste/lunghezza)*100).toFixed(2)
//Prendo i due div dal dom con classe result che conterranno le percentuali di risposte giuste e sbagliate e li metto in un array
let correct=document.querySelectorAll(".result")


//creo un paragrafo
let count=document.createElement("p");
//inserisco nel p appena creato il rapporto di risposte giuste
count.innerText=giuste+"/"+lunghezza+ " Questions right";
count.style.textAlign="left";
count.className="testi";
//scrivo nel paragrafo le percentuali di risposte giuste
let percent=document.createElement("p");
percent.innerText=percGiuste+"%";
percent.style.margin=0
percent.style.textAlign="left";
//aggiungo al primo div result questi due valori
correct[0].appendChild(percent);
correct[0].appendChild(count);



//faccio lo stesso per le risposte sbagliate
let countW=document.createElement("p");
countW.innerText=sbagliate+"/"+lunghezza+ " Questions wrong";
countW.style.textAlign="right";
countW.className="testi";
let percentW=document.createElement("p");
percentW.innerText=percSbagliate+"%";
percentW.style.margin=0;
percentW.style.textAlign="right";
correct[1].appendChild(percentW)
correct[1].appendChild(countW);

//setto dinamicamente il colore del testo in base al risultato del test
let color;
let congratulazioni;
if(percGiuste>=60)
{
    
    color="#00FFFF"
    congratulazioni="You passed test, we'll send you the certificate";
}
else{
    
    color="#D20094"
    congratulazioni="Test don't passed"
}



window.onload = function () {

//chart ciambella
var chart = new CanvasJS.Chart("chartContainer", {
    backgroundColor:"transparent",
	animationEnabled: true,
    //testo in mezzo al grafico
    title:{text: congratulazioni,verticalAlign:"center",
        dockInsidePlotArea:true,fontSize:20,fontColor:color,maxWidth:150,padding:4},
    
    
	
	data: [{
        indexLabelFontColor:"white",
        //tipo di chart
		type: "doughnut",
		startAngle: 60,
		//innerRadius: 60,
		
		
		//percentusle sul grafico
		dataPoints: [
			{ y: percGiuste, color:"#00ffff" },
			{ y: percSbagliate,color:"#D20094"},
			
		]
	}]
});
chart.render();

}


	//href bottone
	let button=document.querySelector("button");
	button.addEventListener("click", function(){
		window.location.href="rate.html"
	})
