package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return getColor() + " " + getNumber();
    }
}
