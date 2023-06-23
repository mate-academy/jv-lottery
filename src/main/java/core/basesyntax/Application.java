package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ColorSupplier randColor = new ColorSupplier();
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            int random = new Random().nextInt(100);
            System.out.println(lottery.getRandomBall(randColor.getRandomColor(),random));
        }
    }
}
