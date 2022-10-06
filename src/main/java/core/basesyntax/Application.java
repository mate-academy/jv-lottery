package core.basesyntax;

public class Application {
    private static final int LOTTERY_COUNT = 3;

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery [LOTTERY_COUNT];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            System.out.println(lottery[i].getRandomBall());
        }
    }
}
