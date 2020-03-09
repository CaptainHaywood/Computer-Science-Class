public class Bug {
    
    int pos;
    Boolean direc; //true for posi, false for neg
    
    public Bug(int initialPosition){
        pos = initialPosition;
        direc = true;
    }
    
    public void turn(){
        if (direc == true){
            direc = false;
        }
        else{
            direc = true;
        }    
    }
    
    public void move(){
        if (direc == true){
            pos++;
        }
        else{
            pos--;
        }
    }
    
    public int getPosition(){
        return pos;
    }
}