function showErrorPage(){
	$($('.err-div')[0]).hide().slideDown(1000);
}

function hideErrorPage(){
	$($('.err-div')[0]).show().slideUp(1000);
}

function smoothSlideDown(id){
	console.log(id);
	$($(id)[0]).hide().slideDown(1000);
}

function smoothSlideUp(id){
	$($(id)[0]).show().slideUp(1000);
}