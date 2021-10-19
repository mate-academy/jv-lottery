package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] ball = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < ball.length; i++) {
            ball[i] = lottery.getRandomBall();
            System.out.println(ball[i].toString());
        }
    }
}
