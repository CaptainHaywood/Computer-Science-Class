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
        System.out.println(students.get(0).toString());
        System.out.println(students.get(1).toString());
        sort(students);
        System.out.println(students.get(0).toString());
        System.out.println(students.get(1).toString());

        /*String s1 = "apple";
        String s2 = "cat";

        if(s1.compareTo(s2) < 0){
            System.out.println("1 lt 2");
        }
        else if(s1.compareTo(s2) > 0){
            System.out.println("1 gt 2");
        }
        else{
            System.out.println("=");
        }*/
    }
    public static void sort(ArrayList<? extends Comparable> theList){
        for(int i = 0; i < theList.size(); i++){
            Comparable smallest = theList.get(i);
            int place = i;
            for(int j = i; j < theList.size(); j++){
                if(theList.get(j).compareTo(smallest) < 0){
                    smallest = theList.get(j);
                    place  = j;
                }
            }
            Collections.swap(theList, place, i);
        }
    }
}
