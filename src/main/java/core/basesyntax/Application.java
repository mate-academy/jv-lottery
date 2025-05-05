package core.basesyntax;

public class Application {
    static final int NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i <= NUMBER; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
