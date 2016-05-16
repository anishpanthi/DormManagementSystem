$(document).ready(function() {
//	$(".datepicker").pickadate();
})

function confirmDelete(delForm, delUrl) {
	if (confirm("Are you sure you want to delete this car ?")) {
		delForm.action = delUrl;
		return true;
	}
	return false;
}

function searchCat(){
	var cat = $('#carCat').val();
	
	$.ajax({
		url:'http://localhost:8080/carrentalsystem/carList/'+cat,
		method:'GET',
		data:{category:cat},
		dataType:'json',
		success:function(data){
			
			$.each(data, function(index, val){
				console.log(val);
				$("#carListTable > tbody").html("");
				$("#carListTable tbody").append("<tr>");
				
				$("#carListTable tbody").append("<td>"+ val.id +" </td>");
				$("#carListTable tbody").append("<td>"+ val.registrationId +" </td>");
				$("#carListTable tbody").append("<td>" + val.registeredDate+ " </td>");
				$("#carListTable tbody").append("<td>" + val.expirationDate + " </td>");
				$("#carListTable tbody").append("<td> " +  val.cartype[0].year+"</td>");
				$("#carListTable tbody").append("<td> " +  val.cartype[0].model+"</td>");
				$("#carListTable tbody").append("<td>" +  val.cartype[0].brand+" </td>");
				$("#carListTable tbody").append("<td> " +  val.cartype[0].seats+"</td>");
				$("#carListTable tbody").append("<td> " +  val.cartype[0].category+"</td>");
				$("#carListTable tbody").append("<td> " +  val.cartype[0].year+"</td>");
				
				$("#carListTable tbody").append("</tr>");
			});
		},
		error: function(err){
			console.log(err);
		}
		
	})
}
