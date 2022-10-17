package core.basesyntax;

public class Ball {
    final private String color;
    final private int number;

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

    @Override
    public String toString() {
        return "Number: " + this.getNumber() + ", Color: " + this.getColor();
    }

}
