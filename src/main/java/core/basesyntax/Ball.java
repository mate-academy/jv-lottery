package core.basesyntax;

public class Ball {
    int number;
    Color color;

    public static String toString(int number, Color color) {
        return String.valueOf(number) + " " + String.valueOf(color);
    }
}
