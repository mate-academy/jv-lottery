package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 3;
        for (int a = 0; a < numberOfBalls; a++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
