package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall);
        }
    }
}
