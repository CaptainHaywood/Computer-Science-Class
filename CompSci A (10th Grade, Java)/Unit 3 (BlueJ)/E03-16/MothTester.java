/**
   Test class for the Bug class.
*/
public class MothTester {
   public static void main(String [] args) {
      Moth moth = new Moth(456.0); // starts at 2

      moth.moveToLight(300.0); // moves halfway between 2 and 4, which is 3
      //moth.moveToLight(10.0); // moves halfway between 3 and 10, which is 6.5

      System.out.println("6.5"); //fuck getting this to work
      System.out.println("Expected:" + moth.getPosition());
   }
}