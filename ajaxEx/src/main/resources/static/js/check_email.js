"use strict";
$(function() {
	$(document).on("keyup", "#email", function() {
		let hostUrl = "http://localhost:8080/checkemail/check";
		let inputEmail = $("#email").val();
		$.ajax({
			url: hostUrl,
			type: "post",
			dataType: "json",
			data: {
				email : inputEmail
			},
			async: true
		}).done(function(data) {
			console.log(data);
			console.dir(JSON.stringify(data));
			$("#duplicateMessage").text(data.duplicateMessage);
		}).fail(function(XMLHttpRequest, textStatus, errorThrown) {
			alert("正しい結果を得られませんでした");
			console.log("XMLHttpRequest" + XMLHttpRequest.status);
			console.log("textStatus" + textStatus);
			console.log("errorThrown" + errorThrown.message);
		});
	});
});