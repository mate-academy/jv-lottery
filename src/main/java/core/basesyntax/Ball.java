package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
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
        return "Color is " + getColor() + ", number is " + getNumber();
    }
}
