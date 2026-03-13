package ExerciciosConceituais.constructor;
//Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.
public class Dog {
    String name;
    String color;


    public Dog() {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Pateta";
        dog.color = "black";

        System.out.println("Nome do cachorro: " + dog.name);
        System.out.println("Cor do Cachorro: " + dog.name);
    }
}