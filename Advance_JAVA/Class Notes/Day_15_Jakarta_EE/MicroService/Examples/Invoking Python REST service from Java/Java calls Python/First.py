from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/api/getmodulelist', methods=['GET'])
def get_data():
    mylist=['java','MySQL','Python','C++']
    return jsonify(mylist)

if __name__ == '__main__':
    app.run(debug=True)
