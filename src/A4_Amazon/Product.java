package A4_Amazon;

public interface Product {

    String name = "";
    String description = "";
    double price = 0.0;
/*
    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }*/
    String toString();

    String getProductDescription();

}
