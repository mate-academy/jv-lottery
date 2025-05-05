package core.basesyntax;

public class Application {
    private static final int LOTTERY_START_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < LOTTERY_START_NUMBER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
