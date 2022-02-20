from flask import Flask
from flask_restplus import Api, Resource

flask_app = Flask(__name__) # определяем, что будет использоваться фреймворк Flask
app = Api(app = flask_app) # определяем, что нужно будет запускать проект в API из flask_restplus (т.е. как Swagger UI)

name_space = app.namespace('main', description='Main APIs')

@name_space.route("/")
class MainClass(Resource):
	def get(self):
		return {
			"status": "Got new data"
		}
	def post(self):
		return {
			"status": "Posted new data"
		}

if __name__ == "__main__":
	flask_app.run(debug=True)