package core.basesyntax;

public class Application {
    private static final int LOTTERY_BALL = 3;

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[LOTTERY_BALL];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            Ball ball = lottery[i].getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
