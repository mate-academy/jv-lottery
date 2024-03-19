package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        this.color = colorSupplier.getRandomColor();
        this.number = randomNumber.nextInt(101);
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

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
