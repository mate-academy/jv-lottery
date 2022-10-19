package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int initialIterrator = 0;
        final int maxQuantityOfLotteries = 3;
        Lottery lottery = new Lottery();
        for (int i = initialIterrator; i < maxQuantityOfLotteries; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
