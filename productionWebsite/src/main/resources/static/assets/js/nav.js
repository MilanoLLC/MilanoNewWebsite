$(document).ready(function () {
    $.get("/getNavigator", function (data) {
        $("#nav-placeholder").replaceWith(data);
    });
    if(document.getElementById("pg").value === "events"){
        document.getElementById("events").classList.add("active");
    }

});