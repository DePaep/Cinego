$( document ).ready(function() {

    // SUBMIT FORM
    $("#customerForm").submit(function(event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        ajaxPost();
    });


    function ajaxPost(){
    var data = new Object();
    data.email = $("#email").val();
    data.password = $("#password").val();

        // DO POST
        $.ajax({
            type : "POST",
            url : "http://localhost:8282/users/register",
            data : JSON.stringify(data),
            dataType : 'json',
            success : function(result) {
                if(result.status == "Done"){
                    $("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                        "Post Successfully! <br>" +
                        "---> Customer's Info: FirstName = " +
                        result.data.firstname + " ,LastName = " + result.data.lastname + "</p>");
                }else{
                    $("#postResultDiv").html("<strong>Error</strong>");
                }
                console.log(result);
            },
            error : function(e) {
                alert("Error!");
                console.log("ERROR: ", e);
            }
        });

        // Reset FormData after Posting
        resetData();

    }

    function resetData(){
        $("#email").val("");
        $("#password").val("");
    }
});