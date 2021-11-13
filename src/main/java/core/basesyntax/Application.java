package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery1 = new Lottery();
        Lottery lottery2 = new Lottery();
        Lottery lottery3 = new Lottery();

        System.out.println(lottery1.getRandomBall());
        System.out.println(lottery2.getRandomBall());
        System.out.println(lottery3.getRandomBall());
        // create three balls using class Lottery and print information about them in console
    }
}
