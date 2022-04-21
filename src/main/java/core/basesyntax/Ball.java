package core.basesyntax;

public class Ball {
    private String colour;
    private int number;

    public Ball(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball's color: " + colour + "; number: " + number;
    }
}
