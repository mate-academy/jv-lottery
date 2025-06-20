package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

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

    public enum Colors {
        White,
        Black,
        Red,
        Yellow,
        Green,
        Brown,
        Orange
    }

    public Ball() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        number = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Ball number is: " + number + " and Ball color is: " + color;
    }
}
