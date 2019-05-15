package A3_Student;

public class A3_Main_ClassStudent {

    public static void main(String[] args) {

        ClassStudent clS1 = new ClassStudent("John", "Doe", 2005, "3b");
        ClassStudent clS2 = new ClassStudent("Joanna", "Doe", 2005, "3a");
        ClassStudent clS3 = new ClassStudent("Mario", "Smith", 2004, "4a");
        ClassStudent clS4 = new ClassStudent("Maria", "Smith", 2004, "4a");
        ClassStudent clS5 = new ClassStudent("Lisa", "Tal", 2003, "2a");
       // System.out.println(clS1.getFirstname() + " " + clS1.getLastname() + "" + " is born " + clS1.getYearOfBirth() + " is now " + clS1.getAge() + " old"+ " and goes to class " + clS1.getClassNumber());


        ClassStudent[] students = {clS1, clS2, clS3, clS4, clS5};

        students[0].printData();


        for (int i = 0; i < students.length; i++){
            students[i].printData();

        }

    }
}

// String[] arrayStudent = new String[5];
//        arrayStudent[0] = "John, Doe, 2005, 3b";
//        arrayStudent[1] = "Joanna, Doe, 2005, 3a";
//        arrayStudent[2] = "Mario, Smith, 2006, 4b";
//        arrayStudent[3] = "Maria, Smith, 2006, 4a";
//        arrayStudent[4] = "Lisa, Tal, 2004, 2b";
//        arrayStudent[5] = "Louis, Tal, 2004, 2a";