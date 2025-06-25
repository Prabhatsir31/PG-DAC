# C++ Overview and Getting Started

## Installation and Setup of Development Environment

### Install a Compiler

- **C++ requires a compiler to convert code into machine language.**
- Popular options:
  - GCC (GNU Compiler Collection)
  - Clang
  - Microsoft Visual C++

### Install an IDE/Text Editor

- IDEs:
  - Visual Studio
  - Code::Blocks
  - Eclipse CDT
  - Dev-C++
- Text Editors:
  - Visual Studio Code
  - Sublime Text
  - Atom (requires manual setup for compiling)

### Setup Environment

- **Install GCC** using MinGW for Windows or directly via package managers on Linux/macOS:
  - **Windows**: Download MinGW, configure the PATH variable to include the compiler path.
  - **Linux**: Install GCC/Clang via terminal (`sudo apt install g++` for Ubuntu).
  - **macOS**: Use `brew install gcc`.

### Testing the Installation

1. Open a terminal/command prompt.
2. Run:
   ```bash
   g++ --version
   ```
3. Create a sample program and compile it:
   ```cpp
   // test.cpp
   #include <iostream>
   using namespace std;

   int main() {
       cout << "Hello, C++!" << endl;
       return 0;
   }
   ```
4. Compile and run:
   ```bash
   g++ test.cpp -o test
   ./test
   ```

---

## The Need for C++

### Why C++?

1. **Object-Oriented Programming**:

   - Provides abstraction, encapsulation, inheritance, and polymorphism.
   - Useful for creating reusable and maintainable code.

2. **Performance**:

   - Combines the power of low-level programming (like C) with high-level abstractions.
   - Efficient for systems programming, real-time systems, and games.

3. **Wide Application**:

   - Used in fields like game development, operating systems (e.g., Windows), embedded systems, and IoT.

4. **Portability**:

   - Write code once and compile on multiple platforms with minimal changes.

5. **Standard Libraries**:

   - Offers extensive standard libraries (STL) for data structures, algorithms, and utilities.

---

## Features of C++

1. **Object-Oriented**:

   - Supports OOP principles: classes, objects, inheritance, polymorphism, and abstraction.

2. **Extensibility**:

   - Developers can create new data types using classes.

3. **Portability**:

   - Write once, run anywhere with minimal changes.

4. **Rich Standard Library**:

   - STL (Standard Template Library) offers powerful tools for data manipulation.

5. **High Performance**:

   - Combines the efficiency of C with high-level abstractions.

6. **Low-Level Manipulation**:

   - Supports pointers, memory management, and hardware interaction.

7. **Multithreading Support**:

   - Provides built-in support for concurrent and parallel programming.

8. **Generic Programming**:

   - Use templates to write reusable and type-independent code.

---

## C++ versus C

| Feature                | C          | C++                          |
| ---------------------- | ---------- | ---------------------------- |
| **Programming Type**   | Procedural | Object-Oriented + Procedural |
| **Encapsulation**      | No         | Yes                          |
| **Inheritance**        | No         | Yes                          |
| **Polymorphism**       | No         | Yes                          |
| **Data Hiding**        | No         | Yes                          |
| **Exception Handling** | No         | Yes                          |
| **STL Support**        | No         | Yes                          |
| **Namespaces**         | No         | Yes                          |
| **File Extension**     | `.c`       | `.cpp`                       |

---

## History of C++

### Development

- Created by **Bjarne Stroustrup** at Bell Labs in 1979.
- Initially called "C with Classes."

### Key Milestones

- 1983: Renamed to C++ (increment operator to signify enhancement of C).
- 1985: First official release.
- 1998: ISO standardization (C++98).
- 2011, 2014, 2017, 2020: Major updates introducing modern features (e.g., lambdas, smart pointers, ranges).

### Purpose

- Extend the power of C with object-oriented features and maintain backward compatibility.

---

## Writing Your First C++ Program

### Program Code

```cpp
#include <iostream>
using namespace std;

int main() {
    cout << "Welcome to the world of C++!" << endl;
    return 0;
}
```

### Explanation

1. **#include **: Includes the library for input and output.
2. **using namespace std**: Simplifies usage of `std` prefix for standard functions.
3. **main()**: Entry point of the program.
4. **cout**: Outputs data to the console.

### Steps to Compile and Run

1. Save the program as `hello.cpp`.
2. Open terminal/command prompt and compile:
   ```bash
   g++ hello.cpp -o hello
   ```
3. Run the program:
   ```bash
   ./hello
   ```
4. Output:
   ```
   Welcome to the world of C++!
   ```

# C++ Concepts and Features

## **1. C++ Program Structure**
A typical C++ program consists of the following components:

1. **Preprocessor Directives**: Begin with `#include` statements for libraries.
   ```cpp
   #include <iostream>
   using namespace std;
   ```

2. **Namespace Declaration**: Defines a scope to avoid name conflicts.
   ```cpp
   using namespace std;
   ```

3. **Function Declaration**: Declare all functions before they are used.
   ```cpp
   int add(int a, int b);
   ```

4. **Main Function**: The entry point of the program.
   ```cpp
   int main() {
       // Your code here
       return 0;
   }
   ```

5. **Other Components**: Function definitions, classes, and member functions.

---

## **2. Advanced C++ Concepts and Features of C++17**

### **Advanced Concepts:**
1. **Lambda Expressions**:
   Inline functions that can capture variables.
   ```cpp
   auto sum = [](int a, int b) { return a + b; };
   cout << sum(5, 3); // Output: 8
   ```

2. **Smart Pointers**:
   Automatic memory management (`unique_ptr`, `shared_ptr`).
   ```cpp
   unique_ptr<int> p = make_unique<int>(10);
   ```

3. **Templates**:
   Write generic and reusable code.
   ```cpp
   template <typename T>
   T add(T a, T b) { return a + b; }
   ```

### **New Features in C++17**:
1. **Structured Bindings**:
   Simplifies access to tuple or struct values.
   ```cpp
   auto [a, b] = make_pair(1, 2);
   cout << a << ", " << b; // Output: 1, 2
   ```

2. **std::optional**:
   Represents optional values.
   ```cpp
   optional<int> value = 42;
   if (value) cout << *value; // Output: 42
   ```

3. **if constexpr**:
   Compile-time branching.
   ```cpp
   if constexpr (sizeof(int) == 4) {
       cout << "32-bit int";
   }
   ```

---

## **3. C++ Tokens**
Tokens are the smallest units in a C++ program. They include:
1. **Keywords**: Reserved words like `int`, `return`.
2. **Identifiers**: Variable, function names.
3. **Literals**: Constants like `5`, `'a'`, `"hello"`.
4. **Operators**: Symbols like `+`, `-`, `*`.
5. **Punctuation**: Symbols like `{}`, `;`.
6. **Comments**: `// Single-line` or `/* Multi-line */`.

---

## **4. Initialization**
Initialization in C++ can be done in several ways:
1. **Direct Initialization**:
   ```cpp
   int a(10);
   ```

2. **Copy Initialization**:
   ```cpp
   int b = 20;
   ```

3. **List Initialization (C++11)**:
   ```cpp
   int c{30};
   ```

4. **Default Initialization**:
   ```cpp
   int d; // Uninitialized
   ```

---

## **5. Static Members**

- **Static Data Members**:
  Shared across all objects of a class.
  ```cpp
  class Counter {
      static int count;
  public:
      static void increment() { count++; }
  };

  int Counter::count = 0; // Definition
  ```

- **Static Member Functions**:
  Can access only static members.
  ```cpp
  Counter::increment();
  ```

---

## **6. Constant Members**
- Declared with `const` to prevent modification.
- Must be initialized using a constructor initializer list.
  ```cpp
  class Circle {
      const double PI;
  public:
      Circle() : PI(3.14159) {}
  };
  ```

---

## **7. Expressions**

- **Arithmetic Expressions**: Combine operators and operands.
  ```cpp
  int result = (a + b) * c;
  ```

- **Relational Expressions**: Compare values.
  ```cpp
  bool isEqual = (a == b);
  ```

- **Logical Expressions**: Combine boolean values.
  ```cpp
  if (a > b && b < c) { ... }
  ```

- **Unary Expressions**: Use single operands.
  ```cpp
  int x = -a;
  ```

