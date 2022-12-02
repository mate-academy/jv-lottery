package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setRandomColor() {
        this.color = getRandomColor();
    }

    public int getNumber() {
        return number;
    }

    public void setRandomNumber() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "color: " + getColor() + " number: " + getNumber();
    }
}
