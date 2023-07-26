package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Color color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }

    @Override
    public String toString() {
        return " Ball is " + color + " and has number " + number;
    }
}

