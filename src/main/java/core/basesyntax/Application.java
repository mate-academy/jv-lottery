package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        System.out.println(firstBall.name());
        System.out.println(secondBall.name());
        System.out.println(thirdBall.name());
    }
}
