let CircleDrawCanvas = document.querySelector(".CircleDraw")

let CircleDrawContext = CircleDrawCanvas.getContext("2d")

CircleDrawContext.beginPath();
CircleDrawContext.arc(200, 200, 30, 0, 2*Math.PI);
CircleDrawContext.fillStyle = "blue";
CircleDrawContext.fill();
CircleDrawContext.stroke();