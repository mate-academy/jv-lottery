package core.basesyntax;

import java.util.Random;

public class Lottery {
    public int getRandomBall() {
        Random random = new Random();
        int randomNumberOfBall = random.nextInt(100);
        return randomNumberOfBall;
    }
}
