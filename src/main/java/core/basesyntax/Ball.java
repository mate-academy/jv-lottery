package core.basesyntax;

public class Ball {
    private int ballNumber;

    public int getBallNumber() {
        return ballNumber;
    }

    void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String getBallColor() {
        return ballColor;
    }

    void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    private String ballColor;

    @Override
    public String toString() {
        return "Ball{" +
                "number is: " + ballNumber +
                ",color is: " + ballColor + '\'' +
                '}';
    }
}
