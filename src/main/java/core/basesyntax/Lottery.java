package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public void setColor(ColorSupplier randomColor) {
        this.colorSupplier = randomColor;
    }

    public ColorSupplier getColor() {
        return colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(BOUND);
        return new Ball(color, number);
    }
}
