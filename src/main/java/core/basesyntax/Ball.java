package core.basesyntax;

public class Ball {
    private ColorBol color;
    private int number;

    public Ball(String color, int number) {
        this.color = ColorBol.valueOf(color);
        this.number = number;
    }

    public ColorBol getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
