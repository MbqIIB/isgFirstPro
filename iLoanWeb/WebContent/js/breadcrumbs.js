
$(document).ready(function() { 
	
});

function changeState(element){
	$($(".arrow-down-done")[0]).remove(); 
	$($(element +" .arrow-left-undone")[0]).remove(); 
	$($(element +" .arrow-right-undone")[0]).remove(); 
	$($(element +" .arrow-left-done")[0]).remove();
	$($(element +" .arrow-right-done")[0]).remove(); 
	if("#ccd" != element){
		$(element).prepend('<div class="arrow-left-done"></div>'); 
	}
	if("#dass" != element){
		$(element).append('<div class="arrow-right-done"></div>'); 
	}
	$(element).append('<div class="arrow-down-done"></div>');
	$(element +" span").removeClass("undone"); 
	$(element +" span").addClass("done"); 
}