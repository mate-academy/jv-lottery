package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 1; i < 4; i++) {
            System.out.println(new Lottery().getRandomBall().toString());
        }
    }
}
