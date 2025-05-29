//1)class course
//{
//	//here
//};
//class DacCourse :public course
//{
//	// here
//};
//
//you should be able to say following
//
//course* c = new course;
//c->fees(); // course version should be called
//c = new DacCourse;
//c->fees();  // DacCourse version should be called

//#include <iostream>
//using namespace std;
//
//class Course {
//public:
//	virtual void fees() {
//		cout << "Fees for the course is $1000." << endl;
//	}
//};
//
//class DacCourse : public Course {
//public: 
//	void fees() override {
//		cout << "Fees for the DacCourse is $1500." << endl;
//	}
//};
//
//int main() {
//	Course* c = new Course;
//	c->fees();
//	c = new DacCourse;
//	c->fees();
//	delete c;
//	return 0;
//}