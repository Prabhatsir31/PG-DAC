#ifndef BOX_H
#define BOX_H

template <typename T>
class Box {
private:
    T value;
public:
    Box(T val) : value(val) {}

    T getValue() const {
        return value;
    }
};

#endif
