package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    @Override
    public String toString() {
        return this.color + "   " + this.number;
    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
