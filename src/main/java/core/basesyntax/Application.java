package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball = new Lottery();
        System.out.println("First ball: " + ball.getRandomBall(new Ball()));
        System.out.println("Second ball: " + ball.getRandomBall(new Ball()));
        System.out.println("Third ball: " + ball.getRandomBall(new Ball()));
    }
}
