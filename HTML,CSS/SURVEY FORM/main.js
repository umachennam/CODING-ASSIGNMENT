var submit_button = document.getElementById("submit");


submit_button.addEventListener("click",(e)=>{
    var firstname = document.getElementById("submit");
   

    let obj ={
        firstname:document.getElementById("firstname").value,
        lastname:document.getElementById("lastname").value,
        mobile:document.getElementById("mobile").value,
        email:document.getElementById("email").value,
        profession:document.getElementById('Profession').value,

    }

    let SelectedGender = document.querySelector('input[name="gender"]:checked');
    if (SelectedGender) {
        obj.gender = SelectedGender.value;
        console.log(obj.gender)
    }
   
    let message = "First Name: "+obj.firstname+'\n'+
    "Last Name: " + obj.lastname +'\n'+
    "Mobile Number: " + obj.mobile +'\n'+
    "Gender: " + obj.gender +'\n'+
    "Email: " + obj.email +'\n'+
    "Profession: " + obj.profession +'\n'
    alert(message);
})