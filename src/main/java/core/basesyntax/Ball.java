package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {
        color = null;
        number = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Color: " + color + ", number: " + number;
    }
}
