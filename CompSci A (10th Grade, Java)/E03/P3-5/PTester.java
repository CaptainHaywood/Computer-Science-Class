public class PTester {
    public static void main(String[] args){
        Person p1 = new Person("Bob");
        Person p2 = new Person("Sue");
        Person p3 = new Person("Amy");
        
        p1.befriend(p2);
        p1.befriend(p3);
        p1.unfriend(p3);
        p1.unfriend(p2);
        //return p1.getFriendNames().equals("");
    }
}