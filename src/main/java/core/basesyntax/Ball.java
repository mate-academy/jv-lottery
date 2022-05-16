package core.basesyntax;

public class Ball {
    private String colour;
    private int number;

    public Ball(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball's color: " + getColour() + "; number: " + getNumber();
    }
}
