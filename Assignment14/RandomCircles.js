let RCcanvas = document.querySelector(".RandomCircles") // indexs the document
let RCcontext = RCcanvas.getContext("2d")// lays out canvas

for(let i = 10; i > 0; i-- ){ // loops 10 times
    RCcontext.beginPath();
    let X = Math.floor((Math.random() *360) + 20); // randomizes x axis
    let Y = Math.floor((Math.random() * 360) + 20);// randomizes y axis
    RCcontext.arc(X, Y, 20, 20, 0, 2*Math.PI); // sets the circles
    RCcontext.stroke();
    RCcontext.closePath();

    let randomColor = 'hsl(' + 360 * Math.random() + ', 50%, 50%)'; // makes the random color
    RCcontext.fillStyle = randomColor; // sets it as a random color
    RCcontext.fill();
}