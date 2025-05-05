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

    public String getColor() {
        return color.toString();
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Ball : " + getColor() + (" ") + getNumber();
    }
}
