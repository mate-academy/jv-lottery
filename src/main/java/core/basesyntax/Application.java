package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int lottery_count = 3;
        for (int i = 0; i < lottery_count; i++) {
            Lottery lot = new Lottery();
            System.out.println(lot.getRandomBall());
        }
    }
}
