package oopcat2;

// Encapsulation: Using private fields and public getter/setter methods
class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Using setter for validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation (grade must be between 0 and 100)
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0; // Default to 0 if invalid input is given
        }
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        // Creating a Student object with valid grade
        Student student1 = new Student("Alice", 85);
        student1.displayStudent();

        // Creating a Student object with an invalid grade (should be set to 0)
        Student student2 = new Student("Bob", 105);
        student2.displayStudent();

        // Updating the grade using the setter method
        student2.setGrade(90);
        student2.displayStudent();
    }
}
