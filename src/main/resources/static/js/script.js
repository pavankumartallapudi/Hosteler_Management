const name=document.getElementById("us1")
const name_error=document.getElementById("name_error")
const pass=document.getElementById("pass1")
const pass_error=document.getElementById("pass_error")

const form=document.getElementById("form2")
form.addEventListener('submit' ,(e)=>{
	if(name.value=== ''||name.value=== null)
	{
		e.preventDefault();
		name_error.innerHTML="Name is required";
	}
	else{
		name_error.innerHTML="";
	}
	if(pass.value=== ''||pass.value=== null)
	{
		e.preventDefault();
		pass_error.innerHTML="pass is required";
	}
	else if(pass.value.length<8){
		e.preventDefault();
		pass_error.innerHTML="password must not be less than 8 charecters";
	}
	else{
		pass_error.innerHTML="";
		window.alert("logged in successfully")	
	}

})
