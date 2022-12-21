//tuple -> nuovo tipo di dato introdotto in TS
//ci serve a definire un array che ha elementi di tipi diversi tra loro
//fissare il tipo di un numero di elementi -> array avrà uno schema preciso dei tipi di dati
//array in cui voglio memorizzare nome ed età di una persona ->primo sarà stringa ed il secondo numero
var persona:[string, number]=['Mario rossi', 25]
//tuple non hanno una dimensione fissa -> posso aggiungere senza definire i tipi
// è possibile aggiungere nuovi elementi purchè siano dello stesso tipo di dati dichiarato
persona[2] = 'Roma'
persona[3] = 1990
