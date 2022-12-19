async function loadJSON(url) {
    const res = await fetch(url);
    return await res.json();
}

loadJSON('./json/users.JSON').then(data => {
    let k = 0

    let array = document.querySelectorAll('.card-body')
    let immagine = document.querySelectorAll('.imgs')
    

    for (let dato of data) {
        let name = dato.firstName + ' ' + dato.lastName
        let nome = document.createElement('p')
        nome.innerText = name
        array[k].appendChild(nome)
        
        let mail = dato.email
        let pMail = document.createElement('p')
        pMail.innerText = mail
        pMail.style.color='#fffd00';
        pMail.style.fontSize='1.3rem'
        array[k].appendChild(pMail)

        immagine[k].setAttribute('src',dato.profileURL)

        
        k++
    }

});

