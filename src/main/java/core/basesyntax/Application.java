package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] arrayOfBalls = new Ball[3];
        for (Ball ball : arrayOfBalls) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
