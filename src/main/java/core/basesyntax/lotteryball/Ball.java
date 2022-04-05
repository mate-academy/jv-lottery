package core.basesyntax.lotteryball;

public class Ball {
    private String ballColor;
    private int ballNumber;

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }


    @Override
    public String toString() {
        return "And ball is " + ballColor + " and number is " + ballNumber + ".We have a WINNER";
    }
}
