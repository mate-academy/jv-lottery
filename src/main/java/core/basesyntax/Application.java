package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int amountsOfBalls = 3;
        for (int i = 0; i < amountsOfBalls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
