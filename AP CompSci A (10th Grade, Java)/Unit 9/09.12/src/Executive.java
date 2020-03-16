public class Executive extends  Manager{

    private int SpendingBudget;

    public Executive(String nameIn, int salaryIn, String deptIn, int budgetIn) {
        super(nameIn, salaryIn, deptIn);
        SpendingBudget = budgetIn;
    }

    public String executiveToString(){
        return getName() + ", " + getDepartment() + ", " + getSalary() + ", " + SpendingBudget;
    }
}
