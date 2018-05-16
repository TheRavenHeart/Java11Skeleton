let SnowmanCanvas = document.querySelector(".Snowman") // indexs the document

let context = SnowmanCanvas.getContext("2d") // lays out canvas

context.beginPath();
context.fillStyle = "black"; // sets color
context.fillRect(0, SnowmanCanvas.height/2, SnowmanCanvas.width, 5)// fills in a line in the middle of the canvas
context.closePath();

context.beginPath();
context.arc(200, 135, 15, 0, 2*Math.PI);// sets the top circle
context.fillStyle = "grey";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(200, 175, 30, 0, 2*Math.PI); // sets the midle circle
context.fillStyle = "grey";
context.fill();
context.stroke();
context.closePath();


context.beginPath();
context.arc(200, 260, 60, 0, 2*Math.PI); // sets the lowest circle
context.fillStyle = "grey";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(200, 260, 15, 0, 2*Math.PI); // puts the  lowest button
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(200, 175, 5, 0, 2*Math.PI); // puts the second button
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(195, 135, 3, 0, 2*Math.PI); // puts in the 1st eye
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();

context.beginPath();
context.arc(205, 135, 3, 0, 2*Math.PI); // puts in the 2nd eye
context.fillStyle = "red";
context.fill();
context.stroke();
context.closePath();