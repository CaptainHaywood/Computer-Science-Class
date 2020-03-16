public class Driver {
    public static void main(String[] args) {
        Employee em1 = new Employee("Dilbert", 250000);
        Manager m1 = new Manager("Pointy Hair", 300000, "Engineering");
        Executive e1 = new Executive("Catbert", 350000, "Human Resources", 1000000);

        System.out.println(em1.employeeToString());
        System.out.println(m1.managerToString());
        System.out.println(e1.executiveToString());
    }
}
