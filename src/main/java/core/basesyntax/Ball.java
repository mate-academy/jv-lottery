package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color colorOfBall, int number) {
        this.color = colorOfBall;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball colorOfBall - "
                + color
                + ", number - "
                + number;
    }
}
