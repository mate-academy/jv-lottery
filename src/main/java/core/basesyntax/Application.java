package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
    }
    public void createBall() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getRandomBall().toString());
        }
    }
}
