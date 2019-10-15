public class RoachPopulation{
    
    private double roaches;
    
    public RoachPopulation(int start){
        roaches = start;
    }
    
    public void breed(){
        roaches = roaches * 2;
    }
    
    public void spray(double percent){
        double percentSpray = percent / 100;
        roaches = roaches - (percentSpray * roaches);
    }
    
    public double getRoaches(){
        return roaches;
    }
}