---

## **Example Code**
```cpp
#include <iostream>
#include <memory>
#include <optional>
#include <tuple>
using namespace std;

class Demo {
    static int counter;
    const int ID;
public:
    Demo(int id) : ID(id) {
        counter++;
    }
    static int getCounter() {
        return counter;
    }
};

int Demo::counter = 0;

int main() {
    Demo d1(101), d2(102);
    cout << "Static Counter: " << Demo::getCounter() << endl;

    auto [x, y] = make_pair(5, 10);
    cout << "Structured Binding: " << x << ", " << y << endl;

    optional<int> optValue = 42;
    if (optValue) {
        cout << "Optional Value: " << *optValue << endl;
    }

    auto lambdaSum = [](int a, int b) { return a + b; };
    cout << "Lambda Result: " << lambdaSum(10, 20) << endl;

    return 0;
}
```
---

# Operators, Conditional Statements, Looping Statements, and Arrays in C++

## **1. Operators**

### **Arithmetic Operators**
Used to perform basic mathematical operations.

| Operator | Description       | Example          |
|----------|-------------------|------------------|
| `+`      | Addition          | `a + b`          |
| `-`      | Subtraction       | `a - b`          |
| `*`      | Multiplication    | `a * b`          |
| `/`      | Division          | `a / b`          |
| `%`      | Modulus (remainder)| `a % b`         |

#### Example:
```cpp
int a = 10, b = 3;
cout << "Sum: " << a + b << endl;
cout << "Remainder: " << a % b << endl;
```

---

### **Relational Operators**
Used to compare two values.

| Operator | Description      | Example         |
|----------|------------------|-----------------|
| `==`     | Equal to         | `a == b`        |
| `!=`     | Not equal to     | `a != b`        |
| `<`      | Less than        | `a < b`         |
| `>`      | Greater than     | `a > b`         |
| `<=`     | Less than or equal to | `a <= b` |
| `>=`     | Greater than or equal to | `a >= b` |

#### Example:
```cpp
int a = 5, b = 10;
cout << (a < b); // Output: 1 (true)
```

---

### **Logical Operators**
Used for logical expressions.

| Operator | Description      | Example              |
|----------|------------------|----------------------|
| `&&`     | Logical AND      | `(a > 0 && b > 0)`   |
| `||`     | Logical OR       | `(a > 0 || b < 0)`   |
| `!`      | Logical NOT      | `!(a > b)`           |

#### Example:
```cpp
bool x = true, y = false;
cout << (x && y); // Output: 0 (false)
```

---

### **Unary Operators**
Operate on a single operand.

| Operator | Description         | Example          |
|----------|---------------------|------------------|
| `+`      | Unary plus          | `+a`             |
| `-`      | Unary minus         | `-a`             |
| `++`     | Increment           | `++a` or `a++`   |
| `--`     | Decrement           | `--a` or `a--`   |
| `!`      | Logical NOT         | `!a`             |

---

### **Ternary Operator**
Short form for an `if-else` statement.
```cpp
condition ? expression1 : expression2;
```

#### Example:
```cpp
int a = 5, b = 10;
int max = (a > b) ? a : b;
cout << "Max: " << max;
```

---

### **Assignment Operators**
Used to assign values to variables.

| Operator | Description   | Example    |
|----------|---------------|------------|
| `=`      | Assign        | `a = b`    |
| `+=`     | Add and assign| `a += b`   |
| `-=`     | Subtract and assign | `a -= b` |
| `*=`     | Multiply and assign | `a *= b` |
| `/=`     | Divide and assign | `a /= b` |
| `%=`     | Modulus and assign | `a %= b` |

---

## **2. Conditional Statements**

### **if-else Statement**
```cpp
int a = 10;
if (a > 5) {
    cout << "a is greater than 5";
} else {
    cout << "a is less than or equal to 5";
}
```

---

### **else-if Statement**
```cpp
int a = 10;
if (a < 5) {
    cout << "a is less than 5";
} else if (a == 10) {
    cout << "a is 10";
} else {
    cout << "a is greater than 5 but not 10";
}
```

---

### **switch Statement**
```cpp
int choice = 2;
switch (choice) {
    case 1: cout << "Choice is 1"; break;
    case 2: cout << "Choice is 2"; break;
    default: cout << "Invalid choice";
}
```

---

## **3. Looping Statements**

### **for Loop**
```cpp
for (int i = 0; i < 5; i++) {
    cout << i << " ";
}
```

---

### **while Loop**
```cpp
int i = 0;
while (i < 5) {
    cout << i << " ";
    i++;
}
```

---

### **do-while Loop**
```cpp
int i = 0;
do {
    cout << i << " ";
    i++;
} while (i < 5);
```

---

## **4. Jump Statements**

### **break**
Exits the loop prematurely.
```cpp
for (int i = 0; i < 5; i++) {
    if (i == 3) break;
    cout << i << " ";
}
```

### **continue**
Skips the current iteration.
```cpp
for (int i = 0; i < 5; i++) {
    if (i == 3) continue;
    cout << i << " ";
}
```

### **return**
Exits a function and optionally returns a value.
```cpp
int add(int a, int b) {
    return a + b;
}
```

---

## **5. Arrays**

### **Declaration and Initialization**
```cpp
int arr[5] = {1, 2, 3, 4, 5}; // Declaration and initialization
```

### **Accessing Array Elements**
```cpp
cout << arr[0]; // Access first element
```

---

### **1-D Array**
```cpp
int arr[5] = {1, 2, 3, 4, 5};
for (int i = 0; i < 5; i++) {
    cout << arr[i] << " ";
}
```

---

### **2-D Array**
```cpp
int arr[2][3] = {{1, 2, 3}, {4, 5, 6}};
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        cout << arr[i][j] << " ";
    }
    cout << endl;
}
```
---



# Functions in C++

## **1. Different Forms of Functions**
Functions in C++ can take various forms depending on their use case:

### **a. Non-Parameterized Functions**
Functions that do not take any arguments.
```cpp
void display() {
    cout << "Hello, World!";
}
```

### **b. Parameterized Functions**
Functions that accept parameters to perform operations.
```cpp
int add(int a, int b) {
    return a + b;
}
```

### **c. Functions with Default Arguments**
Provide default values to parameters.
```cpp
void greet(string name = "User") {
    cout << "Hello, " << name;
}
```

### **d. Overloaded Functions**
Multiple functions with the same name but different parameters.
```cpp
int multiply(int a, int b) {
    return a * b;
}
double multiply(double a, double b) {
    return a * b;
}
```

### **e. Recursive Functions**
A function that calls itself.
```cpp
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

---

## **2. Function Prototyping**
A function prototype declares a function before defining it, ensuring type safety during calls.

### **Syntax**
```cpp
dataType functionName(parameters);
```

#### Example:
```cpp
int add(int, int); // Function prototype

int main() {
    cout << add(5, 10);
    return 0;
}

int add(int a, int b) { // Function definition
    return a + b;
}
```

---

## **3. Call by Reference**
Passing arguments by reference allows modification of the original values.

### **Syntax**
```cpp
#include <iostream>
using namespace std;

// Function to swap two integers using pass-by-reference
void swap(int &a, int &b) {
    int temp = a; // Temporary variable to hold the value of 'a'
    a = b;        // Assign 'b' to 'a'
    b = temp;     // Assign the temporary value to 'b'
}

int main() {
    int x = 10, y = 20; // Declare and initialize variables

    cout << "Before swapping:" << endl;
    cout << "x: " << x << ", y: " << y << endl;

    swap(x, y); // Call the swap function

    cout << "After swapping:" << endl;
    cout << "x: " << x << ", y: " << y << endl;

    return 0;
}

