package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball() {

    }

    @Override
    public String toString() {
        return "Ball color is " + color + " and ball number is " + number;
    }
}

