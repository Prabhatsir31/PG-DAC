//2) create following structure
//struct book
//{
//	char bid[5];
//	char name[30];
//	int price;
//};
//ask user how many records he wants to create and accordingly allocate memory.
//accept values from user and display.
//(Hint :-use  "new" operator)


//#include <iostream>
//using namespace std;
//
//struct Book {
//	char bid[5];
//	char name[30];
//	int price;
//};
//
//int main() {
//	int n;
//	cout << "Enter the number of book records you want to create: ";
//	cin >> n;
//	Book* books = new Book[n];
//	for (int i = 0; i < n; i++) {
//		cout << "Enter details for book " << i + 1 << ": \n";
//		cout << "Book ID: ";
//		cin >> books[i].bid;
//		cout << "Book Name: ";
//		cin.ignore(); 
//		cin.getline(books[i].name, 30);
//		cout << "Book Price: ";
//		cin >> books[i].price;
//
//		cout << "\nDetails of Book " << i + 1 << ":\n";
//		cout << "Book ID: " << books[i].bid << "\n";
//		cout << "Book Name: " << books[i].name << "\n";
//		cout << "Book Price: " << books[i].price << "\n\n";
//	}
//}