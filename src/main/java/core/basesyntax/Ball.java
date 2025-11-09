package core.basesyntax;

public class Ball {
    private int number;
    private Colors color;

    public Ball() {}

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball: " + color + " number " + number;
    }
}
