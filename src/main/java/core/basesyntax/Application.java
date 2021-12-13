package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball1 = new Lottery();

        Lottery ball2 = new Lottery();

        Lottery ball3 = new Lottery();

        System.out.println(ball1.getRandomBall());

        System.out.println(ball2.getRandomBall());

        System.out.println(ball3.getRandomBall());
    }
}
