package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball b1 = new Lottery().getRandomBall();
        Ball b2 = new Lottery().getRandomBall();
        Ball b3 = new Lottery().getRandomBall();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
