package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String toString() {
        return "Ball number: " + number + "\nBall color: " + color;
    }

    public Ball(int number, String color) {
        this.color = color;
        this. number = number;
    }
}
