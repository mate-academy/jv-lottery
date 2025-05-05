package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball " + getNumber() + " color " + getColor();
    }
}
