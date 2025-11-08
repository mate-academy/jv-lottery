package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("--- Starting the Lottery Draw ---");

        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }

        System.out.println("--- Lottery Draw Finished ---");
    }
}