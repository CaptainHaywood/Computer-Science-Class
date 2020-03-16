public class Person {
    private String name;
    private int DoB;

    public Person(String nameIn, int DoBIn){
        name = nameIn;
        DoB = DoBIn;
    }

    public String nameToString(){
        return name;
    }

    public int dobToString(){
        return DoB;
    }

    public String personToString(){
        return name + ", " + DoB;
    }

}
