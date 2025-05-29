/*
create 4 classes A,B,C,D with member functions Afun(),Bfun(),Cfun() and Dfun() respectively.
now define "Demo" class with main function. Inside main function create array of Object class which 
will store instances of above mentioned classes. Traverse through this array and call "Cfun()" of 
class C only.
*/

package Revision;

class A {
    public void Afun() {
        System.out.println("Afun() called from class A");
    }
}

class B {
	public void Bfun() {
		System.out.println("Bfun() called from class B");
	}
}

class C {
	public void Cfun() {
		System.out.println("Cfun() called from class C");
	}
}

class D {
	public void Dfun() {
		System.out.println("Dfun() called from class D");
	}
}

public class Ques3 {
	public static void main(String args[]) {
		Object objects[] = new Object[4];
		
		objects[0] = new A();
		objects[1] = new B();
		objects[2] = new C();
		objects[3] = new D();
		
		for (Object obj : objects) {
            if (obj instanceof C) {  
            	C cInstance = (C) obj; 
                cInstance.Cfun(); 
            	}
			}
		}
	}
