package A4_Amazon;

public class A4_AmazonMain {

    public static void main(String[] args){
        PhysicalBook pb1 = new PhysicalBook("Harry Potter", "A magician, who fights against the evil",
                23.45, "J.K.Rowling", "123578429", 361);
        eBook eb1 = new eBook("City of Glasses", "Shadowhunter fight against daemons",
                16.39, "Cassandra Clare", "47892635", "www.amazon.com/cityOfGlasses");

        System.out.println(pb1.toString());
        System.out.println(eb1.toString());

    }
}
