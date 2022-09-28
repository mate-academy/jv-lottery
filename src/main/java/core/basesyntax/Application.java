package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] balls = {new Lottery(), new Lottery(), new Lottery()};

        for (Lottery ball:
                balls) {
            System.out.println(ball.getRandomBall());
        }
    }
}
