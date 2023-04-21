package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery firstBall = new Lottery();
        System.out.println("firstBall "
                + firstBall.getRandomBall());

        Lottery secondBall = new Lottery();
        System.out.println("secondBall "
                + secondBall.getRandomBall());

        Lottery thirdBall = new Lottery();
        System.out.println("thirdBall "
                + thirdBall.getRandomBall());
    }
}
