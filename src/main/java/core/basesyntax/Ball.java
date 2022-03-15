package core.basesyntax;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public Ball(String color, int number) {
        color = this.color;
        number = this.number;
    }

    @Override
    public String toString() {
        return color + "  " + Integer.toString(number);
    }
}
