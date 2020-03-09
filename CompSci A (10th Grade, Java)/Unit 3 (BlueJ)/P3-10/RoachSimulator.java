public class RoachSimulator{
    public static void main(String[] args){
        RoachPopulation colony = new RoachPopulation(10);
        System.out.println("Roaches: " + colony.getRoaches());
        colony.breed();
        colony.spray(10);
        System.out.println("Roaches: " + colony.getRoaches());
        
        colony.breed();
        colony.spray(10);
        System.out.println("Roaches: " + colony.getRoaches());
        
        colony.breed();
        colony.spray(10);
        System.out.println("Roaches: " + colony.getRoaches());
    }
}