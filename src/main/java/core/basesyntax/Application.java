package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;

    public static void main(String[] args) {
        Lottery newLottery = new Lottery();

        for (int i = 0; i < NUMBER_OF_USERS; i++) {
            System.out.println(newLottery.getRandomBall());
        }
    }
}
