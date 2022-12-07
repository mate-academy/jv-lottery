package core.basesyntax;

public class Application {
    public static void main(String[] args) {
    Lottery lottery = new Lottery();
       Ball ball = lottery.getRandomBall();
       Ball ballOne = lottery.getRandomBall();
       Ball ballTwo = lottery.getRandomBall();

       System.out.println(ball);
       System.out.println(ballOne);
       System.out.println(ballTwo);
    }
}
