package core.basesyntax;

public class Ball {
    protected final String color;
    protected final int number;
    public Ball (String color, int number) {
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString() {
        return "ball color: " + color + ", " +"ball number: " + number;
    }
}