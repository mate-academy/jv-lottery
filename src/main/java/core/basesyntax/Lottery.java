package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int range = 100;
    private Random number = new Random();
    private ColorSupplier color = new ColorSupplier();

    public int getRange() {
        return range;
    }

    public Random getNumber() {
        return number;
    }

    public void setNumber(Random number) {
        this.number = number;
    }

    public ColorSupplier getColor() {
        return color;
    }

    public void setColor(ColorSupplier color) {
        this.color = color;
    }

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), number.nextInt(range));
    }
}
