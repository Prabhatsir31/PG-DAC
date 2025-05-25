
//7) Given following functions :
//void disp1(int k);
//int disp2(char*);
//void disp3();
//double* disp4(char ch);
//declare "pointer to functions" for the above functions.


//#include<iostream>  
//using namespace std;  
//
//void disp1(int k) {  
//	cout << "disp1 called with k: " << k << endl;  
//}  
//int disp2(char* str) {  
//	cout << "disp2 called with str: " << str << endl;  
//return 0;  
//}  
//void disp3() {  
//	cout << "disp3 called" << endl;  
//}  
//double* disp4(char ch) {  
//	cout << "disp4 called with ch: " << ch << endl;  
//	static double d = 0.0;  
//	return &d;  
//}  
//int main() {  
//	void (*ptr_disp1)(int) = &disp1;  
//	ptr_disp1(5);  
//	int (*ptr_disp2)(char*) = &disp2;  
//	char str[] = "hello"; 
//	ptr_disp2(str);  
//	void (*ptr_disp3)() = &disp3;  
//	ptr_disp3();  
//	double* (*ptr_disp4)(char) = &disp4;  
//	ptr_disp4('A');  
//	return 0;  
//}	