package core.basesyntax;

import java.util.Random;

public class Lottery {
    protected static Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
