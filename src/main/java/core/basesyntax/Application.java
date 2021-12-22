package core.basesyntax;

public class Application {
    //could you check my code again please
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lotteryDraw = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lotteryDraw.getRandomBall();
            System.out.println(balls[i].toString());
        }

    }
}
