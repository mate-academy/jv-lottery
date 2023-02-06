package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    @Override
    public String toString() {
        return "Boll color: " + color + ", boll number:" + number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
