package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int amount = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < amount; ++i) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
