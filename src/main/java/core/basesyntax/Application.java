package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lot1 = new Lottery();
        System.out.println(lot1.getRandomBall());
    }
}
