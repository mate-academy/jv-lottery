package core.basesyntax;

import java.util.Random;

public class Ball {

    public static final int AMOUNT = 100;
    private static String color;

    private static int number;

    public Ball() {
        color = ColorSupplier.getRandomColor();
        number = new Random().nextInt(Ball.AMOUNT);
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Ball.color = color;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Ball.number = number;
    }

    @Override
    public String toString() {
        return " №" + number + "; Color-" + color + ";";
    }
}
