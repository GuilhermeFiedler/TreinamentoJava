package ExerciciosConceituais.constructor;
/*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.*/
public class Book {
    String title;
    String author;
    double price;

    public Book(){
        this.title = "não informado";
        this.author = "não informado";
        this.price = 0.00;
    };

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0.00;

    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Harry Potter", "J.K Rowling");
        Book book3 = new Book("Crônicas de Gelo e Fogo", "George", 55.99 );

        System.out.println(book1.title + ", " +book1.author + ", " + book1.price);
        System.out.println(book2.title + ", " +book2.author + ", " + book2.price);
        System.out.println(book3.title + ", " + book3.author + ", " + book3.price);
    }
}



