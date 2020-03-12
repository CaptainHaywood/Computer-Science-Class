public class Driver {
    public static void main(String[] args) {
        int count = 0;
        int strat1 = 0;
        int strat2 = 0;
        boolean generated = false;
        int door1 = 0;
        int door2 = 0;
        int door3 = 0;
        int hostDoor = 0;
        int playerDoor = 0;
        int playerChoice = 0;
        int thirdDoor = 0;
        while (count != 1000) {
            //A DOOR WITH A VALUE OF 3 IS A CAR. 1 AND 2 ARE GOATS
            System.out.println("ITERATION PROGRESS: " + count);
            door1 = getRandomNumber(1, 3);
            door2 = 0;
            door3 = 0;

            generated = false;
            while (!generated) {
                door2 = getRandomNumber(1, 3);
                if (door2 == door1) {
                    generated = false;
                }
                if (door2 != door1) {
                    generated = true;
                }
            }
            generated = false;
            while (!generated) {
                door3 = getRandomNumber(1, 3);
                if (door3 == door1 || door3 == door2) {
                    generated = false;
                }
                if (door3 != door1 && door3 != door2) {
                    generated = true;
                }
            }

            playerDoor = getRandomNumber(1, 3);

            generated = false;
            hostDoor = 0;
            while (!generated) {
                hostDoor = getRandomNumber(1, 3);
                if (hostDoor == 3) {
                    generated = false;
                } else if (hostDoor == playerDoor) {
                    generated = false;
                } else {
                    generated = true;
                }
            }
            playerChoice = getRandomNumber(1, 2);
            if (playerChoice == 1) {
                generated = false;
                while (!generated) {
                    thirdDoor = getRandomNumber(1, 3);
                    if (thirdDoor != playerDoor && thirdDoor != hostDoor) {
                        generated = true;
                    } else {
                        generated = false;
                    }
                    if (thirdDoor == 3) {
                        strat1++;
                    }
                }
            }
            else{
                if(playerDoor == 3){
                    strat2++;
                }
            }
            count++;
        }
        System.out.println("Strat1 wins: " + strat1);
        System.out.println("Strat2 wins: " + strat2);
    }
    private static int getRandomNumber(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
