/*var smoothScrollTo = (function () {
  var timer, start, factor;

  return function (target, duration) {
    var offset = window.pageYOffset,
        delta  = target - window.pageYOffset; // Y-offset difference
    duration = duration || 1000;              // default 1 sec animation
    start = Date.now();                       // get start time
    factor = 0;

    if( timer ) {
      clearInterval(timer); // stop any running animation
    }

    function step() {
      var y;
      factor = (Date.now() - start) / duration; // get interpolation factor
      if( factor >= 1 ) {
        clearInterval(timer); // stop animation
        factor = 1;           // clip to max 1.0
      } 
      y = factor * delta + offset;
      window.scrollBy(0, y - window.pageYOffset);
    }

    timer = setInterval(step, 10);
    return timer; // return the interval timer, so you can clear it elsewhere
  };
}());*/

$( document ).ready(function () {
	var enjectUp=true;
	var id=document.getElementById('enject');
	document.getElementsByClassName("sign-in")[0].roll=true;

	$('body').animate({
			scrollTop: 0
		}, 900);
	$('#enject').click(function () {
		
		if(enjectUp){
			$('body').animate({
				scrollTop: 700
			}, 1000);
			//smoothScrollTo(700,1000);
			id.className = "enjectionDown";
			setTimeout(function(){$('#enject').toggleClass('enjectDown');}, 1000);
			$('#left_footer').animate({
			width:'0px'
			},"slow");
			$('#right_footer').animate({
				width:'0px'
			},"slow");
			setTimeout(function(){$('.footer').hide();},600);
			enjectUp=false;
		}
		else{
			$('body').animate({
			scrollTop: 0
			}, 1000);
			enjectUp=true;
			id.className="enjectionUp";
			/*var width=$( document ).width();
			var leftW=width/10;leftW+='px';
			var rightW=9*width/10;rightW+='px';*/
			$('#left_footer').animate({
				width:'10%'
			},"slow");
			$('#right_footer').animate({
				width:'90%'
			},"slow");
			$('.footer').fadeIn();
		}
	});
	$('.sign-in').click(function (event) {
		$('.registration-form').fadeIn(500);
		$('.large_logo').hide();
		//$('body').css('background-color','white');
		event.stopPropagation();
		jQuery('html').click(function() {
			window.location = 'index.jsp';
		});	
	});
	$('.registration-form').click(function(event){
    event.stopPropagation();});
	$( document ).on( "scroll", function(event){
		var width=$( document ).width();
		var img=683,topmenu=75;
		var height=img-topmenu;
		var pos=$( document ).scrollTop();
		var kof=(height-pos)/height;
		if(pos<height){
			$('#left_footer').css("width",width/10*kof+'px');
			$('#right_footer').css("width",9*width/10*kof+'px');
		}
	} );
	$('.exit').click(function(event){
		window.location='index.jsp';
	});
//	$('.choose').mouseover(function(event){
//		this.toggle( "scale" );
//	});
});