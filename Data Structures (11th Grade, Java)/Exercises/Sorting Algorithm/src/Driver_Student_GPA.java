import java.util.ArrayList;
import java.util.Collections;

public class Driver_Student_GPA {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sophia", "Davison", 3.8));
        students.add(new Student("Jack", "Miller", 0.0));
        students.add(new Student("Vanessa", "Xiao", 4.0));
        students.add(new Student("James", "Haywood", 3.75));
        students.add(new Student("Jim", "Holden", 3.2));
        students.add(new Student("Naomi", "Nagata", 3.9));
        students.add(new Student("Amos", "Burton", 2.5));
        students.add(new Student("Alex", "Kamal", 2.8));
        students.add(new Student("Chrisjen", "Avasarala", 3.65));
        students.add(new Student("Roberta", "Draper", 2.6));
        String list = "";
        for(int i = 0; i < students.size(); i++){
            Student hold = students.get(i);
            list = list + "\n" + hold.getFirstName() + " " + hold.getLastName() + " - " + hold.getGPA();
        }
        System.out.println(list);
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < students.size() - 1; i++){
                if(students.get(i).getGPA() > students.get(i+1).getGPA()){
                    Student hold = students.get(i);
                    students.set(i, students.get(i+1));
                    students.set(i+1, hold);
                    sorted = false;
                }
            }
        }
        list = "";
        for(int i = 0; i < students.size(); i++){
            Student hold = students.get(i);
            list = list + "\n" + hold.getFirstName() + " " + hold.getLastName() + " - " + hold.getGPA();
        }
        System.out.println(list);
    }
}
