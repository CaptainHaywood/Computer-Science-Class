package asteroids;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;

public class Asteroids extends PApplet {

    float playerX = 500;
    float playerY = 500;
    float playerYSpeed = 0;
    float playerXSpeed = 0;
    boolean left, right, up, down, brake, shield, hyperspace;

    int score;
    double energy = 1000;
    double maxEnergy = 1000;

    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<Bullet> bullets = new ArrayList<Bullet>();

    float enemySpeed = 1f;
    float bulletSpeed = 10;
    float spawnRate = 300;


    public static void main(String[] args) {
        PApplet.main("asteroids.Asteroids");
    }

    public void settings() {
        size(1000, 1000);
    }

    public void setup() {

        }

    public void increaseDifficulty() {
        if (frameCount % spawnRate == 0) {
           generateEnemy();
            if (enemySpeed < 3) {
                enemySpeed += 0.1f;
            }
            if (spawnRate > 50) {
                spawnRate -= 10;
            }
        }
    }

    public void generateEnemy() {
        Random generator = new Random();
        int diceRoll = generator.nextInt(3);
        int side = (int) random(0, 2);
        int side2 = (int) random(0, 2);
        if (side % 2 == 0) { // top and bottom
            enemies.add(new Enemy(random(0, width), height * (side2 % 2), diceRoll));
        } else { // sides
            enemies.add(new Enemy(width * (side2 % 2), random(0, height), diceRoll));
        }
    }

    public void splitLarge(float x, float y){
        Random generator = new Random();
        int rand1 = generator.nextInt(100)+50;
        int rand2 = generator.nextInt(100)+50;
        enemies.add(new Enemy(x+rand1, y+rand2, 1));
        enemies.add(new Enemy(x-rand1, y-rand2, 1));
    }
    public void splitMedium(float x, float y) {
        Random generator = new Random();
        int toSpawn = generator.nextInt(4) + 1;
        //println(toSpawn);
        int num = 0;
        while (num < toSpawn) {
            int rand1 = generator.nextInt(100) + 50;
            int rand2 = generator.nextInt(100) + 50;
            enemies.add(new Enemy(x + rand1, y + rand2, 0));
            num = num + 1;
        }
    }

