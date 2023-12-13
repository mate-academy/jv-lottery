package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        System.out.println("First ball: " + lottery.getRandomBall());
        System.out.println("Second ball: " + lottery.getRandomBall());
        System.out.println("Third ball: " + lottery.getRandomBall());
    }
}
