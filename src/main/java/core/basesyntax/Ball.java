package core.basesyntax;

public class Ball {
    private int number;
    private Colors color;

    public Ball(int number, Colors color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}
