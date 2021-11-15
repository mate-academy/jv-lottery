package core.basesyntax;

public class Lottery extends Ball {

    public static String getRandomBall() {
        Ball ball = new Lottery();
        return ball.toString();
    }
}