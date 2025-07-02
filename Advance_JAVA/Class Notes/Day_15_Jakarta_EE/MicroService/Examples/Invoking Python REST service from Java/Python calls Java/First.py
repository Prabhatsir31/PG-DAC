import json

import requests
from flask import Flask, request


app = Flask(__name__)

@app.route('/api/sendPerson', methods=['POST'])
def send_person():
    java_url = 'http://localhost:8080/api/receivePerson'

    new_person = {
        "name": request.json['name'],
        "age": request.json['age'],
        "address": request.json['address']
    }

    # Send a POST request with JSON data
    response = requests.post(java_url, json=new_person)
    # Check the response status
    if response.status_code == 200:
        return "Data sent successfully to Java REST API"
    else:
        return "Failed to send data. Status code:", response.status_code

if __name__ == '__main__':
    app.run(debug=True)
