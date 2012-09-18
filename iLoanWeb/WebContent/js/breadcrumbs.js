$(document).ready(function() {

});

function changeState(element) {
	$($(".arrow-down-done")[0]).remove();
	$($(".arrow-down-incomplete")[0]).remove();
	$($(".arrow-down-undone")[0]).remove();
	$($(element + " .arrow-left-undone")[0]).remove();
	$($(element + " .arrow-right-undone")[0]).remove();
	$($(element + " .arrow-left-done")[0]).remove();
	$($(element + " .arrow-right-done")[0]).remove();
	$($(element + " .arrow-left-incomplete")[0]).remove();
	$($(element + " .arrow-right-incomplete")[0]).remove();
	if ("#ccd" != element) {
		$(element).prepend('<div class="arrow-left-incomplete"></div>');
	}
	if ("#dass" != element) {
		if ("#it" == element) {
			$("#it div").each(
				function(index) {
					if ($(this).prop("class") == "arrow-right-undone") {
						$(this).append('<div class="arrow-right-incomplete"></div>');
					}
				});
		} else {
			$(element).append('<div class="arrow-right-incomplete"></div>');
		}
	}

	$(element).append('<div class="arrow-down-incomplete"></div>');
	$(element + " span").removeClass("undone");
	$(element + " span").addClass("incomplete");

}

function validatedState(element, isValidated) {
	$($(".arrow-down-done")[0]).remove();
	$($(".arrow-down-incomplete")[0]).remove();
	$($(".arrow-down-undone")[0]).remove();
	$($(element + " .arrow-left-undone")[0]).remove();
	$($(element + " .arrow-right-undone")[0]).remove();
	$($(element + " .arrow-left-done")[0]).remove();
	$($(element + " .arrow-right-done")[0]).remove();
	$($(element + " .arrow-left-incomplete")[0]).remove();
	$($(element + " .arrow-right-incomplete")[0]).remove();
	$(element + " span").removeClass("undone");
	if(isValidated){
		if(element!="#ccd"){
			$(element).prepend('<div class="arrow-left-done"></div>');
		}
		
		if(element!="#it"){
			$(element).append('<div class="arrow-right-done"></div>');
		}
		$(element + " span").removeClass("incomplete");
		$(element + " span").addClass("done");
		$(element).append('<div class="arrow-down-done"></div>');
		
	}else{
		if(element!="#ccd"){
			$(element).prepend('<div class="arrow-left-incomplete"></div>');
		}
		
		if(element!="#it"){
			$(element).append('<div class="arrow-right-incomplete"></div>');
		}
		
		$(element + " span").removeClass("done");
		$(element + " span").addClass("incomplete");
		$(element).append('<div class="arrow-down-incomplete"></div>');
	}
}

function tester() {
	console.log("test");
}

function showOtherBlocks() {
	$(".initialHide").each(function() {
		$(this).removeClass("initialHide");
		$(this).addClass("showHidden");
	});

	$("#it div").each(function() {
		var className = $(this).prop("class");
		console.log(className);
		if (className == "arrow-left-done") {
			$("#it div.arrow-right-undone").remove();
			$("#it div.arrow-right-done").remove();
			$("#it div.arrow-right-incomplete").remove();
			$("#it").append('<div class="arrow-right-done"></div>');
			return;
		}
		if (className == "arrow-left-incomplete") {
			$("#it div.arrow-right-undone").remove();
			$("#it div.arrow-right-done").remove();
			$("#it div.arrow-right-incomplete").remove();
			$("#it").append('<div class="arrow-right-incomplete"></div>');
			return;
		}
		if (className == "arrow-left-undone") {
			$("#it div.arrow-right-incomplete").remove();
			$("#it div.arrow-right-done").remove();
			$("#it div.arrow-right-undone").remove();
			$("#it").append('<div class="arrow-right-undone"></div>');
			return;
		} 

	});
}

function hideOtherBlocks() {
	$(".showHidden").each(function() {
		$(this).removeClass("showHidden");
		$(this).addClass("initialHide");
	});
	$("#it .arrow-right-undone").remove();
	$("#it .arrow-right-done").remove();
	$("#it .arrow-right-incomplete").remove();
}