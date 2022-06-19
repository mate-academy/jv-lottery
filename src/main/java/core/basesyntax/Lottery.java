package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier randColor = new ColorSupplier();
        Random num = new Random();
        int random = num.nextInt(100);
        Ball bead = new Ball();
        bead.setColor(randColor.getRandomColor().toString());
        bead.setNumber(random);

        return bead.getColor() + " " + bead.getNumber();
    }
}
