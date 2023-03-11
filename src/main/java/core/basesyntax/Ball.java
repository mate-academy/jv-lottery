package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    @Override
    public String toString() {
        return "The ball number " + getNumber() + " with color "
                + getColor();
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
