public class Manager extends Employee {

    private String department;

    public Manager(String nameIn, int salaryIn, String deptIn) {
        super(nameIn, salaryIn);
        department = deptIn;
    }

    public String getDepartment(){return department;}

    public String managerToString(){
        return getName() + ", " + department + ", " + getSalary();
    }
}
