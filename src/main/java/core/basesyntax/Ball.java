package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball's color is " + color + " "
                + "ball's number is " + number + "\n";
    }

    public enum Colors {
        RED,
        YELLOW,
        GREEN,
        BLUE
    }
}
