package week4.Inheritance.LibrarySystem;

class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void DisplayBookDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }
}
class TextBook extends Book{
    String subject;
    TextBook(String title, String author, double price , String subject) {
        super(title, author, price);
        this.subject=subject;
    }
    @Override
    void DisplayBookDetails(){
        super.DisplayBookDetails();
        System.out.println("Subject : "+subject);
    }
}
class Magazine extends Book{
    int issueNumber;
    Magazine(String title, String author, double price , int issueNumber) {
        super(title, author, price);
        this.issueNumber=issueNumber;
    }

    @Override
    void DisplayBookDetails() {
        super.DisplayBookDetails();
        System.out.println("issueNumber : "+issueNumber);
    }
}
public class Main {
    public static void main(String[] args) {
        Book[] books={
                new TextBook("JAVA","Reshma",1000,"history of java"),
                new Magazine("Tech Today","Kowsalya",150,10)
        };
        for (Book b:books){
            b.DisplayBookDetails();
            System.out.println("------------------------");
        }
    }
}
