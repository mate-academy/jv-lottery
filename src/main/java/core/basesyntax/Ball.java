package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "color " + color + ", number " + number;
    }
}
