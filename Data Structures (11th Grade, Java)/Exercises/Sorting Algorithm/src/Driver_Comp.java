import java.util.ArrayList;
import java.util.Collections;

public class Driver_Comp {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            myList.add(i);
        }

        Collections.shuffle(myList);
        System.out.println(myList);
        sort(myList);
        System.out.println(myList);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sophia", "Davison", 3.8));
        students.add(new Student("Jack", "Miller", 0.0));
        sort(students);

        String s1 = "apple";
        String s2 = "cat";

        if(s1.compareTo(s2) < 0){
            System.out.println("1 lt 2");
        }
        else if(s1.compareTo(s2) > 0){
            System.out.println("1 gt 2");
        }
        else{
            System.out.println("=");
        }
    }
    public static void sort(ArrayList<? extends Comparable> theList){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < theList.size() - 1; i++){
                if(theList.get(i).getGPA() > theList.get(i+1).getGPA()){
                    Object hold = theList.get(i);
                    theList.set(i, theList.get(i+1));
                    theList.set(i+1, hold);
                    sorted = false;
                }
            }
        }
    }
}
