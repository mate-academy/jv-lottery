package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;
        Lottery[] balls = new Lottery[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }
    }
}
