package core.basesyntax;

import java.util.Random;

public class Lottery {
    public final static int MAX_NUMBER = 100;
    public final ColorSupplier colorSupplier = new ColorSupplier();
    public final Random rand = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = rand.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
