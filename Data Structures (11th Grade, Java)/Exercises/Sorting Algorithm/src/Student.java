public class Student implements Comparable {
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

    public String toString(){
        return "\n" + firstName + " " + lastName + " - " + GPA;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        if(GPA < s.GPA){
            return -1;
        } else if (GPA > s.GPA) {
            return 1;
        }
        else{
            return 0;
        }
        }
    }
