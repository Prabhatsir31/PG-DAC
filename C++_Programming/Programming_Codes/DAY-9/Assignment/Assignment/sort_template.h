#ifndef SORT_TEMPLATE_H
#define SORT_TEMPLATE_H

#include <iostream>
using namespace std;

// Template function to sort an array of any type
template <typename T>
void sortArray(T arr[], int size) {
	for (int i = 0; i < size - 1; ++i) {
		for (int j = i + 1; j < size; ++j) {
			if (arr[j] < arr[i]) {
				swap(arr[i], arr[j]);
			}
		}
	}
}

// Utility function to print the array
template <typename T>
void printArray(T arr[], int size) {
	for (int i = 0; i < size; ++i)
		cout << arr[i] << " ";
	cout << endl;
}

#endif
