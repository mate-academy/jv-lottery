package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery lot = new Lottery();
        Ball[] balls = new Ball[]{lot.getRandomBall(), lot.getRandomBall(), lot.getRandomBall()};

        for (Ball ball : balls) {
            System.out.println(ball);
        }

    }

}
