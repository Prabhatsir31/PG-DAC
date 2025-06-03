//3) write a function template, which can accept argument as any type of array(char, int or double) and sort it in ascending order.


//#include <iostream>
//#include "sort_template.h"
//
//int main() {
//	int intArr[] = { 5, 2, 9, 1, 3 };
//	double dblArr[] = { 3.1, 1.4, 5.9, 2.6 };
//	char charArr[] = { 'd', 'a', 'c', 'b' };
//	int intSize = sizeof(intArr) / sizeof(intArr[0]);
//	int dblSize = sizeof(dblArr) / sizeof(dblArr[0]);
//	int charSize = sizeof(charArr) / sizeof(charArr[0]);
//
//	cout << "Before sorting:\n";
//	printArray(intArr, intSize);
//	printArray(dblArr, dblSize);
//	printArray(charArr, charSize);
//
//	sortArray(intArr, intSize);
//	sortArray(dblArr, dblSize);
//	sortArray(charArr, charSize);
//
//	cout << "\nAfter sorting:\n";
//	printArray(intArr, intSize);
//	printArray(dblArr, dblSize);
//	printArray(charArr, charSize);
//
//	return 0;
//
//}
