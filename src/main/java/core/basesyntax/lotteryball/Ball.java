package core.basesyntax.lotteryball;

public class Ball {
    String ballColor;
    int ballNumber;

    @Override
    public String toString() {
        return "And ball is " + ballColor + " and number is " + ballNumber + ".We have a WINNER";
    }
}
