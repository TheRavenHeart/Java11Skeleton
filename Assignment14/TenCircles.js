let TenCirclesCanvas = document.querySelector(".TenCircles")

let CTX = TenCirclesCanvas.getContext("2d")

for (let i = 0; i < 10; i++){
    CTX.beginPath();
    CTX.fillStyle = "brown"
    CTX.arc(TenCirclesCanvas.width / 2, (i * 40) + 20, 20, 0, 2*Math.PI);
    CTX.fill();
    CTX.closePath();
}