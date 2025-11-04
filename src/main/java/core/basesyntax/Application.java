package core.basesyntax;

public class Application {
    private static final int THE_NUMBER_BALLS_TO_CREATE = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < THE_NUMBER_BALLS_TO_CREATE; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall);
        }
    }
}
