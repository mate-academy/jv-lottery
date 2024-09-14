package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball1 = new Lottery();

        System.out.println(ball1.getRandomBall());
        System.out.println(ball1.getRandomBall());
        System.out.println(ball1.getRandomBall());
        // create three balls using class Lottery and print information about them in console
    }
}
