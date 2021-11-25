package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Lottery lottery = new Lottery();
            System.out.println(lottery.getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
