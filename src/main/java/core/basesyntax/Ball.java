package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number,String color) {
        this.number = number;
        this.color = color;
    }

    public Ball() {
    }

    @Override
    public String toString() {
        return "Number: " + number
                + ", color: " + color;
    }
}
