package controleProgramme;

public class Book {
    String title;
    String author;
    int numberOfPages;
    String publisher;

    public void describe() {
        System.out.println(
                "This book author is " + this.author + "." +
                "\nIt's title is " + this.title + ". " +
                "\nIt has " + this.numberOfPages + " pages."
        );
    }

    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.title = "Azerty";
        firstBook.author = "Qwerty";
        firstBook.numberOfPages = 56;
        firstBook.publisher = "AQWZSX";
        firstBook.describe();
    }
}



