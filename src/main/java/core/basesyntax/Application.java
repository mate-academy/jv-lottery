package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int ballCount = 3;
        Lottery lottery = new Lottery();

        for (int i = 0; i < ballCount; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
