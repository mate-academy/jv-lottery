package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball1 = new Lottery();
        Lottery ball2 = new Lottery();
        Lottery ball3 = new Lottery();
        Ball randomBall1 = ball1.getRandomBall();
        Ball randomBall2 = ball2.getRandomBall();
        Ball randomBall3 = ball3.getRandomBall();
        System.out.println(randomBall1.toString());
        System.out.println(randomBall2.toString());
        System.out.println(randomBall3.toString());

    }
}
