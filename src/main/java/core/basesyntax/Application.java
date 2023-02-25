package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int NUMBER_OF_BALLS = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
