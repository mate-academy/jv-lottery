package core.basesyntax;

public class Ball {
    private Color colorOfBall;
    private int number;

    public Ball(Color colorOfBall, int number) {
        this.colorOfBall = colorOfBall;
        this.number = number;
    }

    public Color getColorOfBall() {
        return colorOfBall;
    }

    public void setColorOfBall(Color colorOfBall) {
        this.colorOfBall = colorOfBall;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball: colorOfBall - "
                + colorOfBall
                + ", number - "
                + number;
    }
}

