package ExerciciosConceituais.constructor;
/*Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.*/

public class Student {
    private int studentId;
    private String studentName;
    private double grade;

    public Student(){
        this(0, "Sem nome", 0.00);
    }

    public Student(int studentId, String studentName, double grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Estudante 1: " + student1.studentId +", " + student1.studentName +", " + student1.grade);
        Student student2 = new Student(1,"Bot", 5.5);
        System.out.println("Estudante 2: " + student2.studentId +", " + student2.studentName +", " + student2.grade);
    }
}