    public void draw() {
        if (energy != maxEnergy && energy >= 25){
            energy++;
        }
        if (energy < 25){
            energy = energy + 0.25;
        }

        background(0);
        noStroke();
        drawPlayer();
        increaseDifficulty();

        textAlign(CENTER);
        textSize(25);
        text(score, width / 2, 50);
        textSize(15);
        String energyBar = "";
        double energyBars = energy/100;
        double usedEnergy = maxEnergy - energy;
        usedEnergy = usedEnergy/100;
        while (energyBars > 0){
            energyBar = energyBar + "▓";
            energyBars = energyBars - 1;
        }
        while (usedEnergy  > 0){
            energyBar = energyBar + "░";
            usedEnergy = usedEnergy - 1;
        }
        text("Energy: "+energyBar, width / 2, 65);

        for (int b = 0; b < bullets.size(); b++) {
            Bullet bull = bullets.get(b);
            bull.move();
            if (bull.x < 0 || bull.x > width || bull.y < 0 || bull.y > height) {
                bullets.remove(b);
            }
            bull.drawBullet();
        }

        for (int i = 0; i < enemies.size(); i++) {
            Enemy en = enemies.get(i);
            en.move(playerX, playerY);
            en.drawEnemy();
            for (int j = 0; j < bullets.size(); j++) {
                Bullet b = bullets.get(j);
                if (en.size == 0 && abs(b.x - en.x) < 25 && abs(b.y - en.y) < 25){
                    enemies.remove(i);
                    bullets.remove(j);
                    score = score + 100;
                }
                if (en.size == 1 && abs(b.x - en.x) < 50 && abs(b.y - en.y) < 50){
                    splitMedium(en.x, en.y);
                    enemies.remove(i);
                    bullets.remove(j);
                    score = score + 100;
                }
                if (en.size == 2 && abs(b.x - en.x) < 75 && abs(b.y - en.y) < 75){
                    splitLarge(en.x, en.y);
                    enemies.remove(i);
                    bullets.remove(j);
                    score = score + 100;
                }
                break;
            }
            if (abs(playerX - en.x) < 15 && abs(playerY - en.y) < 15 && !shield) {
                println(" game over ");
            }
        }
    }
    public void drawPlayer() {
        //System.out.println(""+playerYSpeed);
        //System.out.println(""+playerXSpeed);

        float x = playerX;
        float y = playerY;

        if (hyperspace && energy > 100){
            float hX =  random(0, width);
            float hY = random (0, height);
            playerX = hX;
            playerY = hY;
            hyperspace = false;
            energy = energy - 100;
        }


        if (x > width){
            playerX = -40;
        }
        else if (x < -40){
            playerX = width - 40;
        }

        if (y > height){
            playerY = -40;
        }
        else if (y < -40){
            playerY = height - 40;
        }

        if (up) {
            playerYSpeed++;
            //playerY -= playerYSpeed;
        }
        if (left) {
            playerXSpeed++;
        }
        if (right) {
            playerXSpeed--;
        }
        if (down) {
            playerYSpeed--;
            //playerY += 5;
        }
        if (brake){
            if (playerYSpeed != 0 && playerYSpeed > 0){
                playerYSpeed--;
            }
            if (playerXSpeed != 0 && playerXSpeed > 0){
                playerXSpeed--;
            }
            if (playerYSpeed != 0 && playerYSpeed < 0){
                playerYSpeed++;
            }
            if (playerXSpeed != 0 && playerXSpeed < 0){
                playerXSpeed++;
            }
        }

        if (playerXSpeed > 15){
            playerXSpeed = 15;
        }
        else if (playerXSpeed < -15){
            playerXSpeed = -15;
        }

        if (playerYSpeed > 15){
            playerYSpeed = 15;
        }
        else if (playerYSpeed < -15){
            playerYSpeed = -15;
        }

        if (playerYSpeed > 0){
            playerY -= playerYSpeed;
        }
        else if (playerYSpeed < 0){
            playerY -= playerYSpeed;
        }
        if (playerXSpeed > 0) {
            playerX -= playerXSpeed;
        }
        else if (playerXSpeed < 0){
            playerX -= playerXSpeed;
        }

        fill(0, 230, 172);
        rectMode(CENTER);
        playerX = constrain(playerX, -50, width + 50);
        playerY = constrain(playerY, -50, height + 50);
        circle(playerX, playerY, 30);
        if (shield && energy > 25){
            noFill();
            energy = energy - 10;
            stroke(0,230,172);
            circle(playerX, playerY, 40);
            noStroke();
        }
    }


    public void mousePressed() {
        float dx = mouseX - playerX;
        float dy = mouseY - playerY;
        float angle = atan2(dy, dx);
        float vx = bulletSpeed * cos(angle);
        float vy = bulletSpeed * sin(angle);
        if (energy > 0 && !shield){
            bullets.add(new Bullet(playerX, playerY, vx, vy));
            energy = energy-30;
        }

    }

    public void keyPressed() {
        if (key == 'w') {
            up = true;
        }
        if (key == 'a') {
            left = true;
        }
        if (key == 's') {
            down = true;
        }
        if (key == 'd') {
            right = true;
        }
        if (key == 32){
            brake = true;
        }
        if (key == 'q'){
            shield = true;
        }
        if (key == 'e'){
            hyperspace = true;
        }
    }

    public void keyReleased() {
        if (key == 'w') {
            up = false;
        }
        if (key == 'a') {
            left = false;
        }
        if (key == 's') {
            down = false;
        }
        if (key == 'd') {
            right = false;
        }
        if (key == 32){
            brake = false;
        }
        if (key == 'q'){
            shield = false;
        }
    }

    class Enemy {

        float x, y, vx, vy;

        int size = 0;

        Enemy(float x, float y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
        }

        public void drawEnemy() {
            rectMode(CENTER);
            fill(255, 102, 102);
            if (size == 0){
                rect(x, y, 25, 25);
            }
            if (size == 1){
                rect(x, y, 50, 50);
            }
            if (size == 2){
                rect(x, y, 75, 75);
            }
        }

        public void move(float px, float py) {
            float angle = atan2(py - y, px - x);
            vx = cos(angle);
            vy = sin(angle);
            x += vx * enemySpeed;
            y += vy * enemySpeed;
        }
    }

    class Bullet {
        float x, y, vx, vy;

        Bullet(float x, float y, float vx, float vy) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
        }

        void drawBullet() {
            fill(0, 255, 0);
            ellipse(x, y, 10, 10);
        }
        void move() {
            x += vx;
            y += vy;
        }
    }
}