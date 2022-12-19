// 'https://www.w3schools.blog/math-object-typescript'
//funzione numero casuale
var randomNumber = function () {
    return Math.floor(Math.random() * (100 - 1) + 1);
};
//inizializzo le variabili
var player1;
var player2;
//funzione di confronto
function confrontaNumeri() {
    var random = randomNumber();
    console.log(random); //inizializzo e mostro un numero random
    if (random === player1) {
        return console.log('Player1 wins!'); //se il numero 1 è uguale al numero random allora log vittoria player1
    }
    if (random === player2) {
        return console.log('Player2 wins!'); //se il numero 2 è uguale al numero random allora log vittoria player2
    }
    else {
        var sum1 = random - player1;
        var sum2 = random - player2; //calcolo le differenze e confronto il valore assoluto con log di conseguenza
        if (Math.abs(sum1) > Math.abs(sum2)) {
            return console.log('Player 2 choosed closest number');
        }
        else {
            return console.log('Player 1 choosed closest number');
        }
    }
    ;
}
//gioco qui!
player1 = 69; //player1 scegli un numero
player2 = 90; // player2 scegli un numero
confrontaNumeri(); //parte il gioco
