package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(int ballNumber) {
        this.number = ballNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Color: " + color;
    }

}
