package A3_Student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClassStudent {

    private String firstname;
    private String lastname;
    private int yearOfBirth;
    private int age;
    private String classNumber;

    public ClassStudent(String firstname, String lastname, int yearOfBirth, String classNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        GregorianCalendar actYear = (GregorianCalendar) Calendar.getInstance();
        this.age = (actYear.get(Calendar.YEAR) - yearOfBirth);
        this.classNumber = classNumber;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String newFirstname){
        firstname = newFirstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String newLastName){
        lastname = newLastName;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int newYearOfBirth){
        yearOfBirth = newYearOfBirth;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String getClassNumber(){
        return classNumber;
    }

    public void setClassNumber(String newClassNumber){
        classNumber = newClassNumber;
    }

    public void printData (){
        System.out.println(this.firstname + " " + this.lastname + ", born on " +  this.yearOfBirth + ", age " + this.age + ", goes to class " + this.classNumber);
    }
}
