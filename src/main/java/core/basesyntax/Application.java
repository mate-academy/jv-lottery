package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ballA = new Ball();
        Ball ballB = new Ball();
        Ball ballC = new Ball();

        Lottery lottery = new Lottery();

        lottery.getRandomBall(ballA);
        lottery.getRandomBall(ballB);
        lottery.getRandomBall(ballC);

        System.out.println(ballA);
        System.out.println(ballB);
        System.out.println(ballC);
    }
}
