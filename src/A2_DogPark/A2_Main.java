package A2_DogPark;

/**
 * Dog park get/set
 *
 * Let’s pretend that we’re at a dog park. There are multiple Dog objects engaging in Dog behaviors, each with different
 * attributes. In regular-speak that means some dogs are running, while some are stretching and some are just watching
 * other dogs. Furthermore, each dog has been named by its owner and, since each dog is living and breathing, each ages.
 *
 * INTERMEDIATE: Create appropriate private variables, setters and getters; it should be done in that way that, once a
 * dog object is created, you can get its year of birth and owner, but you can not change them.
 */

public class A2_Main {

    public static void main(String[] args){
        Dog daisy = new Dog("Annina", 2012, "running");
        Dog valentino = new Dog("Sabine", 2011, "sniffing");
        Dog kira = new Dog("Anna", 2015, "watching");

        System.out.println(daisy.getOwnerName() + "'s dog is born " + daisy.getYearOfBirth() + " and  is " + daisy.getBehavior());
    }
}
