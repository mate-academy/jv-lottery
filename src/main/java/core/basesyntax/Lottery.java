package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        return value;
    }
}

