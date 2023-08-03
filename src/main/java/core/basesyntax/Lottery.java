package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MAX_RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public int getMAX_RANDOM_NUMBER() {
        return MAX_RANDOM_NUMBER;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number = new Random().nextInt(MAX_RANDOM_NUMBER) + 1;

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
