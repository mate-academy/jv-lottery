package core.basesyntax;

public class Lottery {
    public void getRandomBall() {
        Ball ball = new Ball();
        ball.setColorNumber();
        System.out.println(ball.toString());
    }
}
