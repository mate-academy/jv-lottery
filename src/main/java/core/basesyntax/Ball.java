package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Ball #" + getNumber()
                + " with color " + getColor();
    }
}
