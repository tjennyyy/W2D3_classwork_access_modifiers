package A2_DogPark;

public class Dog {

    private String ownerName;
    private int yearOfBirth;
    private String behavior;

    public Dog(String ownerName, int yearOfBirth, String behavior){
        this.ownerName = ownerName;
        this.yearOfBirth = yearOfBirth;
        this.behavior = behavior;
    }

    public String getOwnerName() {
        return ownerName;
    }

        public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }




}
