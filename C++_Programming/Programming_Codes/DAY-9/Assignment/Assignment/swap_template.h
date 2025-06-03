#ifndef SWAP_TEMPLATE_H
#define SWAP_TEMPLATE_H

template <typename T>
void swapValues(T& a, T& b) {
    T temp = a;
    a = b;
    b = temp;
}

#endif