```

---

## **4. Inline Functions**
Inline functions are expanded at the point of invocation to reduce the overhead of function calls.

### **Syntax**
```cpp
inline int square(int x) {
    return x * x;
}
```

#### Example:
```cpp
cout << "Square of 5: " << square(5); // Output: Square of 5: 25
```

The compiler transforms it into:
```c
cout << "Square of 5: " << (5 * 5);
```

### **Advantages**
- Reduces function call overhead.
- Improves performance for small functions.

### **Disadvantages**
- Increases binary size for large functions.

---

## **5. Math Library Functions**
C++ provides a variety of mathematical functions in the `<cmath>` library.

### **Common Math Functions**

| Function       | Description                      | Example             |
|----------------|----------------------------------|---------------------|
| `sqrt(x)`      | Square root                     | `sqrt(25) -> 5`     |
| `pow(x, y)`    | Power (x^y)                    | `pow(2, 3) -> 8`    |
| `abs(x)`       | Absolute value                 | `abs(-10) -> 10`    |
| `ceil(x)`      | Rounds up to the nearest integer | `ceil(2.3) -> 3`    |
| `floor(x)`     | Rounds down to the nearest integer| `floor(2.7) -> 2`   |
| `sin(x)`       | Sine of angle (in radians)      | `sin(PI/2) -> 1`    |
| `cos(x)`       | Cosine of angle (in radians)    | `cos(0) -> 1`       |
| `log(x)`       | Natural logarithm              | `log(1) -> 0`       |

#### Example:
```cpp
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    cout << "Square root of 25: " << sqrt(25) << endl;
    cout << "2^3: " << pow(2, 3) << endl;
    cout << "Absolute value of -10: " << abs(-10) << endl;
    return 0;
}
```

---

# Memory Management in C++

## **1. Introduction to Memory Management in C++**
Memory management in C++ involves allocating and deallocating memory for program objects dynamically. It ensures efficient use of resources and prevents memory leaks.

### **Types of Memory in C++**
1. **Stack Memory**:
   - Used for local variables.
   - Automatically managed (allocated and deallocated when function calls are made).

2. **Heap Memory**:
   - Used for dynamically allocated variables.
   - Requires manual allocation (`new`) and deallocation (`delete`).

---

## **2. Pointers in C++**
A pointer is a variable that stores the memory address of another variable.

### **Syntax**
```cpp
int *ptr;
ptr = &var; // Store address of 'var' in 'ptr'
```

### **Example**
```cpp
int a = 10;
int *p = &a;
cout << "Value of a: " << *p << endl; // Dereference pointer
// Value of a: 10 
```

---

## **3. Arrays Using Pointers**
Arrays can be manipulated using pointers, as arrays decay to pointers when passed to functions.

### **Example**
```cpp
int arr[3] = {1, 2, 3};
int *p = arr;
for (int i = 0; i < 3; i++) {
    cout << *(p + i) << " "; // Access elements using pointer arithmetic
}
```

---

## **4. Enumeration**
An enumeration (`enum`) is a user-defined type that assigns names to integral constants.

### **Syntax**
```cpp
enum Color { RED, GREEN, BLUE };
```

### **Example**
```cpp
enum Days { MON, TUE, WED };
Days today = MON;
if (today == MON) {
    cout << "It's Monday!";
}
```

---

## **5. Typedef**
`typedef` is used to define a new name for an existing type.

### **Syntax**
```cpp
typedef existing_type new_name;
```

### **Example**
```cpp
typedef unsigned int uint;
uint age = 25;
```

---

## **6. Using `new` Operator**
The `new` operator allocates memory dynamically on the heap.

### **Syntax**
```cpp
dataType *pointer = new dataType;
```

### **Example**
```cpp
int *p = new int(10);
cout << *p; // Output: 10
```

For arrays:
```cpp
int *arr = new int[5];
for (int i = 0; i < 5; i++) arr[i] = i * 10;
delete[] arr; // Free memory
```

---

## **7. Class Pointer**
Pointers can be used to create and manage objects dynamically.

### **Example**
```cpp
class Person {
public:
    string name;
    Person(string n) : name(n) {}
    void display() {
        cout << "Name: " << name << endl;
    }
};

Person *p = new Person("John");
p->display();       //Output = Name: John
delete p;
```

---

## **8. `this` Pointer**
The `this` pointer is an implicit pointer passed to member functions of a class. It points to the calling object.

### **Example**
```cpp
class Person {
    string name;
public:
    Person(string name) { this->name = name; }
    void display() {
        cout << "Name: " << this->name << endl;
    }
};
```

---

## **9. Comparison of `new` with `malloc`, `calloc`, and `realloc`**

| Feature               | `new`           | `malloc`         | `calloc`         | `realloc`        |
|-----------------------|-----------------|------------------|------------------|------------------|
| Memory allocation     | Dynamically     | Dynamically      | Dynamically      | Dynamically      |
| Initialization        | Yes (constructor)| No               | Zero-initialized | No               |
| Type safety           | Yes             | No               | No               | No               |
| Syntax                | Operator        | Function         | Function         | Function         |
| Requires `delete`     | Yes             | No (uses "free (obj name)")               | No (uses "free (obj name)")               | No (uses "free (obj name)")              |

### Example Comparison:
```cpp
int *p1 = new int(5);    // Allocates memory and initializes with 5
int *p2 = (int*)malloc(sizeof(int)); // Only allocates memory, no initialization
```

---

## **10. Memory Freeing Using `delete` Operator**
The `delete` operator deallocates memory allocated by `new`.

### **Syntax**
```cpp
delete pointer;       // For single variables
delete[] pointer;     // For arrays
```

### **Example**
```cpp
int *p = new int(10);
delete p;

int *arr = new int[5];
delete[] arr;
```

---

# Object-Oriented Programming (OOP) Concepts in C++

## **1. Introduction to Object-Oriented Concepts**
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which contain data (attributes) and methods (functions). OOP aims to model real-world systems by breaking them into smaller, manageable entities.

### **Key Concepts of OOP**:
1. **Encapsulation**: Wrapping data and methods together in a single unit (class).
2. **Abstraction**: Hiding internal details and showing only the required functionality.
3. **Inheritance**: Reusing existing code by deriving new classes from existing ones.
4. **Polymorphism**: The ability to take multiple forms, often achieved through method overloading or overriding.

---

## **2. Classes and Objects**
- **Class**: A blueprint for creating objects. It defines attributes (data members) and methods (member functions).
- **Object**: An instance of a class.

### **Syntax**
```cpp
class ClassName {
public:
    int data; // Attribute
    void display() { // Method
        cout << "Data: " << data << endl;
    }
};

