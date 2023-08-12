package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstRandomBall = lottery.getRandomBall();
        Ball secondRandomBall = lottery.getRandomBall();
        Ball thirdRandomBall = lottery.getRandomBall();
        System.out.println(firstRandomBall + "\n" + secondRandomBall + "\n" + thirdRandomBall);
    }
}
