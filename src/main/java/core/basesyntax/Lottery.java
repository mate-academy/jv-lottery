package core.basesyntax;

import java.util.Random;

public class Lottery {
    final static int NUMBERS = 100;
    public int value;
    public String color;
    public Random random = new Random();
    public ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        value = random.nextInt(NUMBERS);
        color = colorSupplier.getRandomColor();
        return new Ball(color, value);
    }
}
