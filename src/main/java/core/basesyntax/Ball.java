package core.basesyntax;

public class Ball {
    private ColorSupplier.Color color;
    private int number;

    public Ball(ColorSupplier.Color color, int number) {
        this.color = color;
        this.number = number;
    }
    //getter and setter to color
    public ColorSupplier.Color getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }
    //getter and setter to number
    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = number;
    }

    public String toString () {
        return "Ball{color='" + color + "', number=" + number + "}";
    }
}
