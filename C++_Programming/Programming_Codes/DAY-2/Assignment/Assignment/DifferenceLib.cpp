#ifndef DIFFERENCELIB_H  
#define DIFFERENCELIB_H  

// Function declaration for getDifference  
int getDifference(int a, int b);  

#endif // DIFFERENCELIB_H
#include "DifferenceLib.h"  

// Function definition for getDifference  
int getDifference(int a, int b) {  
   return a - b;  
}
#include <iostream>  
#include "DifferenceLib.h" // Include the header file for the static library  

using namespace std;  

int main() {  
   int num1, num2;  
   cout << "Enter first number: ";  
   cin >> num1;  
   cout << "Enter second number: ";  
   cin >> num2;  

   // Call the function from the static library to get the difference  
   int difference = getDifference(num1, num2);  

   cout << "The difference between " << num1 << " and " << num2 << " is: " << difference << endl;  

   return 0;  
}
