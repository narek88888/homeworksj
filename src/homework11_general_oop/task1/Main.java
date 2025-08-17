package homework11_general_oop.task1;

/*
Create a real world 5 object of Book.
Create two libraries and add 3 books in the first and 3 books in the second
 library in a main method from another class in the same package.
 */

public class Main {

    public static void main(String[] args){





        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 20);
        Book book2 = new Book("1984", "George Orwell", 10);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 18);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 50);
        Book book5 = new Book("To Kill A Mockingbird", "Harper Lee", 14);
        Book book6 = new Book("Samvel", "Rafi", 25);

        Libary libary1 = new Libary("American libary");
        Libary libary2 = new Libary("British libary");

        libary1.addBook(book1);
        libary1.addBook(book2);
        libary1.addBook(book3);

        libary2.addBook(book4);
        libary2.addBook(book5);
        libary2.addBook(book6);


       libary2.showBooks();
       libary1.showBooks();

       book1.setPrice(50);
        System.out.println(book1.getPrice());





    }


}
