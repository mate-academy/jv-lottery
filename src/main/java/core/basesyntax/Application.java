package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery first = new Lottery();
        Lottery second = new Lottery();
        Lottery third = new Lottery();
        System.out.println(first.getRandomBall());
        System.out.println(second.getRandomBall());
        System.out.println(third.getRandomBall());
    }
}
