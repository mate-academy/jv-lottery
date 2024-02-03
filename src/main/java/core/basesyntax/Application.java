package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[3];
        Lotery lotery = new Lotery();
        for (int i = 0; i < 3; i++) {
            balls[i] = lotery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
