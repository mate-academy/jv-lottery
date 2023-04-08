package core.basesyntax;

public class Application {
    private static final int maxCount = 3;

    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        for (int i = 0; i < maxCount; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println("Ball " + i + " : " + ball);
        }
    }
}
