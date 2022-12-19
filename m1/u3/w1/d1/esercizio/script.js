//funzione numero casuale
var randomNumber = function () {
    return Math.floor(Math.random() * (100 - 1) + 1);
};
//inizializzo le variabili
var player1 = 0;
var player2 = 0;
//funzione di confronto
function confrontaNumeri() {
    var random = randomNumber();
    console.log('Random number: ' + random); //inizializzo e mostro un numero random
    if (random === player1) {
        console.log('Player1 wins! GG'); //se il numero 1 è uguale al numero random allora log vittoria player1
    }
    if (random === player2) {
        console.log('Player2 wins! WP'); //se il numero 2 è uguale al numero random allora log vittoria player2
    }
    else {
        var sum1 = random - player1;
        var sum2 = random - player2; //calcolo le differenze e confronto il valore assoluto con log di conseguenza
        if (Math.abs(sum1) > Math.abs(sum2)) {
            console.log('Player 2 choosed the closest number, but not enought.');
        }
        else if (Math.abs(sum1) < Math.abs(sum2)) {
            console.log('Player 1 choosed the closest number, but not enought.');
        }
        else {
            console.log('Player 1 and Player 2 choosed an equal distant number. Nice job guys! :D');
        }
    }
    ;
}
//gioca qui!
player1 = randomNumber(); //player1 scegli un numero
player1 = console.log('player1 number -> ' + player1); //numero del player1
player2 = randomNumber(); // player2 scegli un numero
player2 = console.log('player2 number -> ' + player2); //numero del player2
//parte il gioco(confronto)
confrontaNumeri();
