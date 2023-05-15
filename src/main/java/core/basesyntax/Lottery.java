package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random RANDOM = new Random();
        Color color = ColorSupplier.getRandomColor();
        int number = RANDOM.nextInt(100);
        return new Ball(color, number);
    }
}
