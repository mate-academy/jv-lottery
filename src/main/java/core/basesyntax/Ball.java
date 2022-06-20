package core.basesyntax;

public class Ball extends Lottery {
    private String color;
    private int number;

    public Ball() {

    }

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "number: " + getNumber() + ", color: " + getColor();
    }
}
