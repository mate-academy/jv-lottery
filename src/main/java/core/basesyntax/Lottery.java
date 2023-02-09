package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Random random = new Random();
    public String getRandomBall() {
        random.nextInt(100);
    }
}
