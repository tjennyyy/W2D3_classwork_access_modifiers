package A4_Amazon;

public interface Book extends Product {

    String author = "";
    String isbn = "";
    String AAAAAA = "AAAAA";
/*
    public Book(String name, String description, double price, String author, String isbn ){
        super(name, description, price);
        this.author = author;
        this.isbn = isbn;
    }*/
    String toString();

    String getProductDescription();
}
