package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();
    private int numberOfBall = random.nextInt(99);
    private String color = randomColor.getRandomColor();

    public Ball getRandomBall() {
        return new Ball(color, numberOfBall);
    }
}
