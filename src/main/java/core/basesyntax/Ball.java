package core.basesyntax;

public class Ball {
    private Colours colour;
    private int number;

    public Ball(Colours colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    public String toString() {
        return "Colour - " + colour + " Number - " + number;
    }

}
