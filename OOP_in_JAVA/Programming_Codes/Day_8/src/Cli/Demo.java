package Cli;

import DEVE.*;

public class Demo {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 16); // This will throw an exception
            System.out.println(person);
        } catch (VotingNotAllowedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}