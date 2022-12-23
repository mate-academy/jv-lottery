package core.basesyntax;

public class Ball extends ColorSupplier {

    private int number;
    private String color;
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

    public Ball(String color,int number) {
        setColor(color);
        setNumber(number);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number="
                + getNumber() + ", color='"
                + getColor() + '\'' + '}';
    }
}
