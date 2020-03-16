public class Instructor extends Person{

    private int salary;

    public Instructor(String nameIn, int DoBIn, int salaryIn) {
        super(nameIn, DoBIn);
        salary = salaryIn;
    }

    public int salaryToString(){
        return salary;
    }

    public String instructorToString(){
        return nameToString() + ", " + dobToString() + ", " + salary;
    }
}
