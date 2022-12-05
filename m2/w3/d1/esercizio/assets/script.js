document.getElementById("submit").onclick = function () {
    document.getElementById("table").style.display = "block";

    var table = document.getElementById("table");
    var row = table.insertRow(-1);
    var name = row.insertCell(0);
    var surname = row.insertCell(1);
    var ageY = row.insertCell(2);
    name.innerHTML = document.getElementById("name").value;
    surname.innerHTML = document.getElementById("surname").value;
    var date = document.getElementById("number").value;

    function getAge(birthDate) {
        var currentDate = new Date();
        var currentYear = currentDate.getFullYear();
        age = currentYear - birthDate;
        return age;
    }
    ageY.innerHTML = getAge(date)
  


    return false;
}




