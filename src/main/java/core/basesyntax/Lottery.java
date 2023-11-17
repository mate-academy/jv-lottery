package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
