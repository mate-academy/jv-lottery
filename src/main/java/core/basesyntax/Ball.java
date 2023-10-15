package core.basesyntax;

class Ball {
    private ColorSupplier.Colors color;

    private int number;

    public Ball(ColorSupplier.Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "A " + color + " Ball, with a number = " + number;
    }
}
