#ifndef DISPLAY_TEMPLATE_H
#define DISPLAY_TEMPLATE_H

#include <iostream>
using namespace std;

// Generic function template
template <typename T>
void display(T t) {
	cout << "Displaying: " << t << endl;
}

// Overloaded function for int
void display(int x) {
	cout << "Overloaded for int: " << x << endl;
}

#endif
