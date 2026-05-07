package core.basesyntax;

public class Ball {
    private BallColor color;
    private int number;

    public BallColor getColor() {
        return color;
    }

    public void setColor(BallColor color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
