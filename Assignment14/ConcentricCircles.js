let CCcanvas = document.querySelector(".ConcentricCircles")// indexs the document

let CCcontext= CCcanvas.getContext("2d")// lays out canvas

for(let i = 10; i > 0; i-- ){ //loops 10 times
CCcontext.beginPath();
CCcontext.arc(CCcanvas.width / 2, CCcanvas.height / 2, (200 / i), 0, 2*Math.PI);//puts the circles on top of eachother
CCcontext.stroke(); // outlines the circles
CCcontext.closePath();
}