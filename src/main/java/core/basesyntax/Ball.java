package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color.toLowerCase();
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " ball with number: " + number;
    }
}
