package core.basesyntax;

public class Ball {
    private String ballColor;
    private int ballNumber;

    Ball(String ballColor, int ballNumber) {
        this.ballColor = ballColor;
        this.ballNumber = ballNumber;
    }

    public String toString() {
        return ballColor.toString() + " " + ballNumber;
    }
}
