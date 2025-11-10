package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        private static final int ballsCount = 3;
        for (int i = 0; i < ballsCount; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
