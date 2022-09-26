package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball randomBall1 = lottery.getRandomBall();
        Ball randomBall2 = lottery.getRandomBall();
        Ball randomBall3 = lottery.getRandomBall();
        randomBall1.printBall();
        randomBall2.printBall();
        randomBall3.printBall();

        // create three balls using class Lottery and print information about them in console
    }
}
