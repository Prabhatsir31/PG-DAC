//4) Define a class "Player" with following members
//int id;
//char* name;
//char* country
//int score
//
//
//in the main function, u should be able to say
//
//
//Player p1(1, "sachin", "india", 200);
//
//p1.disp();
//
//Player p2 = p1;
//
//Player p3;
//
//p3 = p1;
//
//make sure there is neither dangling pointer nor memory leak issue in the code.

//#include <iostream>
//using namespace std;
//
//class Player {
//private:
//	int id;
//	char* name;
//	char* country;
//	int score;
//
//public:
//	Player(int id, const char* name, const char* country, int score)
//		: id(id), score(score) {
//		this->name = new char[strlen(name) + 1];
//		strcpy(this->name, name);
//		this->country = new char[strlen(country) + 1];
//		strcpy(this->country, country);
//	}
//	Player(const Player& other)
//		: id(other.id), score(other.score) {
//		name = new char[strlen(other.name) + 1];
//		strcpy(name, other.name);
//		country = new char[strlen(other.country) + 1];
//		strcpy(country, other.country);
//	}
//	Player& operator=(const Player& other) {
//		if (this != &other) {
//			delete[] name;
//			delete[] country;
//			id = other.id;
//			score = other.score;
//			name = new char[strlen(other.name) + 1];
//			strcpy(name, other.name);
//			country = new char[strlen(other.country) + 1];
//			strcpy(country, other.country);
//		}
//		return *this;
//	}
//	~Player() {
//		delete[] name;
//		delete[] country;
//	}
//	void disp() const {
//		cout << "ID: " << id << ", Name: " << name
//			<< ", Country: " << country << ", Score: " << score << endl;
//	}
//};
//
//int main() {
//	Player p1(1, "Sachin", "India", 200);
//	p1.disp();
//	Player p2 = p1; // Copy constructor
//	p2.disp();
//	Player p3(0, "", "", 0); // Default constructor
//	p3 = p1; // Assignment operator
//	p3.disp();
//	return 0;
//}

