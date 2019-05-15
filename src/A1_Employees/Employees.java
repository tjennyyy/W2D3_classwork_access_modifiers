package A1_Employees;

public class Employees {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int salary;

    public Employees (String name, String surname, int yearOfBirth, int salary){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String getName (){
        return name;
    }

    public void setName (String newName) {
        name = newName;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String newSurname){
        surname = newSurname;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int newYearOfBirth){
        yearOfBirth = newYearOfBirth;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }


}
