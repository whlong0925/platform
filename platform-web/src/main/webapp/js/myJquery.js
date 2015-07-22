// JavaScript Document
// JavaScript Document
//页面加载完毕执行
var $$=function(func){
		if(document.addEventListener){
				window.addEventListener("load",func,false);
			}else if(document.attachEvent){
				window.attachEvent("onload",func);
				}
	}
$$(function(){	
	Autofit();
	//滚动条样式
	$(".listCon").mCustomScrollbar();
	
	});	

//窗口发生变化	
$(window).resize(function() {
	Autofit();		
});
	
//页面加载
$(document).ready(function() {
	//折叠菜单单击事件
	$(".foldCon").on("click","h1",function(){
		$(this).attr("class","lm-down").siblings("h1").removeClass("lm-down").addClass("lm-up");
		$(".foldCon .listCon").hide();
		$(this).next(".listCon").fadeIn(500)
		});
	//过滤单击事件
	$(".fBtn").click(function(){
		$(this).siblings().children("span").removeClass("sClick");
		$(this).children("span").addClass("sClick");
		});	
	//下拉列表
	$(".select").click(function(e){
		e.stopPropagation();
		$(this).next(".sListCon").toggle();
		});	
	$(".sListCon ul li a").click(function(){
		var curr=$(this).html();
		$(this).parents(".sListCon").prev(".select").val(curr);
		});
	//switch
	$(".switchCon").on("click","a",function(){
		$(this).addClass("sClick").siblings("a").removeClass("sClick");
		});	
	//nav导航
	$(".navDList").click(function(e){//单击显示下拉列表
		e.stopPropagation();
		$(".navList").toggle();
		});
	$(".navList").on("click","li",function(){	
		var _imgUrl=$(this).children("img").attr("src");
		var _navTitle=$(this).children("span").html();
		$(".navIco img").attr("src",_imgUrl);
		$(".navDList").html(_navTitle);
		$(".navList").hide();
		});
	//user
	$(".uName").click(function(e){//单击显示下拉列表
		e.stopPropagation();
		$(".uList").toggle();
		});
	$(".uList").on("click","li",function(){	
		var _uName=$(this).children("a").html();
		$(".uName").html(_uName);
		$(".uList").hide();
		});	
	//选项卡
	$(".tabTitle").on("click","a",function(){
		var _tabIndex=$(this).index()+1;
		$(this).removeClass("bg").addClass("sClick").siblings().removeClass("sClick");
		$(".tabContext").hide();
		$("div[id=tabCxt_"+_tabIndex+"]").fadeIn(500);
		});	
	   //more
	   //var timer=null;
//	   $(".more").mouseover(function(e){
//		   var x=e.pageX;
//		   clearTimeout(timer);
//		   $(".tipCon").fadeIn(500);
//		   }).mouseout(function(){
//			   timer=setTimeout(function(){
//			$(".tipCon").fadeOut(500);
//			},500);
//			   
//			   });
		//indicator---环形进度条
		$(".ringProgress").radialIndicator({
			barColor:{
				0:'#3ecb70',
				20:'#96c93d',
				40:'#e1de06',
				60:'#fc7b34',
				80:'#ff4848',
				100:'#ff4848'},
			barBgColor:'#f6f6f6',
			percentage:true,
			radius:55,
			barWidth:6,
			fontFamily:'Arial'
			});
   
		

	   	
	//单击空白消失
	$("*").click(function(event){
		$(".sListCon").hide();
		
		$(".uList").hide();
		if(!$(this).hasClass("navList")){
			$(".navList").hide();
			}
			event.stopPropagation();
		});
});
	
	
		
function Autofit(){
	var bodyheight=$(window).height();//窗口的高度
	var bodywidth=$(window).width();//窗口的宽度
	
	//左右结构页面
	$(".Container").css({"height":(bodyheight-75*2)+"px"});
	$(".mContainer").css({"height":(bodyheight-75*2)+"px"});
	$(".leftCon").css({"height":(bodyheight-75*2-20)+"px"});
	$(".rightCon").css({"height":(bodyheight-75*2-20)+"px",
	                     "width":(bodywidth-246)+"px"});
	$(".menuCon").css("height",(bodyheight-75*2-20-40));
	//折叠菜单
	var _h1num=$(".foldCon h1").length;
	$(".listCon").css("height",($(".menuCon").height()-41*_h1num));
	
	//选项卡
	$(".tabContext").css("height",($(".tabCon").height()-50));
	
	
}
