package core.basesyntax;

public class Application {
    static final int BALLS_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= BALLS_AMOUNT; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
