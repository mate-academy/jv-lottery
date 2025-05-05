package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

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

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
