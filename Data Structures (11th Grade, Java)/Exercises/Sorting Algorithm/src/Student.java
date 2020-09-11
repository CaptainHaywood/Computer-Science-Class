public class Student {
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String first, String last, double GradePoint){
        firstName = first;
        lastName = last;
        GPA = GradePoint;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getGPA(){
        return GPA;
    }
}
