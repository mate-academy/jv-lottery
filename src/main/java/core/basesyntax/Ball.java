package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return "Ball: "
                + "color - " + getColor() + " |||"
                + " number - " + getNumber();
    }
}


