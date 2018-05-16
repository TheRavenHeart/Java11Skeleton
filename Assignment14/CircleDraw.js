let CircleDrawCanvas = document.querySelector(".CircleDraw") // indexs the document

let CircleDrawContext = CircleDrawCanvas.getContext("2d")// lays out canvas

CircleDrawContext.beginPath();// begins path
CircleDrawContext.arc(200, 200, 30, 0, 2*Math.PI); // makes the circle
CircleDrawContext.fillStyle = "blue";//choses color
CircleDrawContext.fill();// fills circle
CircleDrawContext.stroke();
CircleDrawCanvas.endPath();