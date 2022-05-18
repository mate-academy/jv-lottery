package core.basesyntax;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println(colorSupplier.getRandomColor());
    }
}
