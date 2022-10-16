package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ballExample = new Lottery();

        String[] balls = new String[3];
        for (String ball:balls) {
            ball = ballExample.getRandomBall().toString();
            System.out.println(ball);
        }
    }
}
