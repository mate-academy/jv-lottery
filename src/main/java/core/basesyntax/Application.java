package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();

        System.out.print("First ball color: ");
        System.out.println(firstBall.getRandomBall().color);
        System.out.print("First ball number: ");
        System.out.println(firstBall.getRandomBall().number);
        System.out.println();
        System.out.print("Second ball color: ");
        System.out.println(secondBall.getRandomBall().color);
        System.out.print("Second ball number: ");
        System.out.println(firstBall.getRandomBall().number);
        System.out.println();
        System.out.print("Third ball color: ");
        System.out.println(thirdBall.getRandomBall().color);
        System.out.print("Third ball number: ");
        System.out.println(thirdBall.getRandomBall().number);
    }
}
