package core.basesyntax;

public class Ball {
    private Colour colour;
    private int number;

    public Ball(Colour colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    public String toString() {
        return "Colour - " + colour + " Number - " + number;
    }
}
