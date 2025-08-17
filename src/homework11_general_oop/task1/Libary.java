package homework11_general_oop.task1;

/*
Create a class Library with:
A protected field libraryName
A private book array
A public method addBook()
A default method showBooks()

Create a real world 5 object of Book.
Create two libraries and add 3 books in the first and 3 books in the second
 library in a main method from another class in the same package.
 */


import java.util.Arrays;

public class Libary {

    protected String libaryName;
    private Book[] book;

    public Libary(String libaryName) {
        this.libaryName = libaryName;
        book = new Book[0];

    }

    public void addBook(Book books) {
        Book[] newBook = new Book[book.length + 1];

        for (int i = 0; i < book.length; i++) {
            newBook[i] = book[i];
        }

        newBook[newBook.length - 1] = books;

        book = newBook;

    }

    void showBooks() {
        System.out.println(Arrays.toString(book));
    }

}
