package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball b1 = Lottery.getRandomBall();
        Ball b2 = Lottery.getRandomBall();
        Ball b3 = Lottery.getRandomBall();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
