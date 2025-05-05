package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
