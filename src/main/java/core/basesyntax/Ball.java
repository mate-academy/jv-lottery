package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(int number, Colors color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}
