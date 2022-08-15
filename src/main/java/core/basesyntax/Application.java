package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();

        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println("Ball #" + i + " was created : " + balls[i].print());

        }

    }
}
