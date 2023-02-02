package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = {Lottery.getRandomBall(), Lottery.getRandomBall(), Lottery.getRandomBall()};
        for (Ball ball: balls) {
            System.out.println(ball.toString());
        }
    }
}
