var petPreferito = 'gatto'; // cambio da pet_preferito a petPreferito e tolgo l'1
console.log(petPreferito);

var pet2 = 'panda';
var pet = 'cane';   // da Pet a pet
var petPreferito = 'criceto';
var petPreferito = 'coniglio'; // da PetPreferito a petPreferito

var $pet = 'giraffa'; //nome variabile è accettato se parte con $ o con _
console.log($pet);
var _pet = 'leone';
console.log(_pet);
var _pet2 = 'pantera, ';
document.write(_pet2); // numero alla fine va bene

var numero = 12;     // da var 12 = numero a var numero = 12
console.log(numero)

var petPrefe = prompt('Animale preferito?') 




switch(petPrefe) {
    case 'cane':
        location.href = 'https://www.alamy.it/fotos-immagini/foto-di-cani-carini.html?sortBy=relevant';
      break;
    case 'panda':
        location.href = 'https://www.youtube.com/watch?v=KcyS2ASW1gQ';
      break;
    default:
        document.write(petPrefe);
  }


