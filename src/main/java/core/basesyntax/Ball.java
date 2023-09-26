package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.setColor(color);
        this.setNumber(number);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + getColor() + '\''
                + ", number=" + getNumber()
                + '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
