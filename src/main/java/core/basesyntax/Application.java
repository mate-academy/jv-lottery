package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        final int ballCount = 3;
        String[] lotteryResult = new String[ballCount];
        for (int i = 0; i < ballCount; i++) {
            lotteryResult[i] = new Lottery().getRandomBall();
            System.out.println(lotteryResult[i]);
        }
    }
}
