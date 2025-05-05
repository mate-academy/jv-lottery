package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[NUMBER_OF_BALLS];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            System.out.println("Ball #" + (i + 1) + lottery[i].getRandomBall().toString());
        }
    }
}
