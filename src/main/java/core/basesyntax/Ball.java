package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNum(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public int getNum() {
        return number;
    }
    @Override
    public String toString() {
        return "Ball{color = " + getColor()
                + ", number = " + getNum() + "}";
    }
}
