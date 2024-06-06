package core.basesyntax;

public class Lottery extends Ball {
    private Ball ball;

    public Ball getRandomBall() {
        ball = new Ball();
        getRandomNumber();
        System.out.println(toString());
        return ball;
    }
}
