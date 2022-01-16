package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        System.out.println("1st " + firstBall.toString());
        System.out.println("2nd " + secondBall.toString());
        System.out.println("3rd " + thirdBall.toString());

    }
}
