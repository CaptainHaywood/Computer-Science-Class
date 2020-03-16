public class Driver {
    public static void main(String[] args) {
        Person p1 = new Person("Bob", 2003);
        Instructor i1 = new Instructor("Joe", 1990, 50000);
        Student s1 = new Student("Abigail", 2004, "Computer Science");

        System.out.println(p1.personToString());
        System.out.println(i1.instructorToString());
        System.out.println(s1.studentToString());
    }

}