int main() {
    ClassName obj; // Create an object
    obj.data = 10;
    obj.display();
    return 0;
}
```

---

## **3. Access Specifiers**
Access specifiers define the accessibility of class members.

| Specifier  | Description                                    |
|------------|------------------------------------------------|
| `public`   | Accessible from anywhere in the program.       |
| `private`  | Accessible only within the class.              |
| `protected`| Accessible within the class and derived classes.|

#### Example:
```cpp
class Example {
private:
    int privateData;
protected:
    int protectedData;
public:
    int publicData;
};
```

---

## **4. Overloading**

### **Function Overloading**
Functions with the same name but different parameter lists.

#### Example:
```cpp
class Math {
public:
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
};
```

### **Operator Overloading**
- Extending the functionality of operators.
- We can define operator function using 2 ways:
    Member function
    Non member function
- By defining operator function, we are increasing capability of exsiting operators. This process of givining extension to the meaning of the operator is called as operator overloading.
- Using operator overloading we can not create user defined operators rather we can increase capability of existing operators.

### Example: Addition (+) Operator Overloading using member function

```c
#include<iostream>
using namespace std;
class Test{
private:
  int Num1;
  int Num2;
public:
Test( void ){
  this->Num1 = 0;
  this->Num2 = 0;
}
Test( int Num1, int Num2 ){
  this->Num1 = Num1;
  this->Num2 = Num2;
}
//Test other = t2
//Test *const this = &t1
Test operator+( Test other ){
  Test result;
  result.Num1 = this->Num1 + other.Num1;
  result.Num2 = this->Num2 + other.Num2;
  return result;
}
void printRecord( void ){
  cout << "Num1 Number : " << this->Num1 <<endl;
  cout << "Num2 Number : " << this->Num2 <<endl;
}
};
int main( void ){
  Test t1( 10, 20 );
  Test t2( 30, 40 );
  Test t3;
  t3 = t1 + t2; // t3 = t1.operator+( t2 )
  t3.printRecord( );
  return 0;
}
```
### Example: Addition (+) Operator Overloading using non member function

```c
#include<iostream>
using namespace std;
class Test{
private:
  int Num1;
  int Num2;
public:
Test( void ){
  this->Num1 = 0;
  this->Num2 = 0;
}
Test( int Num1, int Num2 ){
  this->Num1 = Num1;
  this->Num2 = Num2;
}
void printRecord( void ){
  cout << "Num1 Number : " << this->Num1 <<endl;
  cout << "Num2 Number : " << this->Num2 <<endl;
}
friend Test operator+( Test t1, Test t2 );
};
Test operator+( Test t1, Test t2 ){
  Test result;
  result.Num1 = t1.Num1 + t2.Num1;
  result.Num2 = t1.Num2 + t2.Num2;
  return result;
}
int main( void ){
  Test t1( 10, 20 );
  Test t2( 30, 40 );
  Test t3;
  t3 = t1 + t2; // t3 = operator+( t1, t2 )
  t3.printRecord( );
  return 0;
}
```

## Operators That Can Be Overloaded

| **Category**             | **Operators**                             | **Notes**                                       |
|--------------------------|-------------------------------------------|------------------------------------------------|
| Arithmetic Operators      | `+`, `-`, `*`, `/`, `%`                  | Used for arithmetic operations.                |
| Relational Operators      | `==`, `!=`, `<`, `>`, `<=`, `>=`         | Used for comparison between objects.           |
| Logical Operators         | `&&`, `||`, `!`                          | Used for custom boolean logic.                 |
| Bitwise Operators         | `&`, `|`, `^`, `~`, `<<`, `>>`           | Used for bitwise manipulation.                 |
| Assignment Operators      | `=`, `+=`, `-=`, `*=`, `/=`, `%=`        | Used for custom assignment operations.         |
|                          | `<<=`, `>>=`, `&=`, `|=`, `^=`            | Compound assignment operators.                 |
| Unary Operators           | `+`, `-`, `++`, `--`, `*`, `&`           | Used for unary operations like increment/decrement. |
| Subscript Operator        | `[]`                                     | Enables array-like behavior for objects.       |
| Function Call Operator    | `()`                                     | Makes objects callable like functions.         |
| Member Access Operator    | `->`                                     | Custom pointer-like behavior.                  |
| Dereference Operator      | `*`                                      | Custom dereferencing.                          |
| Comma Operator            | `,`                                      | Enables sequential operations.                 |
| New and Delete Operators  | `new`, `delete`, `new[]`, `delete[]`     | Custom memory management.                      |
| Type Conversion Operators | Custom type conversion                   | Enables object conversion to another type.     |

---

## Operators That Cannot Be Overloaded

| **Operator**           | **Symbol**   | **Reason**                                       |
|-------------------------|--------------|-------------------------------------------------|
| Scope Resolution        | `::`         | Used to access class or namespace members.      |
| Pointer-to-Member Access| `.*`         | Access class members using pointers.            |
| Member Access           | `.`          | Directly accesses object members.               |
| Sizeof Operator         | `sizeof`     | Determines the size of a type or object.        |
| Conditional Operator    | `? :`        | Used for conditional expressions.               |
| Typeid Operator         | `typeid`     | Retrieves runtime type information.             |
| Alignof Operator        | `alignof`    | Gets alignment requirements of a type.          |
| Coroutine Operator      | `co_await`   | Used in coroutine implementations. 
```
```
## **5. Inheritance**
Inheritance allows a class (child) to acquire properties and methods of another class (parent).

### **Types of Inheritance**:
1. **Single Inheritance**
2. **Multilevel Inheritance**
3. **Multiple Inheritance**

#### Example:
```cpp
class Parent {
public:
    void display() {
        cout << "Parent Class" << endl;
    }
};

class Child : public Parent {
};

int main() {
    Child obj;
    obj.display(); // Access Parent's method
    return 0;
}
```

---

## **6. Polymorphism**
Polymorphism allows functions or methods to behave differently based on the context.

### **Types**:
1. **Compile-time Polymorphism (Static)**: Achieved through function and operator overloading.
2. **Runtime Polymorphism (Dynamic)**: Achieved through method overriding and virtual functions.

#### Virtual Functions Example:
```cpp
class Base {
public:
    virtual void show() {
        cout << "Base Class" << endl;
    }
};

class Derived : public Base {
public:
    void show() override {
        cout << "Derived Class" << endl;
    }
};

int main() {
    Base *bptr;
    Derived d;
    bptr = &d;
    bptr->show(); // Output: Derived Class
    return 0;
}
```

---

## **7. Namespaces**
Namespaces are used to group identifiers to avoid name conflicts.

### **Syntax**
```cpp
namespace NamespaceName {
    int data;
    void display() {
        cout << "Namespace Function";
    }
}

int main() {
    NamespaceName::data = 10;
    NamespaceName::display();
    return 0;
}
```

### **`using` Keyword**
To avoid specifying the namespace repeatedly.
```cpp
#include <iostream>

// Define a namespace
namespace NamespaceName {
    int data; // Namespace variable
    void display() { // Namespace function
        std::cout << "Namespace Function" << std::endl;
    }
}

int main() {
    // Use the `using` keyword to avoid prefixing `NamespaceName::`
    using namespace NamespaceName;

    data = 10;      // Directly access the `data` variable from the namespace
    display();      // Directly call the `display` function from the namespace

    return 0;
}

```

---

# Constructors and Destructors in C++

## **1. Constructors**
A constructor is a special member function in a class that initializes objects of the class. It is automatically invoked when an object is created.

### **Key Features**
- Same name as the class.
- No return type (not even `void`).

### **Syntax**
```cpp
class ClassName {
public:
    ClassName() {
        // Constructor body
    }
};
```

#### Example:
```cpp
class Example {
public:
    Example() {
        cout << "Constructor called!" << endl;
    }
};

int main() {
    Example obj; // Constructor is invoked automatically
    return 0;
}
```

---

## **2. Parameterized Constructors**
Constructors that accept arguments to initialize objects with specific values.

### **Syntax**
```cpp
class ClassName {
public:
    ClassName(dataType arg1, dataType arg2) {
        // Initialization
    }
};
```

#### Example:
```cpp
class Rectangle {
    int length, breadth;
public:
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    void display() {
        cout << "Area: " << length * breadth << endl;
    }
};

int main() {
    Rectangle rect(10, 5); // Parameterized constructor
    rect.display();
    return 0;
}
```

---

## **3. Multiple Constructors in a Class**
A class can have multiple constructors with different parameter lists (constructor overloading).

#### Example:
```cpp
class Box {
    int height, width;
public:
    Box() { // Default constructor
        height = width = 0;
    }
    Box(int h) { // Single parameter constructor
        height = width = h;
    }
    Box(int h, int w) { // Parameterized constructor
        height = h;
        width = w;
    }
    void display() {
        cout << "Height: " << height << ", Width: " << width << endl;
    }
};

int main() {
    Box b1;
    Box b2(5);
    Box b3(10, 15);

    b1.display();
    b2.display();
    b3.display();
    return 0;
}
```

---

## **4. Dynamic Initialization of Objects**
Objects can be initialized dynamically during runtime using constructors.

#### Example:
```cpp
class Circle {
    double radius;
public:
    Circle(double r) {
        radius = r;
    }
    void display() {
        cout << "Area: " << 3.14 * radius * radius << endl;
    }
};

int main() {
    double r;
    cout << "Enter radius: ";
    cin >> r;
    Circle c(r); // Dynamic initialization
    c.display();
    return 0;
}
```

---

## **5. Copy Constructor**
A copy constructor creates a new object by copying an existing object. It is automatically invoked during object copying.

### **Syntax**
```cpp
ClassName(const ClassName &obj);
```

#### Example:
```cpp
class Person {
    string name;
public:
    Person(string n) { // Parameterized constructor
        name = n;
    }
    Person(const Person &p) { // Copy constructor
        name = p.name;
    }
    void display() {
        cout << "Name: " << name << endl;
    }
};

int main() {
    Person p1("Alice");
    Person p2 = p1; // Copy constructor is called
    p2.display();
    return 0;
}
```

---

## **6. Destructor**
A destructor is a special member function that destroys objects of a class. It is automatically invoked when an object goes out of scope.

### **Key Features**
- Same name as the class, preceded by a `~`.
- No return type and no arguments.

### **Syntax**
```cpp
class ClassName {
public:
    ~ClassName() {
        // Destructor body
    }
};
```

#### Example:
```cpp
class Demo {
public:
    Demo() {
        cout << "Constructor called!" << endl;
    }
    ~Demo() {
        cout << "Destructor called!" << endl;
    }
};

