package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Ball color is " + this.getColor() + ", number is " + this.getNumber();
    }
}
