package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        int number = random.nextInt(100);

        return new Ball(color.name(), number);
    }
}
