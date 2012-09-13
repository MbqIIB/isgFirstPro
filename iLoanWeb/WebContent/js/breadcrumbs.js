
$(document).ready(function() { 
	console.log("document ready");
});

function changeState(element){
	$($(".arrow-down-done")[0]).remove(); 
	$($(".arrow-down-incomplete")[0]).remove(); 
	$($(".arrow-down-undone")[0]).remove(); 
	$($(element +" .arrow-left-undone")[0]).remove(); 
	$($(element +" .arrow-right-undone")[0]).remove(); 
	$($(element +" .arrow-left-done")[0]).remove();
	$($(element +" .arrow-right-done")[0]).remove(); 
	$($(element +" .arrow-left-incomplete")[0]).remove();
	$($(element +" .arrow-right-incomplete")[0]).remove(); 
	if("#ccd" != element){
		$(element).prepend('<div class="arrow-left-done"></div>'); 
	}
	if("#dass" != element){
		$(element).append('<div class="arrow-right-done"></div>'); 
	}
	$(element).append('<div class="arrow-down-done"></div>');
	$(element +" span").removeClass("undone"); 
	$(element +" span").removeClass("incomplete"); 
	$(element +" span").addClass("done"); 
}

function unfinishedState(element){	
	$($(".arrow-down-done")[0]).remove(); 
	$($(".arrow-down-incomplete")[0]).remove(); 
	$($(".arrow-down-undone")[0]).remove(); 
	$($(element +" .arrow-left-undone")[0]).remove(); 
	$($(element +" .arrow-right-undone")[0]).remove(); 
	$($(element +" .arrow-left-done")[0]).remove();
	$($(element +" .arrow-right-done")[0]).remove(); 
	$($(element +" .arrow-left-incomplete")[0]).remove();
	$($(element +" .arrow-right-incomplete")[0]).remove();
	$(element).append('<div class="arrow-right-incomplete"></div>'); 
	$(element +" span").removeClass("undone"); 
	$(element +" span").removeClass("done"); 
	$(element +" span").addClass("incomplete"); 
	$(element).append('<div class="arrow-down-incomplete"></div>');
}

function tester(){
	console.log("test");
}

function showOtherBlocks(){
	$(".initialHide").each(function(){
		$(this).removeClass("initialHide"); 
		$(this).addClass("showHidden");
	});
	$("#it").append('<div class="arrow-right-undone"></div>');
}

function hideOtherBlocks(){
	$(".showHidden").each(function(){
		$(this).removeClass("showHidden"); 
		$(this).addClass("initialHide");
	});
	$("#it .arrow-right-undone").remove(); 
	$("#it .arrow-right-done").remove(); 
}