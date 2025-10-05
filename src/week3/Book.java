package week3;

public class Book {
    private String title, author;
    private int price;
    Book(){
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayBookDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
        System.out.println("__________________");
    }

    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("JAVA","Reshma",500);
        b1.displayBookDetails();
        b2.displayBookDetails();
    }

}
