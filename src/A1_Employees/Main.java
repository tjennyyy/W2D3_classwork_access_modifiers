package A1_Employees;

public class Main {

    public static void main(String[] args) {

        Employees e1 = new Employees("John", "Doe", 1980, 2500);
        Employees e2 = new Employees("Joanna", "Doe", 1982, 2200);
        System.out.println("Name: " + e1.getName() + " " + "Surname: " + e1.getSurname() + ", " + e1.getYearOfBirth() + ", " + e1.getSalary()+" EUR");
        System.out.println("Name: " + e2.getName() + " " + "Surname: " + e2.getSurname() + ", " + e2.getYearOfBirth() + ", " + e2.getSalary()+" EUR");


    }
}
