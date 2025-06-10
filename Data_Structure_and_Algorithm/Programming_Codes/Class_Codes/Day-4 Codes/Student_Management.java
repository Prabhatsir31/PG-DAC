import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String gender;
    private String contact;
    private int year;
    private String branch;

    public Student(int rollNo, String name, String gender, String contact, int year, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.year = year;
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" +
               "Roll No   : " + rollNo + "\n" +
               "Name      : " + name + "\n" +
               "Gender    : " + gender + "\n" +
               "Contact   : " + contact + "\n" +
               "Year      : " + year + "\n" +
               "Branch    : " + branch + "\n" +
               "-----------------------------";
    }
}

public class Student_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<>();

        while (true) {
            System.out.println("\n---- Student Menu ----");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student by Roll No");
            System.out.println("3. Delete Student by Roll No");
            System.out.println("4. Search Student by Roll No");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int stu = sc.nextInt();
            sc.nextLine(); 

            switch (stu) {
                case 1 -> {
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    Student student = new Student(rollNo, name, gender, contact, year, branch);
                    list.add(student);
                    System.out.println("Student added successfully.");
                }
                case 2 -> {
                    System.out.print("Enter Roll No to update: ");
                    int rollNoUpdate = sc.nextInt();
                    sc.nextLine();
                    boolean updated = false;
                    for (Student s : list) {
                        if (s.getRollNo() == rollNoUpdate) {
                            System.out.print("------Enter update Record------\n");
                            System.out.print("Enter Name: ");
                            String newName = sc.nextLine();
                            System.out.print("Enter Geder: ");
                            String newGender = sc.nextLine();
                            System.out.print("Enter Contact: ");
                            String newContact = sc.nextLine();
                            System.out.print("Enter Year: ");
                            int newYear = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Branch: ");
                            String newBranch = sc.nextLine();

                            s.setName(newName);
                            s.setGender(newGender);
                            s.setContact(newContact);
                            s.setYear(newYear);
                            s.setBranch(newBranch);

                            System.out.println("Student updated successfully.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student with Roll No " + rollNoUpdate + " not found.");
                    }
                }

                case 3 -> {
                    System.out.print("Enter Roll No to delete: ");
                    int rollNoDelete = sc.nextInt();
                    sc.nextLine();
                    boolean removed = false;
                    Iterator<Student> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        Student s = iterator.next();
                        if (s.getRollNo() == rollNoDelete) {
                            iterator.remove();
                            System.out.println("Student deleted successfully.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student with Roll No " + rollNoDelete + " not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Roll No to search: ");
                    int rollNoSearch = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.getRollNo() == rollNoSearch) {
                            System.out.println("Student found:\n" + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with Roll No " + rollNoSearch + " not found.");
                    }
                }

                case 5 -> {
                    if (list.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("\n All Students:");
                        for (Student s : list) {
                            System.out.println(s);
                        }
                    }
                }
                
                case 6 -> {
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
