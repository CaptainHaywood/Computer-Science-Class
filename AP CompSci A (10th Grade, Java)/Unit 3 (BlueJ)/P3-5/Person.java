public class Person {
    
   private String name;
   private String friends = "";
    
   public Person(String nombre){
        name = nombre;
   }
    
   public void befriend(Person p){
        friends = friends + p.getName();
   }
    
   public void unfriend(Person p){
        if (friends.contains(p.getName())){
            friends = friends.replace(p.getName(), "");
        }
    }
    
   public String getName(){
        return name;
     }
    
   public String getFriendNames(){
      return friends;
    }
}