//definizione
function function_name() {
    //function body
    console.log('function called');
}
function test() {
    console.log('function called');
}
test(); //invocazione
//restituzione di una funzione
function greet() {
    return 'Hello world :)';
}
function caller() {
    var msg = greet();
    console.log(msg);
}
caller();
//funzioni con parametri opzionali
function disp_details(id, name, mail_id) {
    console.log('ID: ' + id);
    console.log('Name: ' + name);
    if (mail_id != undefined) {
        console.log('Email ID: ' + mail_id);
    }
}
disp_details(123, 'Ndrea');
//parametri rest ... devono essere tutti dello stesso tipo in TS
function addNumbers() {
    var nums = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        nums[_i] = arguments[_i];
    }
    var i;
    var sum = 0;
    for (i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
    console.log('La somma dei numeri è: ', sum);
}
addNumbers(2, 3, 5);
addNumbers(10, 10, 10, 10, 10);
