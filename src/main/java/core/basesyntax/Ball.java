package core.basesyntax;

public class Ball {
    private final Colors color;
    private final int number;

    public Ball() {
        this.color = new ColorSupplier().getRandomColor();
        this.number = new NumberSupplier().getRandomNumber();
    }

    @Override
    public String toString() {
        return "Ball number is: " + number + "; Ball color is: " + color;
    }
}
