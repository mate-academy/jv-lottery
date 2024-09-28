package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery;
        for (int i = 0; i < 3; i++) {
            lottery = new Lottery();
            System.out.println(lottery.getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
