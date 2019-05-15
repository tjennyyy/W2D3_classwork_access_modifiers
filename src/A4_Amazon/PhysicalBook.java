package A4_Amazon;

public class PhysicalBook implements Book {
    private String name, description, author, isbn;
    private int weight;
    private double price;

    public PhysicalBook(String name, String description, double price, String author, String isbn, int weight){
        this.name = name;
        this.description = description;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
        this.weight = weight;
    }
    @Override
    public String toString(){
        String data = String.format("%20s%n" + "%s%n" +"price: " + "%-10.2f" + "%-20s" + "ISBN: " + "%-15s" +"weight in g: " + "%-10d%n" ,
                this.name, this.description, this.price, this.author, this.isbn, this.weight);
        return data;
    }
    @Override
    public String getProductDescription(){
        return this.description;
    }
}
