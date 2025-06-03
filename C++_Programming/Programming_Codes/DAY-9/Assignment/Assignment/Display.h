#ifndef DISPLAY_H
#define DISPLAY_H

#include <iostream>

class Display {
public:
    // Function template inside the class to display any type of value
    template <typename T>
    void show(const T& value) {
        std::cout << "Value: " << value << std::endl;
    }
};

#endif

