package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier COLO = new ColorSupplier();
        for (int i = 0; i < 3; i++) {
            int value = random.nextInt(10);
            System.out.print(COLO.getRandomColor() + " ");
            System.out.println(value);
        }
    }
}
