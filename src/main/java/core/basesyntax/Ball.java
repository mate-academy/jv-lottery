package core.basesyntax;

public class Ball {
    private static String color;

    private static int number;

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
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
