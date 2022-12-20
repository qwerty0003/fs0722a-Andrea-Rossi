//definizione
function function_name(){
    //function body
    console.log('function called')
}
function test(){
    console.log('function called')
}
test() //invocazione

//restituzione di una funzione
function greet():string {
    return 'Hello world :)'
}

function caller(){
    var msg = greet()
    console.log(msg)
}
caller()

//funzioni con parametri opzionali
function disp_details(id:number,name:string,mail_id?:string){
    console.log('ID: '+id)
    console.log('Name: '+name)

    if(mail_id!=undefined){
        console.log('Email ID: '+mail_id)
    }
}
disp_details(123,'Ndrea')

//parametri rest ... devono essere tutti dello stesso tipo in TS

function addNumbers(...nums:number[]){
    var i
    var sum:number=0

    for(i=0;i<nums.length;i++){
        sum= sum+ nums[i]
    }
    console.log('La somma dei numeri è: ',sum)
}
addNumbers(2,3,5)
addNumbers(10,10,10,10,10)


//parametri definiti
function calculate_discount(price:number,rate:number = 0.50){
    var discount = price*rate
    console.log('Discount Amount ',discount)
}
calculate_discount(1000)
calculate_discount(1000,0.30)

//anche TS supporta il costruttore function