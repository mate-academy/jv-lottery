package core.basesyntax;

public class Ball {
    private Color color;
    private byte number;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "color is " + color + " and number is " + number;
    }
}
