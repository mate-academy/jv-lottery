package core.basesyntax.lotteryball;

public class Ball {
    //No accuse out lottery package group
    protected String ballColor;
    protected int ballNumber;

    @Override
    public String toString() {
        return "And ball is " + ballColor + " and number is " + ballNumber + ".We have a WINNER";
    }
}
