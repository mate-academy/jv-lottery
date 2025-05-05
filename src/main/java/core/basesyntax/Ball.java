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
        return "Ball color - " + color + "\n"
                + "Ball number - " + number + "\n";
    }
}
