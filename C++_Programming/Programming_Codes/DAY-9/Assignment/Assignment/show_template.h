#ifndef SHOW_TEMPLATE_H
#define SHOW_TEMPLATE_H

#include <iostream>
#include <string>
using namespace std;

// Generic template function
template <typename T>
void show(T data) {
	cout << "Generic show: " << data << endl;
}

// Specialization for int
template <>
void show<int>(int data) {
	cout << "In int method: " << data << endl;
}

// Specialization for double
template <>
void show<double>(double data) {
	cout << "In double method: " << data << endl;
}

#endif