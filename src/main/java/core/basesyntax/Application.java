package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        for (int counter = 0; counter < balls.length; counter++) {
            balls[counter] = new Lottery().getRandomBall();
            System.out.println(balls[counter]);
        }
    }
}
