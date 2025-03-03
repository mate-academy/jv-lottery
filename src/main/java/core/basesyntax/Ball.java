package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "this is a " + color + " ball with number " + number + " on it";
    }
}
