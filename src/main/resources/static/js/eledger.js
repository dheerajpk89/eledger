$("#registration_type").change(function() {
	if ($(this).val() == "DoctorRegistration") {
		$('.optionLabform').hide('');
		$('.optionDoctorform').show('');
	}
});
$("#registration_type").change(function() {
	if ($(this).val() == "LabRegistration") {
		$('.optionLabform').show('');
		$('.optionDoctorform').hide('');
	}
});

function loadDataToModel(){
	  var table = document.getElementById('table_id');
	                
	                for(var i = 1; i < table.rows.length; i++)
	                {
	                    table.rows[i].onclick = function()
	                    {
						 document.getElementById("patient_id").value = this.cells[0].innerHTML.trim();
						 document.getElementById("patient_name").value = this.cells[2].innerHTML.trim();
						 document.getElementById("dr_in_charge").value = this.cells[3].innerHTML.trim();
						}
					}
	  }