let RandomRadius = document.querySelector(".RandomRadius") // indexs the document
let RandRTC = RandomRadius = RandomRadius.getContext("2d")// lays out canvas

for(let i = 0; i < 10; i++){ // sets it to loop 10 times
    let X = Math.floor((Math.random() * 360) + 20) // makes it a random number
    let Y = Math.floor((Math.random() * 360) + 20)

    let rad = Math.floor((Math.random() *20) +5 )

    RandRTC.beginPath(); // starts the path
    RandRTC.arc(X, Y, rad, 0, 2*Math.PI) // sets what the radius of the circle

    let randomColor = 'hsl(' + 360 * Math.random() + ', 100%, 50%'; 
    RandRTC.fillStyle= randomColor; // sets the color
    RandRTC.fill(); // fills the circle
    RandRTC.closePath(); // ends the path
}
