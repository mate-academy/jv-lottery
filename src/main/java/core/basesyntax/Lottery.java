package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        String color = getRandomColor();
        Random random = new Random();
        int value = random.nextInt(100);
        return new Ball(color, value);
    }
}
