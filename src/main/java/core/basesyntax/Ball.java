package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + getColor()
                + '\'' + ", number=" + getNumber() + '}';
    }
}
