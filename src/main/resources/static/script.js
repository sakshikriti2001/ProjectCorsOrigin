// script.js
document.getElementById('fetchMessage').addEventListener('click', function() {
    fetch('http://localhost:5060/api/hii','http://localhost:5060/api/welcome')
        .then(response => response.text())
        .then(data => {
            document.getElementById('message').innerText = data;
        })
        .catch(error => {
            document.getElementById('message').innerText = 'Error: ' + error.message;
        });
});
