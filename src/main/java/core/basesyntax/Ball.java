package core.basesyntax;

public class Ball {
    private int number;
    private String colour;

    public Ball(int number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Ball number: " + number + " Ball colour: " + colour;
    }
}
