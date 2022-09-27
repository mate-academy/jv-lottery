package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        // creating three balls using class Lottery and printing information about them in console
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery.getRandomBall());
    }
}
