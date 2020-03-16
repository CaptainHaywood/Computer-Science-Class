public class Employee {

    private String name;
    private int salary;

    public Employee(String nameIn, int salaryIn){
        name = nameIn;
        salary = salaryIn;
    }

    public String getName(){return name;}

    public int getSalary(){return salary;}

    public String employeeToString(){
        return name + ", " + salary;
    }

}
