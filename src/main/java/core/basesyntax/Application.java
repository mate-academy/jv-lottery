package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = Lottery.getBallsAmount();
        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
