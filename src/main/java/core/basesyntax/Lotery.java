package core.basesyntax;

import java.util.Random;

public class Lotery {
    public static int getRandomBall() {
        Random randBall = new Random();
        int num = randBall.nextInt(100);
        return num;
    }
}
