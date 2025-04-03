package DEVE;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws VotingNotAllowedException {
        this.name = name;
        if (age < 18) {
            throw new VotingNotAllowedException("Voting not allowed for age: " + age);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}