package core.basesyntax;

public class Ball {
    public final String color;
    public final int number;

    Ball(int number) {
        ColorSupplier colorSupply = new ColorSupplier();
        this.color = colorSupply.getRandomColor().toString();
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
