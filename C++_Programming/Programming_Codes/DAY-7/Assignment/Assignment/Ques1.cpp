//1)Create a base class Weapon.Define virtual function “void attack()” in it.
//Define following sub classes for this class.A) Gun  b) Sword  c) Rifle
//“Rifle” class will have one more function “Chambering()”.create an array of pointer to Weapon having 3 elements.
//In this array, store  the instances of child classes.
//Traverse the array, find out where exactly “Rifle”  is stored using  RTTI(dynamic_cast), and invoke “Chambering()” 
//function along with “attack()” function.

//#include <iostream>
//using namespace std;
//
//class Weapon {
//public:
//	virtual void attack() {
//		cout << "Weapon attack!" << endl;
//	}
//	virtual ~Weapon() {}
//};
//
//class Gun : public Weapon {
//public:
//	void attack() override {
//		cout << "Gun attack!" << endl;
//	}
//};
//
//class Sword : public Weapon {
//public:
//	void attack() override {
//		cout << "Sword attack!" << endl;
//	}
//};
//
//class Rifle : public Weapon {
//public:
//	void attack() override {
//		cout << "Rifle attack!" << endl;
//	}
//	void Chambering() {
//		cout << "Rifle chambering!" << endl;
//	}
//};
//
//void perform(Weapon* w) {
//	w->attack();
//
//	if (Rifle* r = dynamic_cast<Rifle*>(w)) {
//		r->Chambering();
//	}
//	else {
//		cout << "Not a Rifle instance." << endl;
//	}
//}
//
//int main() {
//	Weapon* weapons[3];
//	weapons[0] = new Gun();
//	weapons[1] = new Sword();
//	weapons[2] = new Rifle();
//	for (int i = 0; i < 3; ++i) {
//		perform(weapons[i]);
//		delete weapons[i]; // Clean up memory
//	}
//	return 0;
//}