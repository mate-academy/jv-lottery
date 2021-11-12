package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public void getRandomBall() {
        Random random = new Random();
        int numb = random.nextInt(100);
        ColorSupplier a = new ColorSupplier();
        String col = a.getRandomColor();
        System.out.println(toString(col,numb));

    }
}
