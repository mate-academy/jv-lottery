package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Win ball number is: " + this.number + " was " + this.color + " color.";

    }

}
