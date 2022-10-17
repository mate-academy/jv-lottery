package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lot = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; ++i) {
            balls[i] = lot.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
