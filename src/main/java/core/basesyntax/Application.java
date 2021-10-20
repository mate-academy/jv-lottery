package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();
        for (int counter = 0; counter < balls.length; counter++) {
            balls[counter] = lottery.getRandomBall();
            System.out.println(balls[counter]);
        }
    }
}
