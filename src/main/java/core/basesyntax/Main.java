package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];

        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println("Ball " + (i + 1) + " created: " + balls[i]);
        }
    }
}
