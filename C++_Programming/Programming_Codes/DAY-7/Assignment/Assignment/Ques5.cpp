//5)Create a base class “StorageDevice”.Define  virtual function “void store()” in it.Define following sub classes for this class.
//A) HardDisk b) CD c) PenDrive.
//define  “store()” in these classes.
//now write a global function "perform()" which will accept "StorageDevice class reference" as an argument.
//In this function using RTTI invoke  "store()" method of  only “PenDrive”.[handle bad_cast exception]
//From main function try to call “perform()” function by passing various child classes.

//#include <iostream>
//using namespace std;
//
//class StorageDevice {
//public:
//    virtual void store() = 0;
//    virtual ~StorageDevice() {}
//};
//
//class HardDisk : public StorageDevice {
//public:
//    void store() override {
//        cout << "Storing data in HardDisk" << endl;
//    }
//};
//
//class CD : public StorageDevice {
//public:
//    void store() override {
//        cout << "Storing data in CD" << endl;
//    }
//};
//
//class PenDrive : public StorageDevice {
//public:
//    void store() override {
//        cout << "Storing data in PenDrive" << endl;
//    }
//};
//
//void perform(StorageDevice& device) {
//    try {
//        PenDrive& p = dynamic_cast<PenDrive&>(device);
//        p.store();
//    }
//    catch (bad_cast& e) {
//        cout << "Device is not a PenDrive" << endl;
//    }
//}
//
//int main() {
//    HardDisk hd;
//    CD cd;
//    PenDrive pd;
//
//    perform(hd);
//    perform(cd);
//    perform(pd);
//
//    return 0;
//}
