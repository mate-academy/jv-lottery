package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = ColorSupplier.getRandomColor();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        Random randomNumber = new Random();
        this.number = randomNumber.nextInt(100);
    }

    public String toString() {
        return "it's " + getColor() + " " + getNumber() + " ball";
    }

}
