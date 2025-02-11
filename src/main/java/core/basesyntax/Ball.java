package core.basesyntax;

public class Ball {
    private static final int MAX_RANDOM_VALUE = 100; // Константи мають бути статичними
    private final int number;
    private final String color;

    public Ball() {
        this.number = (int) (Math.random() * MAX_RANDOM_VALUE) + 1;
        ColorSupplier supplier = new ColorSupplier();
        this.color = supplier.getRandomColor();
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }
}
