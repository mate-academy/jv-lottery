package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Ball[] someBalls = new Ball[NUMBER_OF_BALLS];
        for (int i = 0; i < someBalls.length; i++) {
            System.out.println(someBalls[i] = Lottery.getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
