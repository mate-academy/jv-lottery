package core.basesyntax;

public class Ball {
    private final String colour;
    private final int number;

    public Ball(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "The colour of the Ball is " + colour + ".\n"
                + "Number on the Ball is" + printedNumber;
    }
}
