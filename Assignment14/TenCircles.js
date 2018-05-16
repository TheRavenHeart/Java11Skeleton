let TenCirclesCanvas = document.querySelector(".TenCircles") // indexs the document

let CTX = TenCirclesCanvas.getContext("2d") // lays out canvas

for (let i = 0; i < 10; i++){
    CTX.beginPath();
    CTX.fillStyle = "brown" // sets fill color
    CTX.arc(TenCirclesCanvas.width / 2, (i * 40) + 20, 20, 0, 2*Math.PI);// sets the circles on top of eachother
    CTX.fill(); // fills in the circle
    CTX.closePath();
}