package core.basesyntax;

public class Application {
    public static final int MAX_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAX_NUMBER; i++) {
            Ball ball1 = lottery.getRandomBall();
            System.out.println(ball1);
        }
    }
}
