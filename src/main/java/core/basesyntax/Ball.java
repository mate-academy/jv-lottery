package core.basesyntax;

public class Ball extends ColorSupplier {
    private int number;
    private String color;

    public Ball(int number, String color) {
        setNumber(number);
        setColor(color);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number="
                + getNumber() + ", color='"
                + getColor() + '\'' + '}';
    }
}
