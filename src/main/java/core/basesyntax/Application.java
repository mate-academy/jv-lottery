package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        ColorSupplier randColor = new ColorSupplier();
        Random randInt = new Random();

        System.out.println(Lottery.getRandomBall(randColor.getRandomColor(), randInt.nextInt(100)));
        System.out.println(Lottery.getRandomBall(randColor.getRandomColor(), randInt.nextInt(100)));
        System.out.println(Lottery.getRandomBall(randColor.getRandomColor(), randInt.nextInt(100)));
    }
}
