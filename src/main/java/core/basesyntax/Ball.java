package core.basesyntax;

public class Ball {
    private Сolors color;
    private int number;

    public void setColor(Сolors color) {
        this.color = color;
    }

    public Сolors getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball " + number + " with " + color + " color".toString();
    }
}
