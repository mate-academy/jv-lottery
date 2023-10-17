package core.basesyntax;

public class Ball {
    private final ColorSupplier color = new ColorSupplier();
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color.getRandomColor() + '\''
                + ", number=" + number
                + '}';
    }
}