int main() {
    Demo obj; // Constructor is called
    return 0; // Destructor is automatically called
}
```

---

### **Key Differences: Constructor vs Destructor**
| Feature       | Constructor             | Destructor            |
|---------------|-------------------------|-----------------------|
| Invocation    | Automatically invoked when object is created. | Automatically invoked when object is destroyed. |
| Naming        | Same name as class.     | Same name as class, preceded by `~`. |
| Arguments     | Can take arguments.     | Cannot take arguments. |
| Purpose       | Initializes the object. | Cleans up resources.  |

---

# Inheritance in C++

## **1. Types of Inheritance**
Inheritance in C++ allows a class (derived class) to acquire the properties and behaviors of another class (base class). The types of inheritance include:

1. **Single Inheritance**
2. **Multiple Inheritance**
3. **Multilevel Inheritance**
4. **Hierarchical Inheritance**
5. **Hybrid Inheritance**

---

## **2. Single Inheritance**
In single inheritance, a derived class inherits from a single base class.

### **Syntax**
```cpp
class Base {
    // Base class members
};
class Derived : public Base {
    // Derived class members
};
```

### **Example**
```cpp
class Parent {
public:
    void display() {
        cout << "This is the Parent class." << endl;
    }
};

class Child : public Parent {
};

int main() {
    Child obj;
    obj.display();
    return 0;
}
```

---

## **3. Multiple Inheritance**
A derived class inherits from two or more base classes.

### **Syntax**
```cpp
class Base1 {
    // Base1 class members
};
class Base2 {
    // Base2 class members
};
class Derived : public Base1, public Base2 {
    // Derived class members
};
```

### **Example**
```cpp
class Parent1 {
public:
    void display1() {
        cout << "This is Parent1." << endl;
    }
};

class Parent2 {
public:
    void display2() {
        cout << "This is Parent2." << endl;
    }
};

class Child : public Parent1, public Parent2 {
};

int main() {
    Child obj;
    obj.display1();
    obj.display2();
    return 0;
}
```

---

## **4. Multilevel Inheritance**
In multilevel inheritance, a derived class inherits from another derived class.

### **Syntax**
```cpp
class Base {
    // Base class members
};
class Intermediate : public Base {
    // Intermediate class members
};
class Derived : public Intermediate {
    // Derived class members
};
```

### **Example**
```cpp
class GrandParent {
public:
    void display1() {
        cout << "This is GrandParent." << endl;
    }
};

class Parent : public GrandParent {
public:
    void display2() {
        cout << "This is Parent." << endl;
    }
};

class Child : public Parent {
};

int main() {
    Child obj;
    obj.display1();
    obj.display2();
    return 0;
}
```

---

## **5. Hierarchical Inheritance**
In hierarchical inheritance, multiple derived classes inherit from a single base class.

### **Syntax**
```cpp
class Base {
    // Base class members
};
class Derived1 : public Base {
    // Derived1 class members
};
class Derived2 : public Base {
    // Derived2 class members
};
```

### **Example**
```cpp
class Parent {
public:
    void display() {
        cout << "This is the Parent class." << endl;
    }
};

class Child1 : public Parent {
};

class Child2 : public Parent {
};

int main() {
    Child1 obj1;
    Child2 obj2;
    obj1.display();
    obj2.display();
    return 0;
}
```

---

## **6. Hybrid Inheritance**
Hybrid inheritance is a combination of two or more types of inheritance.

### **Example**
```cpp
class Parent {
public:
    void displayParent() {
        cout << "This is Parent." << endl;
    }
};

class Child1 : public Parent {
public:
    void displayChild1() {
        cout << "This is Child1." << endl;
    }
};

class Child2 : public Parent {
public:
    void displayChild2() {
        cout << "This is Child2." << endl;
    }
};

class GrandChild : public Child1, public Child2 {
};

int main() {
    GrandChild obj;
    obj.displayChild1();                          //This is Child1.
    obj.displayChild2();                          //This is Child2.
    obj.displayParent();                          // Error, due to ambiguity between child1 instance or child2 instance
    obj.Child1::displayParent();                  //This is Parent.
    obj.Child2::displayParent();                  //This is Parent.

    return 0;
}
```

---

## **7. Virtual Base Class**
A virtual base class prevents multiple "instances" of a base class in the inheritance hierarchy.

### **Example**
```cpp
 
#include <iostream>
using namespace std;
#include <iostream>
using namespace std;

class Base {
public:
    virtual void display() { // Mark as virtual for overriding
        cout << "This is the Base class." << endl;
    }
};

class Derived1 : virtual public Base {
public:
    void display() override { // Correctly overrides Base's display
        cout << "This is Derived1." << endl;
    }
};

class Derived2 : virtual public Base {
public:
    void display() override { // Correctly overrides Base's display
        cout << "This is Derived2." << endl;
    }
};

class FinalDerived : public Derived1, public Derived2 {
public:
    void display() override { // Explicitly resolve ambiguity
        cout << "This is FinalDerived." << endl;
    }
};

int main() {
    FinalDerived obj;
    obj.display(); // Calls FinalDerived's display
    obj.Derived1::display();
     obj.Derived2::display();
    return 0;
}

```

---

## **8. Constructors in Derived Class**
When a derived class object is created, the base class constructor is called first, followed by the derived class constructor.

### **Example**
```cpp
class Base {
public:
    Base() {
        cout << "Base class constructor called." << endl;
    }
};

class Derived : public Base {
public:
    Derived() {
        cout << "Derived class constructor called." << endl;
    }
};

int main() {
    Derived obj;
    return 0;
}
```

---

### **Order of Constructor Calls in Multilevel Inheritance**
1. Base class constructor is called first.
2. Intermediate class constructor is called next.
3. Finally, the derived class constructor is called.

#### Example:
```cpp
class A {
public:
    A() { cout << "Constructor of A." << endl; }
};

class B : public A {
public:
    B() { cout << "Constructor of B." << endl; }
};

class C : public B {
public:
    C() { cout << "Constructor of C." << endl; }
};

int main() {
    C obj;
    return 0;
}
```

---
### Constructor & Destructor calling sequesce
```c
#include <iostream>
using namespace std;

class Base {
public:
    Base() {
        cout << "Base class constructor called." << endl;
    }
    virtual ~Base() {
        cout << "Base class destructor called." << endl;
    }
};

class Derived1 : public Base {
public:
    Derived1() {
        cout << "Derived1 class constructor called." << endl;
    }
    ~Derived1() {
        cout << "Derived1 class destructor called." << endl;
    }
};

class Derived2 : public Derived1 {
public:
    Derived2() {
        cout << "Derived2 class constructor called." << endl;
    }
    ~Derived2() {
        cout << "Derived2 class destructor called." << endl;
    }
};

int main() {
    cout << "Creating object of Derived2:" << endl;
    Derived2 obj;  // Constructor sequence will be called
    cout << "Object of Derived2 goes out of scope:" << endl;
    return 0;      // Destructor sequence will be called

}
/*
Creating object of Derived2:
Base class constructor called.
Derived1 class constructor called.
Derived2 class constructor called.
Object of Derived2 goes out of scope:
Derived2 class destructor called.
Derived1 class destructor called.
Base class destructor called.
*/

```
```

```
# Polymorphism and Related Concepts in C++

## **1. Types of Polymorphism**
Polymorphism in C++ allows entities like functions or operators to take multiple forms. It is classified into:

### **Compile-time Polymorphism**
1. Achieved through **function overloading** and **operator overloading**.
2. The decision about which function or operator to invoke is made at compile time.

### **Run-time Polymorphism**
1. Achieved through **method overriding** using virtual functions.
2. The decision about which method to call is made during runtime.

---

## **2. Overloading Functions**
Function overloading allows multiple functions with the same name but different parameter lists.

### **Example**
```cpp
#include <iostream>
using namespace std;

class Math {
public:
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
};

