"ues strict"
$(function(){
	$(document).on("keyup","#passSize,#pass",function(){
		let url = "http://localhost:8080/ex2/check1";
		let passSizes = $("#passSize").val();
		let ConfirmationPassword =  $("#pass").val();
		$.ajax({
			url:url,
			type:"post",
			dataType:"json",
			data:{
				passSize:passSizes,
				conPass : ConfirmationPassword
			},
			async:true
			}).done(function(data){
				console.log(data);
				console.dir(JSON.stringify(data));
				$("#passSizeChaek").text(data.passSize);
				$("#passChaek").text(data.conPass);

			
			}).fail(function(XMLHttpRequest,textStatus,errorThrown){
				alert("正しく取得できませんでした。")
				console.log("XMLHttpRequest"+XMLHttpRequest.status);
				console.log("textStatus"+textStatus);
				console.log("errorThrown"+errorThrown.message);

			})
	})
	
})