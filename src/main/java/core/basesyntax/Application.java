package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        for (int i = 0; i < 3; i++) {
            System.out.println(supplier.getRandomColor());
            Random random = new Random();
            int value = random.nextInt(7);
            System.out.println(" " + value);
        }
    }
}
