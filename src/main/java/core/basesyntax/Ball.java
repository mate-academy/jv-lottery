package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Color ballColor, int ballNumber) {
    }

    @Override
    public String toString() {
        return "color: " + color + "number: " + number;
    }
}
