package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] lotteries = {new Lottery(), new Lottery(), new Lottery()};
        for (Lottery lottery: lotteries) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
