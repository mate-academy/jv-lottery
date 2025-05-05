package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        //Ball ball1 = new Ball();
        //Ball ball2 = new Ball();
        //Ball ball3 = new Ball();
        //Lottery ball2 = new Lottery();
        //Lottery ball3 = new Lottery();

        Lottery lottery = new Lottery();

        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }

        System.out.println("Ball1: " + balls[0] + "\nBall2: " + balls[1] + "\nBall3: " + balls[2]);
        // create three balls using class Lottery and print information about them in console
    }
}
