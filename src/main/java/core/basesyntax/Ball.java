package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "The ball number is " + getNumber() + " and color is " + getColor().name();
    }
}
