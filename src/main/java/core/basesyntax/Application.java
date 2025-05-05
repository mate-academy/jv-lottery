package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 3;
        for (int i = 1; i <= numberOfBalls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
