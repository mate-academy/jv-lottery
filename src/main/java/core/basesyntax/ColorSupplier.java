package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Lotterey lotterey = new Lotterey();
        return lotterey.getColor();
    }

    class Lotterey {
        private final Random random = new Random();
        private final int index = random.nextInt(Colors.values().length);
        private final Colors color = Colors.values()[index];

        public String getColor() {
            return color.name();
        }
    }
}
