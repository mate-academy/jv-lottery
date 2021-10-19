package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(number + " " + color);
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }
}
