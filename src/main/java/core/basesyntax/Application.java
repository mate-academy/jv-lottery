package core.basesyntax;

/**
 * To test the program, in main() method,
 * create three balls using getRandomBall() method from Lottery class.
 * And print information about them in the console.
 */
public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
