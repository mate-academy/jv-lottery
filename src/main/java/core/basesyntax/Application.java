package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        System.out.println(firstBall.getRandomBall());
        Lottery secondBall = new Lottery();
        System.out.println(secondBall.getRandomBall());
        Lottery thirdBall = new Lottery();
        System.out.println(thirdBall.getRandomBall());
        // create three balls using class Lottery and print information about them in console
    }
}
