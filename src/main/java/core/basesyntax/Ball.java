package core.basesyntax;

public class Ball {
    private String ballColor;
    private int ballNumber;

    public String getBallColor() {
        return ballColor;
    }

    public void setBallColor(String ballColor) {
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
        return ballColor;
    }
}
