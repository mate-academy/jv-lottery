package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier colloSuplier = new ColorSupplier();
        int namber = new Random().nextInt(100);
        return new Ball(colloSuplier.getRandomColor(), namber).toString();
    }
}
