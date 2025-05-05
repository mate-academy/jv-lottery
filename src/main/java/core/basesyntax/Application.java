package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0;i < 3;i++) {
            Lottery ball = new Lottery();
            System.out.println(ball.getRandomBall());

        }
    }
}
