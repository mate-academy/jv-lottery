package core.basesyntax;

public class Lottery {
    public void getRandomBall() {
        Ball ball = new Ball();
        ball.setColor();
        ball.setNumber();
        System.out.println(ball);
    }
}
