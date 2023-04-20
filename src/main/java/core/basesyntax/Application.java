package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ballone = lottery.getRandomBall();
        Ball balltwo = lottery.getRandomBall();
        Ball ballthree = lottery.getRandomBall();

        System.out.println(ballone);
        System.out.println(balltwo);
        System.out.println(ballthree);

        // create three balls using class Lottery and print information about them in console
    }
}
