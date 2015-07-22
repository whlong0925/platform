/*function setupLabel(){ 
	if($('.label_check input').length) { 
		$('.label_check').each(function(){
			 $(this).removeClass('c_on'); 
			 }); 
		$('.label_check input:checked').each(function(){ 
			$(this).parent('label').addClass('c_on'); 
			}); 
			}; 
	if($('.label_radio input').length) { 
		$('.label_radio').each(function(){
			 $(this).removeClass('r_on');
			  }); 
		$('.label_radio input:checked').each(function(){
			 $(this).parent('label').addClass('r_on'); 
			 }); 
			 }; 
	} 
$(function(){ 
	$('.label_check,.label_radio').click(function(){ 
		setupLabel();
	}); 
	setupLabel(); 
    $('#city-all').click(function(){ 
		alert(this.checked);
		$("input[name='mStation']").attr("checked", this.checked);
	}); 
}); 

$(function(){ 
    $('#city-all').click(function(){ 		
		$("input[name='mStation']").attr("checked", this.checked);
		if(this.checked){
			$('.label_check').addClass('c_on');
		}else{
			$('.label_check').removeClass('c_on');
		}
		
	}); 
	$("input[name='mStation']").click(function(){
		if(this.checked){
			//this.checked = false;
			$(this).parent().addClass('c_on');
		}else{
			//this.checked = true;
			$(this).parent().removeClass('c_on');
		}
	});
});*/


$(function(){ 
    //单击发生变化
	$("body").addClass("check_radio_con");
	$(".check_radio_con").on("click","label.label_check",function(e){//代理 含有checkbox的label标签 的click事件
		if($(this).hasClass("c_on")){
			$(this).removeClass('c_on').find("input:checkbox").attr("checked",false);
		}else{
			$(this).addClass('c_on').find("input:checkbox").attr("checked",true);
		}
		return false;
	});
	
	$(".check_radio_con").on("click","label.label_radio",function(e){	//代理 含有radio的label标签 的click事件
	   if($(".label_radio input[type=radio]")){		 
		 var _name=$(this).attr("name");
		 $('.label_radio[name='+_name+']').removeClass('r_on').find("input:radio").attr("checked",false);
		 $(this).addClass('r_on').find("input:radio").attr("checked",true);
	   }
	   return false;
	});
	
    $('.check-all').click(function(){ 	//全选	
	    var _name=$(this).attr("name");
		if($(this).hasClass("c_on")){
			$('.label_check[name='+_name+']').removeClass('c_on').find("input:checkbox").attr("checked",false);
		}else{
			$('.label_check[name='+_name+']').addClass('c_on').find("input:checkbox").attr("checked",true);
		}
		return false;
	}); 


});