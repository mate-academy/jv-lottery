package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {
    }

    @Override
    public String toString() {
        return "Ball{"
                + "colour='"
                + color
                + '\''
                + ", number="
                + number
                + '}';
    }

    public String getColour() {
        return color;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
