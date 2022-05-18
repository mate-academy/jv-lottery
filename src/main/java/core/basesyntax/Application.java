package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lotery1 = new Lottery();
        Ball firstBall = lotery1.getRandomBall();
        Ball secondBall = lotery1.getRandomBall();
        Ball thirdBall = lotery1.getRandomBall();
        System.out.println("Lets guess three BALLS, are you ready? \nGo.....");
        System.out.println(firstBall.toString());
        System.out.println(secondBall.toString());
        System.out.println(thirdBall.toString());
        System.out.println("\nDid you win you billion?");
    }
}
