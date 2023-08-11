package core.basesyntax;

public class Ball {
    public String getColour() {
        return colour;
    }

    public int getNumber() {
        return number;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String colour;
    private int number;

    @Override
    public String toString() {
        return "Colour: "
                + this.colour
                + ", "
                + "Number: "
                + this.number;
    }
}
