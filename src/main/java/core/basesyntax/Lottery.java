package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;
    private Random number = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public void setColor(ColorSupplier randomColor) {
        this.randomColor = randomColor;
    }

    public ColorSupplier getColor() {
        return randomColor;
    }

    public Ball getRandomBall() {
        String color = randomColor.getRandomColor();
        int number = this.number.nextInt(BOUND);
        return new Ball(color, number);
    }

}
