package core.basesyntax;

public class Ball {
    int number;
    Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "The ball number is " + color.value + number + ColorSupplier.RESET;
    }
}
