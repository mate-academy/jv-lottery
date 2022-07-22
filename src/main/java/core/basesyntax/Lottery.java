package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        Color color = Color.values()[random.nextInt(Color.values().length)];
        return new Ball(value, color);
    }
}
