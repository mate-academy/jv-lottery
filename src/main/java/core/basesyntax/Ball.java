package core.basesyntax;

public class Ball {
    public final Colors color;
    public final int number;
    private final ColorSupplier colorSupply = new ColorSupplier();

    Ball(int number) {
        this.color = colorSupply.getRandomColor();
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
