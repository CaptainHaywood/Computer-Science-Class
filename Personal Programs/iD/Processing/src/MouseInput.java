import processing.core.PApplet;

public class MouseInput extends PApplet {

    public static void main(String[] args) {
        PApplet.main("MouseInput");
    }

    float boxX = 350;
    float boxY = 250;
    int width = 100;
    int height = 100;
    boolean insideBox = false;

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        background(255,255,255);
    }

    public void draw() {
        background(255, 255, 255);

        if (mouseX > boxX && mouseX < boxX + width && mouseY > boxY && mouseY < boxY + height) {
            fill(0, 0, 0);
            insideBox = true;
        }

        else {
            fill(255, 0, 0);
            insideBox = false;
        }
        rect(boxX, boxY, width, height);
    }

    public void mouseDragged() {
        if(insideBox) {
            boxX = mouseX - width/2;
            boxY = mouseY - height/2;
        }

    }

    public void mousePressed() {

    }

    public void mouseReleased() {

    }
}