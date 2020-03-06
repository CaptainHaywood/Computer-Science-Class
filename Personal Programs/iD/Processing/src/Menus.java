import processing.core.PApplet;

public class Menus extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Menus");
    }

    enum GameState {
        MENU,
        RUNNING
    }

    static GameState currentState;

    public void setup() {
        currentState = GameState.MENU;
    }

    public void settings() {
        size(400,400);
    }

    public void draw() {

        switch(currentState){
            case MENU:
                drawMenu();
                break;
            case RUNNING:
                drawRunning();
                break;
        }

    }

    public void mousePressed(){
        if( currentState == GameState.MENU && mouseX > 10 && mouseX < 30 && mouseY > 10 && mouseY < 30){
            currentState = GameState.RUNNING;
        }
    }

    public void drawMenu(){
        clear();
        background(0,0,0);
        rect(10,10, 20,20);
    }

    public void drawRunning(){
        clear();
        background(255,255,255);
    }
}