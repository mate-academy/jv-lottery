package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int iterations = 3; //How many times you want to play lottery
        Ball[] balls = new Ball[iterations];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = Lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
