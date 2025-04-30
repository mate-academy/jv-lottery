package core.basesyntax;

public class Ball {
    private String colour;
    private int number;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Colour: "
                + this.colour
                + ", "
                + "Number: "
                + this.number;
    }
}
