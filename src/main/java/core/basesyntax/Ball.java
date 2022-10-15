package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public static String toString(int number, Color color) {
        return String.valueOf(number) + " " + String.valueOf(color);
    }
}
