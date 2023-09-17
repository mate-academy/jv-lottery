package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;
    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "This is random color: " + getRandomColor() + "\n" + "This is randoom number: " + getRandomNumber();
    }

    private String getRandomColor() {
        return new ColorSupplier().getRandomColor();
    }

    public int getRandomNumber() {
        return new Random().nextInt(101);
    }
}
