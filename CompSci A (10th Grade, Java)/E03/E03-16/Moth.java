/**
   This class models a moth that flies along a straight line toward
   a light source.
*/
public class Moth {
   private double position;

   
  
  
   public Moth(double initialPosition) {
      position = initialPosition;
   }

   /**
      Moves the moth halfway to the light source.
     @param lightPosition the light position
   */
   public void moveToLight(double lightPosition) {
      if (lightPosition > position){
          double finalPos = lightPosition - position;
          finalPos = finalPos / 2;
          position = position + finalPos;
      }
      if (lightPosition < position){
          double finalPos = position - lightPosition;
          finalPos = finalPos / 2;
          position = position - finalPos;
      }
   }

   /**
      Gets the current position of this moth.
      @return the position
   */
   public double getPosition() {
      return position;
   }
}