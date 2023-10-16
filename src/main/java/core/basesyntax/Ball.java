package core.basesyntax;

public class Ball {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + colorSupplier.getRandomColor() + '\''
                + ", number=" + number
                + '}';
    }
}
