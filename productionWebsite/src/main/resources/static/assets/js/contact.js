function sendMessage() {
    const name = document.getElementById('name').value;
    const mail = document.getElementById('mail').value;
    const subject = document.getElementById('subject').value;
    const message = document.getElementById('message').value;

    const contactForm = {
        name: name,
        mail: mail,
        subject: subject,
        message: message
    };

    const jsonData = JSON.stringify(contactForm);
    const xhr = new XMLHttpRequest();
    xhr.open('POST', '/submitContactRequest', true);

    xhr.setRequestHeader('Content-Type', 'application/json');

    xhr.onload = function () {
        if (xhr.status >= 200 && xhr.status < 300) {
            document.getElementById('sucMessage').style.display = "block";
            document.getElementById('submitBtn').disabled = true ;
        } else {
            document.getElementById('Errmessage').style.display = "block";
        }
    };
    xhr.send(jsonData);
}

