package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private static String color = getRandomColor();
    private static int number = new Random().nextInt(100);

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return toString();
    }
}
