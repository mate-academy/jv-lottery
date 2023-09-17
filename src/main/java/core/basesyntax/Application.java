package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Loterry loterry = new Loterry();
        Ball ball = loterry.getRandomBall();

        for (int i = 0; i < 3; i++) {
            System.out.println("Random ball color: " + ball.getRandomColor());
            System.out.println("Random ball number: " + ball.getRandomNumber());
            System.out.println("");
        }
    }
}
