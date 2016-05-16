/**
 * @author paudelumesh
 */
$(document).ready(
		function() {
			$('#buildingNo').change(
					function() {
						$.getJSON('/dormmanagement/auth/admin/api/room/rooms', {
							buildingNo : $(this).val()
						}, function(data) {
							var html = '<option value="">--Select--</option>';
							var len = data.length;
							for (var i = 0; i < len; i++) {
								html += '<option value="' + data[i].roomNo
										+ '">' + data[i].roomNo + '</option>';
							}
							html += '</option>';

							$('#roomNo').html(html);
						});
					});
		});