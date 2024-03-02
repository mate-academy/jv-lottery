package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        ColorSupplier firstSupplier = new ColorSupplier();
        ColorSupplier secondSupplier = new ColorSupplier();
        ColorSupplier thirdSupplier = new ColorSupplier();
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();
        System.out.println("The first number is... " + firstSupplier.getRandomColor() + " "
                + firstBall.getRandomBall() + "!");
        System.out.println("The second number is... " + secondSupplier.getRandomColor() + " "
                + secondBall.getRandomBall() + "!");
        System.out.println("The third number is... " + thirdSupplier.getRandomColor() + " "
                + thirdBall.getRandomBall() + "!");

    }
}

