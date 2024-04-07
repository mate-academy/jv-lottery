package core.basesyntax;

public class Ball {

    private final int number;
    private final Color color;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color is " + this.color.toString() + " and the number is " + this.number;
    }
}
