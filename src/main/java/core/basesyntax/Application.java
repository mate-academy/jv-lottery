package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int maxNumber = 101;
        Lottery lottery = new Lottery(maxNumber);

        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
