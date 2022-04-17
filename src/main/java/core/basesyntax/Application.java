package core.basesyntax;

public class Application {
    private static final int numOfBalls = 3;

    public static void main(String[] args) {
        Lottery randomBalls = new Lottery();
        for (int i = 0; i < numOfBalls; i++) {
            System.out.println(randomBalls.getRundomBall());
        }
    }
}
