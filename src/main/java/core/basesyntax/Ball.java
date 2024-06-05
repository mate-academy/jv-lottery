package core.basesyntax;

public class Ball {
    private ColorSupplier.Colors color;
    private int number;

    public Ball(ColorSupplier.Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public ColorSupplier.Colors getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = number;
    }

    public String toString() {
        return "Ball{color='" + color + "', number=" + number + "}";
    }
}
