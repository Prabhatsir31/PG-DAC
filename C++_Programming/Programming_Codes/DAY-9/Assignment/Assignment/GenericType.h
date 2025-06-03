#ifndef GENERICTYPE_H
#define GENERICTYPE_H

#include <iostream>

template <typename T>
class GenericType {
private:
    T value;
public:
    GenericType(T val) : value(val) {}

    void disp() const {
        std::cout << "Value: " << value << std::endl;
    }

    int size() const {
        return sizeof(T);
    }
};

#endif
