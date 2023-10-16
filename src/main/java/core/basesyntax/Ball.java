package core.basesyntax;

public class Ball {
    private static String color;
    private static int number;

    public static void setColor(String color) {
        Ball.color = color;
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
