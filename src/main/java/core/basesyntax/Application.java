package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = new Ball();
        Ball secondBall = new Ball();
        Ball thirdBall = new Ball();
        Ball[] balls = new Ball[] {firstBall, secondBall, thirdBall};
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
