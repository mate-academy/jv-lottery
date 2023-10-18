package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] threeBalls = new Ball[3];

        for (int i = 0; i < threeBalls.length; i++) {
            threeBalls[i] = Lottery.getRandomBall();
        }

        for (Ball ball : threeBalls) {
            System.out.println(ball.toString());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
