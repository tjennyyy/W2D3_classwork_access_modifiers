package A4_Amazon;

public class eBook implements Book {

    private String name, description, author, isbn;
    private String url;
    private double price;

    public eBook(String name, String description, double price, String author, String isbn, String url){
        this.name = name;
        this.description = description;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
        this.url = url;
        this.name = name;
    }
    @Override
    public String toString(){
        String data = String.format("%20s%n" + "%s%n" +"price: " + "%-10.2f" + "%-20s" + "ISBN: " + "%-15s" +"URL: " + "%-10s%n",
                this.name, this.description, this.price, this.author, this.isbn, this.url);
        return data;
    }
    @Override
    public String getProductDescription(){
        return this.description;
    }
}
