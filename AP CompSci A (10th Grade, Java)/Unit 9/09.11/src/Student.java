public class Student extends Person {

    private String major;

    public Student(String nameIn, int DoBIn, String majorIn) {
        super(nameIn, DoBIn);
        major = majorIn;
    }

    public String majorToString(){
        return major;
    }

    public String studentToString(){
        return nameToString() + ", " + dobToString() + ", " + major;
    }
}
