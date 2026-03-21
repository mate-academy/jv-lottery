package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private String color = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
