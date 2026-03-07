package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball randomBall1 = lottery.getRandomBall();
        System.out.println(randomBall1.toString());
        Ball randomBall2 = lottery.getRandomBall();
        System.out.println(randomBall2.toString());
        Ball randomBall3 = lottery.getRandomBall();
        System.out.println(randomBall3.toString());

        // create three balls using class Lottery and print information about them in console
    }
}
