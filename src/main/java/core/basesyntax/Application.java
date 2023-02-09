package core.basesyntax;

public class Application {
    static final int countOfBalls = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < countOfBalls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
