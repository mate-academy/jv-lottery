package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery1 = new Lottery();
        Lottery lottery2 = new Lottery();
        Lottery lottery3 = new Lottery();
        lottery1.getRandomBall();
        lottery2.getRandomBall();
        lottery3.getRandomBall();

    }
}