int main() {
    Math obj;
    cout << "Sum (int, int): " << obj.add(10, 20) << endl;
    cout << "Sum (double, double): " << obj.add(5.5, 4.5) << endl;
    cout << "Sum (int, int, int): " << obj.add(1, 2, 3) << endl;
    return 0;
}
```

---

## **3. Overloading Operators**
Operator overloading allows redefining the behavior of operators for user-defined types.

### **Example: Overloading `+` Operator**
```cpp
#include <iostream>
using namespace std;

class Complex {
    int real, imag;
public:
    Complex(int r = 0, int i = 0) : real(r), imag(i) {}

    // Overload + operator
    Complex operator + (const Complex &obj) {
        return Complex(real + obj.real, imag + obj.imag);
    }

    void display() {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main() {
    Complex c1(3, 4), c2(1, 2);
    Complex c3 = c1 + c2; // Using overloaded + operator
    c3.display();
    return 0;
}
```

---

## **4. Friend Functions**
Friend functions allow external functions to access private and protected members of a class.

### **Example**
```cpp
#include <iostream>
using namespace std;

class Box {
    int width;
public:
    Box(int w) : width(w) {}
    friend void displayWidth(Box b); // Friend function declaration
};

void displayWidth(Box b) {
    cout << "Width: " << b.width << endl; // Access private member
}

int main() {
    Box box(10);
    displayWidth(box);
    return 0;
}
```

---

## **5. Constant Functions**
Constant functions are member functions that do not modify the state of the object. They are declared using the `const` keyword.

### **Syntax**
```cpp
dataType functionName() const;
```

### **Example**
```cpp
#include <iostream>
using namespace std;

class Circle {
    double radius;
public:
    Circle(double r) : radius(r) {}

    double getRadius() const {
        return radius; // Function does not modify the state
    }
};

int main() {
    Circle c(5.0);
    cout << "Radius: " << c.getRadius() << endl;
    return 0;
}
```

---


# Advanced Polymorphism and Type Casting in C++

## **1. Run Time Polymorphism**
Run-time polymorphism is achieved through method overriding using virtual functions. The method to be invoked is determined at runtime based on the type of the object being pointed to by the base class pointer.

### **Key Features**:
- Achieved via **virtual functions**.
- Requires a base class pointer or reference pointing to a derived class object.

### **Example**
```cpp
#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() { // Virtual function
        cout << "Base class show()" << endl;
    }
};

class Derived : public Base {
public:
    void show() override {
        cout << "Derived class show()" << endl;
    }
};

int main() {
    Base *bptr;
    Derived d;
    bptr = &d;
    bptr->show(); // Calls Derived class's show()
    return 0;
}
```

---

## **2. Virtual Functions and Pure Virtual Functions**

### **Virtual Functions**
- A virtual function is a function in a base class that can be overridden in a derived class.
- Declared using the `virtual` keyword.

### **Pure Virtual Functions**
- A pure virtual function is a function that has no definition in the base class.
- It is declared by assigning `0` in the base class.
- Classes containing at least one pure virtual function become **abstract classes**.

### **Example**: Pure Virtual Function
```cpp
#include <iostream>
using namespace std;

class Shape {
public:
    virtual void draw() = 0; // Pure virtual function
};

class Circle : public Shape {
public:
    void draw() override {
        cout << "Drawing Circle" << endl;
    }
};

int main() {
    Shape *shape = new Circle();
    shape->draw();
    delete shape;
    return 0;
}
```

### Combination of Virtual Function & Pure Virtual Function
```c
#include <iostream>
using namespace std;

class Base {
public:
    virtual void display() = 0;  // Pure virtual function
    virtual void show() {        // Virtual function with definition
        cout << "Base::show" << endl;
    }
};

class Derived : public Base {
public:
    void display() override {  // Override pure virtual function
        cout << "Derived::display" << endl;
    }
};

int main() {
    // Base base; // Error: Cannot instantiate an abstract class
    Derived derived;
    derived.display();  // Output: Derived::display
    derived.show();     // Output: Base::show
    return 0;
}
```
---

## **3. Type Casting in C++**
C++ provides four types of type casting:

### **a. `dynamic_cast`**
- Used for safe downcasting of pointers and references in polymorphic hierarchies.
- Requires the base class to have at least one virtual function.

#### Example:
```cpp
#include <iostream>
using namespace std;

class Base {
public:
    virtual ~Base() {}  // Virtual destructor for RTTI
};

class Derived : public Base {};

int main() {
    Base *bptr = new Derived();
    Derived *dptr = dynamic_cast<Derived*>(bptr);
    if (dptr) {
        cout << "Downcasting successful" << endl;
    } else {
        cout << "Downcasting failed" << endl;
    }
    delete bptr;
    return 0;
}

```

### **b. `static_cast`**
- Used for compile-time type checking.
- Can perform conversions between related types, such as `int` to `float` or base to derived.

#### Example:
```cpp
int a = 10;
double b = static_cast<double>(a);
cout << b; // Output: 10.0
```

### **c. `const_cast`**
- Used to cast away the `const` qualifier from a variable.

#### Example:
```cpp
const int x = 10;
int &y = const_cast<int&>(x);
y = 20;
cout << x << " " << y; // Output may be undefined (UB).
```

### **d. `reinterpret_cast`**
- Used for low-level, unsafe type casting (e.g., converting pointers to unrelated types).

#### Example:
```cpp
int a = 10;
void *ptr = &a;
int *iptr = reinterpret_cast<int*>(ptr);
cout << *iptr; // Output: 10
```

---

## **4. Interfaces**
An interface in C++ is implemented using **abstract classes**. An abstract class with only pure virtual functions serves as an interface.

### **Example**
```cpp
#include <iostream>
using namespace std;

class IShape { // Interface
public:
    virtual void draw() = 0; // Pure virtual function
    virtual ~IShape() {}     // Virtual destructor
};

class Rectangle : public IShape {
public:
    void draw() override {
        cout << "Drawing Rectangle" << endl;
    }
};

int main() {
    IShape *shape = new Rectangle();
    shape->draw();
    delete shape;
    return 0;
}
```

---

## **5. Abstract Classes**
An abstract class is a class that cannot be instantiated and is meant to be inherited. It typically contains at least one pure virtual function.

### **Example**
```cpp
#include <iostream>
using namespace std;

class AbstractBase {
public:
    virtual void display() = 0; // Pure virtual function
    void commonFunction() {
        cout << "Common functionality" << endl;
    }
};

class ConcreteClass : public AbstractBase {
public:
    void display() override {
        cout << "Implementation of display" << endl;
    }
};

int main() {
    AbstractBase *obj = new ConcreteClass();
    obj->display();
    obj->commonFunction();
    delete obj;
    return 0;
}
```

---

# Exception Handling in C++

## **1. Introduction to Exception Handling**
Exception handling in C++ provides a mechanism to handle runtime errors or exceptions in a program. The primary objective is to ensure that the program does not terminate abruptly and can handle errors gracefully.

### **Key Components**:
1. **`try` block**: Contains the code that might throw an exception.
2. **`throw` statement**: Used to throw an exception.
3. **`catch` block**: Used to handle the exception.

---

## **2. Exception Handling: Throwing, Catching, and Re-throwing**

### **a. Throwing Exceptions**
The `throw` keyword is used to signal that an exception has occurred.

#### Example:
```cpp
#include <iostream>
using namespace std;

void divide(int a, int b) {
    if (b == 0) {
        throw "Division by zero error!";
    }
    cout << "Result: " << a / b << endl;
}

int main() {
    try {
        divide(10, 0);
    } catch (const char *msg) {
        cout << "Exception: " << msg << endl;
    }
    return 0;
}
```

### **b. Catching Exceptions**
The `catch` block is used to handle exceptions thrown in the `try` block. Each `catch` block is associated with a specific exception type.

#### Example:
```cpp
try {
    throw 42;
} catch (int e) {
    cout << "Caught an integer exception: " << e << endl;
}
```

### **c. Re-throwing Exceptions**
An exception can be re-thrown from a `catch` block using the `throw;` statement. This allows the exception to propagate to an outer `try-catch` block.

#### Example:
```cpp
void function() {
    try {
        throw "An error occurred!";
    } catch (const char *msg) {
        cout << "Caught inside function, re-throwing..." << endl;
        throw; // Re-throw exception
    }
}

