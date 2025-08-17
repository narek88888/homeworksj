package homework11_general_oop.task1;


/*
1.Create a class Book with fields: title, author, price.
Make fields private.
Add a constructor, getters, and setters.

Create a class Library with:
 A protected field libraryName
A private book array
 A public method addBook()
 A default method showBooks()

Create a real world 5 object of Book.
Create two libraries and add 3 books in the first and 3 books in the second
 library in a main method from another class in the same package.
 */


public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(int price){
        if(price >= 10){
            this.price = price;
        }
    }






}