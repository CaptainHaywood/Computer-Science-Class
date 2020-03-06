import java.util.Random;

public class Passenger {
    int start;
    int end;
    int loc;
    char status;

    public Passenger(){
        start = getRandomNumberInRange(1,25);
        loc = start;
        status = 'W';
        end = getRandomNumberInRange(start, 30);
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    public int getLoc(){return loc;}

    public void setLoc(int toSet){loc = toSet;}

    public char getStatus(){
        return status;
    }

    public void setStatus(char toSet){
        status = toSet;
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
