package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
