package core.basesyntax;

public class Ball {
    private int number;
    private String colour;

    public Ball(int number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    public String toString() {
        return "Ball number: " + this.number + " Ball colour: " + this.colour;
    }
}
