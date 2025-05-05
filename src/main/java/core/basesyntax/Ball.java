package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(int ballNumber, String color) {
        this.number = ballNumber;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Color: " + color;
    }

}
