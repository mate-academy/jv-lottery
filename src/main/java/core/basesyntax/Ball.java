package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public Ball(String colour, int number) {
        this.color = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "colour='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
