package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int countBalls = 3;

        for (int i = 0; i < countBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
