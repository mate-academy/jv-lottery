package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        System.out.println("First " + lottery.getRandomBall());
        System.out.println("Second " + lottery.getRandomBall());
        System.out.println("Third " + lottery.getRandomBall());
    }
}
