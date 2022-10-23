package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball ball = Lottery.getRandomBall();
            String result = "Ball number " + ball.getNumber() + " " + ball.getColor();
            System.out.println(result);
        }

    }

}
