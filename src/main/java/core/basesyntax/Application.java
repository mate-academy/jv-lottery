package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();

        for (int a = 0; a < balls.length; a++) {
            balls[a] = lottery.getRandomBall();
            System.out.println(balls[a]);
        }
    }
}
