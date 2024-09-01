package core.basesyntax;

public class Application {
    public static final int countOfBalls = 4;

    public void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i < countOfBalls; i++) {
            System.out.println("Ball" + i + ": " + lottery.getRandomBall());
        }
    }
}
