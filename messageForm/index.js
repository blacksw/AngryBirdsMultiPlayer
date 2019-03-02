
var rect = 0; 
function readInput(){
	var input = document.getElementById('messageArea');
	var message = document.createElement("p");

	document.body.children[1].appendChild(message);
	
	message.setAttribute("class","message");
	message.innerHTML = input.value;

	message.style.top = rect+"px";
	var p = $(".message");
	var position = p.position();
	rect += position.top+35;
	console.log(position.top);
}