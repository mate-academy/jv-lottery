package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

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
        return "Color of the ball: " + color
                + " Number of the ball:" + number;
    }

}
