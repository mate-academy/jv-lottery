package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ballGenerateOne = lottery.getRandomBall();
        Ball ballGenerateTwo = lottery.getRandomBall();
        Ball ballGenerateThree = lottery.getRandomBall();
        System.out.println(ballGenerateOne.toString());
        System.out.println(ballGenerateTwo.toString());
        System.out.println(ballGenerateThree.toString());
    }
}