int main() {
    try {
        function();
    } catch (const char *msg) {
        cout << "Caught in main: " << msg << endl;
    }
    return 0;
}
```

---

## **3. Specifying Exceptions**
In C++, the `throw` specifier can be used to specify which exceptions a function might throw. However, this feature is deprecated in C++11 and removed in C++17.

### **Syntax**
```cpp
void function() throw(type1, type2);
```

### **Example**
```cpp
void function() throw(int, char) {
    throw 42; // Can throw an int or char
}

int main() {
    try {
        function();
    } catch (int e) {
        cout << "Caught exception: " << e << endl;
    }
    return 0;
}
```

### Modern Alternative:
Instead of `throw`, use **`noexcept`** to indicate that a function does not throw exceptions.

#### Example:
```cpp
void function() noexcept {
    cout << "This function does not throw exceptions." << endl;
}
```

---

## **4. Catch-All Handlers**
C++ provides a catch-all handler that can catch exceptions of any type.

### **Syntax**
```cpp
catch (...) {
    // Handle any exception
}
```

#### Example:
```cpp
try {
    throw 3.14;
} catch (...) {
    cout << "Caught an unknown exception!" << endl;
}
```

---

## **5. Nested Try-Catch Blocks**
C++ allows nesting of `try-catch` blocks for handling exceptions at different levels.

#### Example:
```cpp
try {
    try {
        throw "Nested exception!";
    } catch (const char *msg) {
        cout << "Caught inside nested try-catch: " << msg << endl;
        throw; // Re-throw exception
    }
} catch (...) {
    cout << "Caught outside nested try-catch." << endl;
}
```

---

# Managing Console I/O Operations in C++

## **1. Introduction**
Console Input/Output (I/O) operations in C++ are managed using streams. Streams provide a standard way to perform input (reading data) and output (writing data) in a program. The `<iostream>` header defines the basic classes and objects for handling I/O operations.

### **Key Points**:
- **Input**: Using `std::cin` to read data from the keyboard.
- **Output**: Using `std::cout` to write data to the console.
- **Error Messages**: Using `std::cerr` for error output.
- **Log Messages**: Using `std::clog` for logging.

---

## **2. C++ Streams**
Streams in C++ represent a sequence of bytes for input or output.

### **Types of Streams**:
1. **Input Streams**: Used for reading data (e.g., `std::cin`).
2. **Output Streams**: Used for writing data (e.g., `std::cout`).
3. **Bidirectional Streams**: Used for both input and output (e.g., `fstream` in file handling).

### **Predefined Stream Objects**:
| Object   | Description                    |
|----------|--------------------------------|
| `std::cin` | Standard input stream (keyboard). |
| `std::cout`| Standard output stream (console). |
| `std::cerr`| Unbuffered error stream.         |
| `std::clog`| Buffered error stream.           |

#### Example:
```cpp
#include <iostream>
using namespace std;

int main() {
    int age;
    cout << "Enter your age: ";
    cin >> age;
    cout << "You entered: " << age << endl;
    return 0;
}
```

---

## **3. C++ Stream Classes**
C++ provides several classes in the `<iostream>` header for managing I/O operations.

| Class       | Description                                   |
|-------------|-----------------------------------------------|
| `istream`   | Base class for input stream.                  |
| `ostream`   | Base class for output stream.                 |
| `iostream`  | Derived class for bidirectional streams.       |
| `ifstream`  | Input file stream.                            |
| `ofstream`  | Output file stream.                           |
| `fstream`   | Input and output file stream.                 |

---

## **4. Unformatted I/O Operations**
Unformatted I/O operations deal with data as raw sequences of bytes without formatting.

### **Key Functions**:
1. `get()`: Reads a single character.
2. `getline()`: Reads an entire line.
3. `put()`: Outputs a single character.
4. `write()`: Outputs raw byte data.

#### Example:
```cpp
#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin.get(ch);
    cout << "You entered: ";
    cout.put(ch);
    cout << endl;

    return 0;
}
```

---

## **5. Formatted I/O Operations**
Formatted I/O operations allow reading and writing data in a structured or formatted way.

### **Using Stream Insertion (`<<`) and Extraction (`>>`) Operators**:
These operators automatically format data based on the data type.

#### Example:
```cpp
#include <iostream>
using namespace std;

int main() {
    int a;
    double b;

    cout << "Enter an integer and a double: ";
    cin >> a >> b;

    cout << "Integer: " << a << ", Double: " << b << endl;
    return 0;
}
```

---

## **6. Managing Output with Manipulators**
Manipulators are used to control the formatting of output.

### **Common Manipulators** (from `<iomanip>`):
| Manipulator   | Description                             |
|---------------|-----------------------------------------|
| `setw(n)`     | Sets the width of the output field.     |
| `setprecision(n)`| Sets the number of digits for floating-point output. |
| `setfill(c)`  | Fills empty spaces with character `c`.  |
| `fixed`       | Displays floating-point numbers in fixed-point notation. |
| `scientific`  | Displays floating-point numbers in scientific notation. |
| `hex`, `oct`, `dec` | Displays integers in hexadecimal, octal, or decimal format. |

#### Example:
```cpp
#include <iostream>
#include <iomanip> // Required for manipulators
using namespace std;

int main() {
    cout << setw(10) << setfill('-') << 123 << endl; // Output: -------123
    cout << fixed << setprecision(2) << 3.14159 << endl; // Output: 3.14
    cout << hex << 255 << endl; // Output: ff (hexadecimal)
    return 0;
}
```

---

# File Handling in C++

## **1. Definition of File**
A **file** in computing is a collection of data stored on a disk or other storage medium. It allows data to be permanently stored and retrieved when needed.

### **Key Points**:
- A file is used for storing data in a non-volatile medium (e.g., hard drive, SSD).
- Files can be text or binary.
- C++ provides classes and functions to handle file operations like reading and writing.

---

## **2. File Handling in C++**
File handling in C++ is done using the **fstream** library, which provides classes for creating, reading, and writing files.

### **Classes for File Handling**:
| Class      | Description                                  |
|------------|----------------------------------------------|
| `ifstream` | Input file stream for reading from files.    |
| `ofstream` | Output file stream for writing to files.     |
| `fstream`  | File stream for both reading and writing.    |

### **Including File Handling Library**:
To use file handling in C++, include the `<fstream>` header:
```cpp
#include <fstream>
```

---

## **3. Reading and Writing Operations in Files**

### **a. Writing to a File**
The `ofstream` or `fstream` class is used to write data into a file.

#### **Example**:
```cpp
#include <iostream>
#include <fstream> // Required for file handling
using namespace std;

int main() {
    ofstream outFile("example.txt"); // Open a file for writing

    if (!outFile) {
        cout << "File could not be opened." << endl;
        return 1;
    }

    outFile << "Hello, File Handling in C++!" << endl;
    outFile << "Writing data into the file." << endl;

    outFile.close(); // Close the file
    cout << "Data written to file successfully." << endl;

    return 0;
}
```

### **b. Reading from a File**
The `ifstream` or `fstream` class is used to read data from a file.

#### **Example**:
```cpp
#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ifstream inFile("example.txt"); // Open a file for reading

    if (!inFile) {
        cout << "File could not be opened." << endl;
        return 1;
    }

    string line;
    while (getline(inFile, line)) { // Read line by line
        cout << line << endl;
    }

    inFile.close(); // Close the file
    return 0;
}
```

### **c. Reading and Writing with `fstream`**
The `fstream` class can be used for both reading and writing operations.

#### **Example**:
```cpp
#include <iostream>
#include <fstream>
using namespace std;

