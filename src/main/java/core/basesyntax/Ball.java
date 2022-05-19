package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return "color: " + getColor() + ", number: " + getNumber();
    }
}
