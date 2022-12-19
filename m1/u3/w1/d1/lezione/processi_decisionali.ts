/*var n:number = 5
while(n > 5){
    console.log("Entered while")
}do{
    console.log("Entered do while")
}
while(n>5)

var i:number = 1
while(i<=10){
    if(i % 5 == 0){
        console.log("il primo multiplo di 5 tra 1 e 10 è: " +i)
        break
    }
    i++
}*/

var num:number = 0
var count:number=0

for(num=0;num<=20;num++){
    if(num % 2 == 0){
        continue
    }
    count++
}console.log("il conto dei numeri dispari tra 0 e 20 è: "+count)
