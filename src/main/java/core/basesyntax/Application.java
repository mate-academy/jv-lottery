package core.basesyntax;

public class Application {
    public static final int LOTTERY_SIZE = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < LOTTERY_SIZE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
