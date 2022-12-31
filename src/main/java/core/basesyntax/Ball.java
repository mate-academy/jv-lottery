package core.basesyntax;

public class Ball {
    private Color ballColor;
    private int ballNumber;

    public Color getBallColor() {
        return ballColor;
    }

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    @Override
    public String toString() {
        StringBuilder ball = new StringBuilder();
        ball.append("Number: ").append(this.ballNumber).append("; Color: ").append(this.ballColor);
        return ball.toString();
    }
}
