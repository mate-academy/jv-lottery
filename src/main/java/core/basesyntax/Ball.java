package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color randomColor, int number) {
        this.color = randomColor;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
