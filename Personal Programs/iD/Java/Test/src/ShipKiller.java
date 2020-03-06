public class ShipKiller
{
    public static void main(String[] args) {
        int playersStrength = 35;
        int shipHP = 35;
        boolean hasRailgun = true;

        if (playersStrength > shipHP){
            System.out.println("You defeated the ship!");
        }
        else if (hasRailgun){
            System.out.println("You're not strong enough to defeat the enemy ship. However, you remember your keel-mounted railgun and use it to rip them in two.");
        }
        else{
            System.out.println("The ship defeated you!");
        }
    }
}
