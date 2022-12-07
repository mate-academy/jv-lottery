package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        firstBall.getRandomBall().getColor();
        firstBall.getRandomBall().getNumber();

        Lottery secondBall = new Lottery();
        secondBall.getRandomBall().getColor();
        secondBall.getRandomBall().getNumber();

        Lottery thirdBall = new Lottery();
        thirdBall.getRandomBall().getColor();
        thirdBall.getRandomBall().getNumber();

        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
    }
}
