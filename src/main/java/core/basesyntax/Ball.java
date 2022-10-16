package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public static String toString(int number, Color color) {
        return String.valueOf(number) + " " + color.name();
    }
}
