package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

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
                + "color='" + getColor() + '\''
                + ", number=" + getNumber()
                + '}';
    }

}
