package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int numberOfBalls = 3;
        Lottery luckyBall = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(luckyBall.getRandomBall());
        }
    }
}
