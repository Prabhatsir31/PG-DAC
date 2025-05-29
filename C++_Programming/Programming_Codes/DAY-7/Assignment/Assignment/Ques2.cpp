//2)Create a base class Animal.Declare pure virtual function “void makeSound()” in it.
//Define following sub classes for this class.A) Dog  b) Cat  c) Tiger
//“Tiger” class will have one more function “hunting()”.create a global function “void perform() which accepts 
//pointer of type Animal so that it can invoke “makeSound()” function polymorphically.Inside this function find 
//out where exactly where “Tiger” is stored using  RTTI(dynamic_cast), and invoke “hunting()” function along with “makeSound()” function

//#include <iostream>
//using namespace std;
//
//class Animal {
//public:
//    virtual void makeSound() = 0; // pure virtual
//    virtual ~Animal() {}          // virtual destructor for safety
//};
//
//class Dog : public Animal {
//public:
//    void makeSound() override {
//        cout << "Dog says: Woof!" << endl;
//    }
//};
//
//class Cat : public Animal {
//public:
//    void makeSound() override {
//        cout << "Cat says: Meow!" << endl;
//    }
//};
//
//class Tiger : public Animal {
//public:
//    void makeSound() override {
//        cout << "Tiger says: Roar!" << endl;
//    }
//    void hunting() {
//        cout << "Tiger is hunting in the jungle!" << endl;
//    }
//};
//
//void perform(Animal* a) {
//    a->makeSound();
//
//    Tiger* t = dynamic_cast<Tiger*>(a);
//    if (t != nullptr) {
//        t->hunting(); // Call extra function only for Tiger
//    }
//}
//
//int main() {
//    Dog d;
//    Cat c;
//    Tiger t;
//
//    perform(&d); 
//    perform(&c); 
//    perform(&t); 
//
//    return 0;
//}