int main() {
    fstream file("example.txt", ios::in | ios::out | ios::app); // Open file for reading and appending

    if (!file) {
        cout << "File could not be opened." << endl;
        return 1;
    }

    // Write to the file
    file << "Appending new data to the file." << endl;

    // Read from the file
    file.seekg(0); // Move the pointer to the beginning for reading
    string line;
    while (getline(file, line)) {
        cout << line << endl;
    }

    file.close(); // Close the file
    return 0;
}
```

---

## **4. Common File Modes**
When opening files, you can specify modes to determine how the file is accessed.

| Mode         | Description                          |
|--------------|--------------------------------------|
| `ios::in`    | Open for reading.                   |
| `ios::out`   | Open for writing.                   |
| `ios::app`   | Open for appending.                 |
| `ios::trunc` | Truncate the file if it exists.     |
| `ios::binary`| Open file in binary mode.           |

### **Example**: Open a file in multiple modes
```cpp
fstream file("example.txt", ios::in | ios::out | ios::binary);
```

---

# Templates in C++

## **1. Introduction to Templates**
Templates in C++ allow writing generic and reusable code that works with different data types. Templates are widely used in cases where the same logic needs to operate on various data types without duplicating the code.

### **Key Features**:
- Code reusability.
- Type safety.
- Supports both functions and classes.

### **Types of Templates**:
1. **Function Templates**: For creating generic functions.
2. **Class Templates**: For creating generic classes.

---

## **2. Function Templates**
Function templates allow defining a single function that can operate on different data types.

### **Syntax**
```cpp
template <typename T>
returnType functionName(T parameter1, T parameter2) {
    // Function logic
}
```

### **Example**: Function Template
```cpp
#include <iostream>
using namespace std;

template <typename T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << "Sum of integers: " << add(5, 10) << endl;
    cout << "Sum of doubles: " << add(3.14, 2.71) << endl;
    return 0;
}
```

### **Multiple Template Parameters**
You can define functions with multiple template parameters.

#### Example:
```cpp
#include <iostream>
using namespace std;

template <typename T, typename U>
void display(T a, U b) {
    cout << "First: " << a << ", Second: " << b << endl;
}

int main() {
    display(10, "Hello");
    display(3.14, 42);
    return 0;
}
```

---

## **3. Class Templates**
Class templates allow creating generic classes that work with different data types.

### **Syntax**
```cpp
template <typename T>
class ClassName {
    T data;
public:
    ClassName(T value) : data(value) {}
    void display() {
        cout << data << endl;
    }
};
```

### **Example**: Class Template
```cpp
#include <iostream>
using namespace std;

template <typename T>
class Box {
    T data;
public:
    Box(T value) : data(value) {}
    void display() {
        cout << "Box contains: " << data << endl;
    }
};

int main() {
    Box<int> intBox(123);
    Box<string> strBox("Templates in C++");

    intBox.display();
    strBox.display();

    return 0;
}
```

### **Class Template with Multiple Parameters**
Templates can also take multiple type parameters.

#### Example:
```cpp
#include <iostream>
using namespace std;

template <typename T, typename U>
class Pair {
    T first;
    U second;
public:
    Pair(T a, U b) : first(a), second(b) {}
    void display() {
        cout << "First: " << first << ", Second: " << second << endl;
    }
};

int main() {
    Pair<int, string> p(1, "One");
    Pair<double, char> q(3.14, 'A');

    p.display();
    q.display();

    return 0;
}
```

---

### **Specialization of Class Templates**
Class templates can be specialized for specific types when the general template logic needs modification.

#### Example:
```cpp
#include <iostream>
using namespace std;

// Generic template
template <typename T>
class Calculator {
public:
    T add(T a, T b) {
        return a + b;
    }
};

// Specialized template for strings
template <>
class Calculator<string> {
public:
    string add(string a, string b) {
        return a + " " + b;
    }
};

int main() {
    Calculator<int> intCalc;
    Calculator<string> strCalc;

    cout << "Integer addition: " << intCalc.add(10, 20) << endl;
    cout << "String concatenation: " << strCalc.add("Hello", "World") << endl;

    return 0;
}
```

---

# STL and RTTI in C++

## **1. Introduction to the C++ Standard Library**
The **C++ Standard Library (STL)** is a collection of pre-written classes and functions for data structures, algorithms, and iterators. STL is designed to provide reusable and efficient components to simplify development.

### **Components of the C++ Standard Library**:
1. **Containers**: Data structures like `vector`, `list`, `map`, and `queue`.
2. **Algorithms**: Functions for searching, sorting, etc.
3. **Iterators**: Objects for accessing elements in containers.

---

## **2. Working with Stack, Vector, Queue, and Map**

### **a. Stack**
A stack is a container adapter that works on the **Last In, First Out (LIFO)** principle.

#### **Functions in Stack**:
| Function       | Description                   |
|----------------|-------------------------------|
| `push()`       | Adds an element to the stack. |
| `pop()`        | Removes the top element.      |
| `top()`        | Accesses the top element.     |
| `empty()`      | Checks if the stack is empty. |
| `size()`       | Returns the number of elements in the stack. |

#### **Example**:
```cpp
#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    s.push(10);
    s.push(20);
    s.push(30);

    cout << "Top element: " << s.top() << endl;
    s.pop();  // 30
    cout << "After pop, top element: " << s.top() << endl; //20

    return 0;
}
```

---

### **b. Vector**
A `vector` is a dynamic array that can grow and shrink in size.

#### **Functions in Vector**:
| Function       | Description                                   |
|----------------|-----------------------------------------------|
| `push_back()`  | Adds an element to the end.                  |
| `pop_back()`   | Removes the last element.                    |
| `size()`       | Returns the number of elements.              |
| `at()`         | Accesses an element at a specific position.  |
| `begin()`/`end()` | Returns iterators to the start and end.     |

#### **Example**:
```cpp
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {1, 2, 3, 4};
    v.push_back(5);

    cout << "Vector elements: ";
    for (int i : v) {
        cout << i << " ";
    }
    cout << endl;

    v.pop_back();
    cout << "After pop_back: ";
    for (int i : v) {
        cout << i << " ";
    }

    return 0;
}
```

---

### **c. Queue**
A queue is a container adapter that works on the **First In, First Out (FIFO)** principle.

#### **Functions in Queue**:
| Function       | Description                    |
|----------------|--------------------------------|
| `push()`       | Adds an element to the queue.  |
| `pop()`        | Removes the front element.     |
| `front()`      | Accesses the front element.    |
| `back()`       | Accesses the last element.     |
| `empty()`      | Checks if the queue is empty.  |
| `size()`       | Returns the number of elements.|

#### **Example**:
```cpp
#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    q.push(10);
    q.push(20);
    q.push(30);

    cout << "Front element: " << q.front() << endl;
    q.pop();
    cout << "After pop, front element: " << q.front() << endl;

    return 0;
}
```

---

### **d. Map**
A `map` is an associative container that stores key-value pairs, where each key is unique.

#### **Functions in Map**:
| Function       | Description                                   |
|----------------|-----------------------------------------------|
| `insert()`     | Inserts a key-value pair.                    |
| `erase()`      | Removes an element by key.                   |
| `find()`       | Searches for an element by key.              |
| `size()`       | Returns the number of elements.              |
| `[]` operator  | Accesses or modifies the value of a key.     |

#### **Example**:
```cpp
#include <iostream>
#include <map>
using namespace std;

int main() {
    map<string, int> m;
    m["Alice"] = 25;
    m["Bob"] = 30;
    m.insert({"Charlie", 35});

    for (auto &pair : m) {
        cout << pair.first << ": " << pair.second << endl;
    }

    return 0;
}
```

---

## **3. Introduction to RTTI (Run-Time Type Information)**
Run-Time Type Information (RTTI) in C++ allows identifying the type of an object during runtime. It is primarily used with polymorphism to ensure type safety.

### **Key Features**:
- Requires at least one virtual function in the base class.
- Provides operators like `typeid` and `dynamic_cast`.

### **RTTI Operators**:

#### **a. `typeid`**
- Used to retrieve the type information of an object.
- Returns a reference to a `std::type_info` object.

#### **Example**:
```cpp
#include <iostream>
#include <typeinfo>
using namespace std;

class Base {};
class Derived : public Base {};

int main() {
    Base *b = new Derived;
    cout << "Type of object: " << typeid(*b).name() << endl;

    delete b;
    return 0;
}
```

#### **b. `dynamic_cast`**
- Used for safe downcasting in polymorphic hierarchies.
- Returns `nullptr` if the cast is invalid.

#### **Example**:
```cpp
#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() {}
};

class Derived : public Base {
public:
    void display() { cout << "Derived class" << endl; }
};

int main() {
    Base *b = new Derived;
    Derived *d = dynamic_cast<Derived *>(b);

    if (d) {
        d->display();
    } else {
        cout << "Invalid cast" << endl;
    }

    delete b;
    return 0;
}
```

---
