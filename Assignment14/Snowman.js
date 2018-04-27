let SnowmanCanvas = document.querySelector(".Snowman")

let context = SnowmanCanvas.getContext("2d")

context.beginPath();
context.fillStyle = "black";
context.fillRect(0, SnowmanCanvas.height/2, SnowmanCanvas.width, 5)
context.closePath();

context.beginPath();
context.arc(200, 135, 15, 0, 2*Math.PI);
context.fillStyle = "grey";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(200, 175, 30, 0, 2*Math.PI);
context.fillStyle = "grey";
context.fill();
context.stroke();
context.closePath();


context.beginPath();
context.arc(200, 260, 60, 0, 2*Math.PI);
context.fillStyle = "grey";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(200, 260, 15, 0, 2*Math.PI);
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(200, 175, 5, 0, 2*Math.PI);
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(195, 135, 3, 0, 2*Math.PI);
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(205, 135, 3, 0, 2*Math.PI);
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();