package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "And we have " + color + " ball, its number = " + number + ".";
    }
}
