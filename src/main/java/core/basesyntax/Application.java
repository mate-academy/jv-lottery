package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int amountOfBalls = 3;
        Lottery lottery = new Lottery();

        for (int i = 0; i < amountOfBalls; i++) {
                lottery.getRandomBall();
                System.out.println(new Lottery().getRandomBall());
        }
    }
}
