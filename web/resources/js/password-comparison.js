function checkPass(input)
{
    //Store the password field objects into variables ...
    var pass1 = document.getElementById('password');
    var pass2 = document.getElementById('retypePassword');

    //Store the Confimation Message Object ...
    var message = document.getElementById('confirmMessage');
    //Set the colors we will be using ...
    var goodColor = "#66cc66";
    var badColor = "#ff6666";
    //Compare the values in the password field
    //and the confirmation field
    if(pass1.value == pass2.value){
        //The passwords match.
        //Set the color to the good color and inform
        //the user that they have entered the correct password
        pass2.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Passwords Match!"
        input.setCustomValidity('');
    }else{
        //The passwords do not match.
        //Set the color to the bad color and
        //notify the user.
        pass2.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Passwords Do Not Match!"
        input.setCustomValidity('Password Must be Matching.');
    }
}

$(document).ready(function(){
    var updateCar = function () {
        var parentSelect = $('#changeCar');
        $('#carType').val(parentSelect.find(':selected').attr('car-type'));
        $('#gearBox').val(parentSelect.find(':selected').attr('gear-box'));
        $(".selectedCarImage").attr("src","/resources/images/banner" + parentSelect.find(':selected').attr('car-img') + ".jpg");
        $(".selectedCarDesc").html(parentSelect.find(':selected').attr('car-desc'));
    };
    $('#changeCar').on('change', function() {
        updateCar();
    });
    updateCar();
});



// $('#selectAgency').on('change', function() {
//     $('#branchAgency').val($(this).find(':selected').attr('branch-agency'));
// })

$('#contactForm').on('submit', function() {
    $(this).each(function() {
        this.reset();
    });
});