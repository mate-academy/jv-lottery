package core.basesyntax;

public class Ball {
    private static String color;
    private static int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + "  " + number;
    }
}
