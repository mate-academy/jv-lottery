package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i < 4; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.printf("Ball #%s = %s%n", i, ball);
        }
    }
}
