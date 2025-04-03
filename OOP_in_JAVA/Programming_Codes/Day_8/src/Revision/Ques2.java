/*
Define a class Sample with member variable “char ch” and a parameterized constructor. Create some 
instances(at least 2) of this class by passing any alphabet.  Now achieve following tasks:

a) when you print the reference it should be display the character which was passed during instantiation.
b) if two instances have same character or an alphabet, their "equals()" should return true and obviously 
"hashCode()" also should be same.


*/
package Revision;

class Sample {
    private char ch;

    public Sample(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return Character.toString(ch);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        Sample sample = (Sample) obj;
        return ch == sample.ch;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(ch);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Sample sample1 = new Sample('A');
        Sample sample2 = new Sample('B');
        Sample sample3 = new Sample('A');

        System.out.println(sample1);
        System.out.println(sample2);
        System.out.println(sample3);

        System.out.println("sample1 equals sample2: " + sample1.equals(sample2));
        System.out.println("sample1 equals sample3: " + sample1.equals(sample3));

        System.out.println("sample1 hashCode: " + sample1.hashCode());
        System.out.println("sample3 hashCode: " + sample3.hashCode());
    }
}
