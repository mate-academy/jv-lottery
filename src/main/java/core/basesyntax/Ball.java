package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String newColor, int newNumber) {
        this.color = newColor;
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return "Color is " + color + ", number is " + number;
    }
}
