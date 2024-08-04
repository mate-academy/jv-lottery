package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        int amountBalls = 3;
        for (int i = 0; i < amountBalls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
