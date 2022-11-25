
window.addEventListener("scroll", function (event) {

    var top = this.scrollY;

    let navbar = this.document.querySelector("header");

    let button = this.document.querySelector("#start");

    if (top > 295) {
        navbar.style.backgroundColor = "#fff"

        button.style.backgroundColor = "#1a8917"
    }
    else {
        navbar.style.backgroundColor = "#ffc017"

        button.style.backgroundColor = "#191919"
    }
});