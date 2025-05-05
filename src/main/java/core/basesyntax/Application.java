package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i <= 3; i++) {
            Ball ball = lottery.getRandomBall();
            String ballNumber = String.valueOf(ball.getNumber());
            String ballCollor = ball.getColor();
            System.out.println("Ball " + i + " number :" + ballNumber + " color : " + ballCollor);
        }
    }
}
