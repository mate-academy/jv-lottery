package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery.getRandomBall());
        // create three balls using class Lottery and print information about them in console
    }
}
