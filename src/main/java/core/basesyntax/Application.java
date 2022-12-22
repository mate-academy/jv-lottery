package core.basesyntax;

class Application {
    private static final int numberOfBalls = 3;

    static void main(String[] args) {
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery().getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
