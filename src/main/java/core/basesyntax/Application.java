package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball [] balls = {null, null, null};
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
