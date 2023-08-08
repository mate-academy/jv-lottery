package core.basesyntax;

import java.util.Random;

public class Ball {
    private static final int FIGURE_COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(ColorSupplier color) {
        this.color = colorSupplier.getRandomColor();
    }

    public void setNumber() {
        this.number = new Random().nextInt(FIGURE_COUNT);
    }

    @Override
    public String toString() {
        return "Color = " + color + ", number = " + number;
    }
}
