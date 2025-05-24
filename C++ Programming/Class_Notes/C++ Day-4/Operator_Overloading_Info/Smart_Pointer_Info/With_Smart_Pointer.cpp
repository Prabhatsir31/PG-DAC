#include<iostream>
using namespace std;
class Person
{
    int age;
    char* pName;

public:
    Person() : pName(0), age(0)
    {
    }
    Person(const char* pName, int age)
    {
        this->pName = new char[strlen(pName) + 1];
        strcpy_s(this->pName,strlen(pName)+1, pName);
        this->age = age;
    }
    ~Person()
    {
        cout << "inside dest" << endl;
        delete pName;
    }
    Person(Person& ref)
    {
        cout << "copy const" << endl;
        pName = new char[strlen(ref.pName) + 1];
        strcpy_s(pName,strlen(ref.pName)+1, ref.pName);
        age = ref.age;
    }
    void display()
    {
        if(pName!=NULL)
        cout << pName << "\t" << age << endl;
    }
    void shout()
    {
        cout << "aaaaaaaaaaaoooooooooo" << endl;
    }
};
class SP
{
private:
    Person* pData; // pointer to person class
public:
    SP(Person* pValue)
    {
        pData = new Person(*pValue);
        delete pValue;
    }
    ~SP()
    {
        cout << "inside SP destructor" << endl;
        // pointer no longer required
        delete pData;
    }
    Person& operator* ()
    {
        return *pData;
    }

    Person* operator-> ()
    {
        return pData;
    }
};

int main()
{
    SP s(new Person("abc", 10));
    s->display();
    s->shout();
    (*s).display();
    (*s).shout();
    return 0;
}





