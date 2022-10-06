package core.basesyntax;

public class Application {
    private static final int lotteryCount = 3;

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery [lotteryCount];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            System.out.println(lottery[i].getRandomBall());
        }
    }
}
