"ues strict"
$(function(){
	$("#stutas").text("入金前");
	$("#stutasNext").text("入金済み変更");

	$(document).on("click","#stutasNext",function(){
		let url = "http://localhost:8080/ex3/check";
		let stutasNext = $("#stutasNext").val();
		let stutas = $("#stutas").val();
		$.ajax({
			url:url,
			type:"post",
			dataType:"json",
			data:{
				stutasNext:stutasNext,
				stutas:stutas,
			},
			async:true
			}).done(function(data){
				console.log(data);
				console.dir(JSON.stringify(data));
				$("#stutas").text(data.stutas);
				$("#stutasNext").text(data.stutasNext);
				$("#stutasNext").val(data.stutasNext);
			}).fail(function(XMLHttpRequest,textStatus,errorThrown){
				alert("正しく取得できませんでした。")
				console.log("XMLHttpRequest"+XMLHttpRequest.status);
				console.log("textStatus"+textStatus);
				console.log("errorThrown"+errorThrown.message);

			})
	})
	
})