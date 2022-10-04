package core.basesyntax;

public class Ball {
    private int ball;
    private Color color;

    public int getBall() {

        return ball;
    }

    public void setBall(int ball) {

        this.ball = ball;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "ball=" + ball
                + ", color='" + color + '\''
                + '}';
    }
}
