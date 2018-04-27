let CCcanvas = document.querySelector(".ConcentricCircles")

let CCcontext= CCcanvas.getContext("2d")

for(let i = 10; i > 0; i-- ){
CCcontext.beginPath();
CCcontext.arc(CCcanvas.width / 2, CCcanvas.height / 2, (200 / i), 0, 2*Math.PI);
CCcontext.stroke();
CCcontext.closePath();
}