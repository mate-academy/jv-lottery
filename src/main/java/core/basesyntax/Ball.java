package core.basesyntax;

public class Ball {
    private Color color;
    private int number;
    private String enumValue;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball's color is " + color + " " + "ball's number is " + number + "\n";
    }

    public enum Color {
        RED,
        YELLOW,
        GREEN,
        BLUE
    }
}
