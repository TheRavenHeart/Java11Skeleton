let RCcanvas = document.querySelector(".RandomCircles")
let RCcontext = RCcanvas.getContext("2d")

for(let i = 10; i > 0; i-- ){
    RCcontext.beginPath();
    let X = Math.floor((Math.random() *360) + 20);
    let Y = Math.floor((Math.random() * 360) + 20);
    RCcontext.arc(X, Y, 20, 20, 0, 2*Math.PI);
    RCcontext.stroke();
    RCcontext.closePath();

    let randomColor = 'hsl(' + 360 * Math.random() + ', 50%, 50%)';
    RCcontext.fillStyle = randomColor;
    RCcontext.fill();
}