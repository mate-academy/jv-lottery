package core.basesyntax;

public class Application {

    public static final int NUMBER_OF_BALLS_TO_GENERATE = 694200;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < NUMBER_OF_BALLS_TO_GENERATE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
