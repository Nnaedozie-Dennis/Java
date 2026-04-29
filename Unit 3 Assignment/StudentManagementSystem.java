import java.util.Scanner;

public class StudentManagementSystem {

    // Student Class (Instance Variables)
    static class Student {
        private String name;
        private String id;
        private int age;
        private String grade;

        public Student(String name, String id, int age, String grade) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.grade = grade;
        }

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public void display() {
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }


    // Static Variables (Student Storage)
    private static Student[] students = new Student[100];
    private static int totalStudents = 0;


    // Add Student
    public static void addStudent(Scanner input) {
        if (totalStudents >= students.length) {
            System.out.println("Student list is full.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter ID: ");
        String id = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Grade: ");
        String grade = input.nextLine();

        students[totalStudents] = new Student(name, id, age, grade);
        totalStudents++;

        System.out.println("Student added successfully.");
    }
    // Find Student by ID
    public static Student findStudent(String id) {
        for (int i = 0; i < totalStudents; i++) {
            if (students[i].getId().equals(id)) {
                return students[i];
            }
        }
        return null;
    }


    // Update Student
    public static void updateStudent(Scanner input) {
        System.out.print("Enter Student ID to update: ");
        String id = input.nextLine();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Error: Student not found.");
            return;
        }

        System.out.print("Enter New Name: ");
        student.setName(input.nextLine());

        System.out.print("Enter New Age: ");
        student.setAge(input.nextInt());
        input.nextLine();

        System.out.print("Enter New Grade: ");
        student.setGrade(input.nextLine());

        System.out.println("Student updated successfully.");
    }

    // View Student
    public static void viewStudent(Scanner input) {
        System.out.print("Enter Student ID to view: ");
        String id = input.nextLine();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Error: Student not found.");
        } else {
            student.display();
        }
    }


    // Main Menu
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. View Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    updateStudent(input);
                    break;
                case 3:
                    viewStudent(input);
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);

        input.close();
    }
}