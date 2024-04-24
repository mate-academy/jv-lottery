package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Ball[] result = callBall(balls);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Ball " + (i + 1) + ": " + result[i]);
        }

    }

    public static Ball[] callBall(Ball[] ball) {
        Ball[] result = new Ball[ball.length];
        for (int i = 0; i < ball.length; i++) {
            result[i] = Lottery.getRandomBall();
        }
        return result;
    }

}
