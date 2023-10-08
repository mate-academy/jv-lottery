package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstBall = new Lottery().getRandomBall();
        Ball secondBall = new Lottery().getRandomBall();
        Ball thirdBall = new Lottery().getRandomBall();

        System.out.println(firstBall.toString()
                + "\n"
                + secondBall.toString()
                + "\n"
                + thirdBall.toString());
    }
}
